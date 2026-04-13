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

import net.mcreator.butchery.procedures.Snifferanimationcondition2Procedure;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_idleAnimation;
import net.mcreator.butchery.client.model.Modelsniffer_carcass;
import net.mcreator.butchery.block.entity.SniffercarcassblockBlockEntity;
import net.mcreator.butchery.block.SniffercarcassblockBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class SniffercarcassblockRenderer implements BlockEntityRenderer<SniffercarcassblockBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	SniffercarcassblockRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelsniffer_carcass.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/sniffer.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(SniffercarcassblockBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
		blockEntity.animationState0.animateWhen(Snifferanimationcondition2Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
	}

	@Override
	public void render(SniffercarcassblockBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight, Vec3 cameraPos) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(SniffercarcassblockBlock.FACING);
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
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.SNIFFER_CARCASS_BLOCK.get(), SniffercarcassblockRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelsniffer_carcass {
		private final KeyframeAnimation keyframeAnimation0;

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = hanging_sniffer_anim_idleAnimation.idle.bake(root);
		}

		public void setupBlockEntityAnim(SniffercarcassblockBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(blockEntity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}