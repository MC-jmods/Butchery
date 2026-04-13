package net.mcreator.butchery.client.renderer.block;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.butchery.procedures.WitherConditionProcedure;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.wither_carcassAnimation;
import net.mcreator.butchery.client.model.Modelwither;
import net.mcreator.butchery.block.entity.WithercarcassBlockEntity;
import net.mcreator.butchery.block.WithercarcassBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class WithercarcassRenderer implements BlockEntityRenderer<WithercarcassBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	WithercarcassRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelwither.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/wither.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(WithercarcassBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
		blockEntity.animationState0.animateWhen(WitherConditionProcedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
	}

	@Override
	public void render(WithercarcassBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight, Vec3 cameraPos) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(WithercarcassBlock.FACING);
		switch (facing) {
			case NORTH -> {
			}
			case EAST -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
			case WEST -> poseStack.mulPose(Axis.YP.rotationDegrees(-90));
			case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
		}
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, renderState);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.WITHER_CARCASS.get(), WithercarcassRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelwither {
		private final KeyframeAnimation keyframeAnimation0;

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = wither_carcassAnimation.shrink.bake(root);
		}

		public void setupBlockEntityAnim(WithercarcassBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(blockEntity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}