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

import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.Modelender_dragon_cut_2;
import net.mcreator.butchery.block.entity.Enderdragoncut2BlockEntity;
import net.mcreator.butchery.block.Enderdragoncut2Block;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class Enderdragoncut2Renderer implements BlockEntityRenderer<Enderdragoncut2BlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	Enderdragoncut2Renderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelender_dragon_cut_2.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/end_dragon.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(Enderdragoncut2BlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
	}

	@Override
	public void render(Enderdragoncut2BlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight, Vec3 cameraPos) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(Enderdragoncut2Block.FACING);
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
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.ENDERDRAGONCUT_2.get(), Enderdragoncut2Renderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelender_dragon_cut_2 {
		public CustomHierarchicalModel(ModelPart root) {
			super(root);
		}

		public void setupBlockEntityAnim(Enderdragoncut2BlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			super.setupAnim(state);
		}
	}
}