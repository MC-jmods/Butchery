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

import net.mcreator.butchery.procedures.*;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.*;
import net.mcreator.butchery.client.model.Modelsniffer_carcass;
import net.mcreator.butchery.block.entity.DrainedsniffercarcassblockBlockEntity;
import net.mcreator.butchery.block.DrainedsniffercarcassblockBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class DrainedsniffercarcassblockRenderer implements BlockEntityRenderer<DrainedsniffercarcassblockBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	DrainedsniffercarcassblockRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelsniffer_carcass.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/sniffer.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(DrainedsniffercarcassblockBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
		blockEntity.animationState0.animateWhen(Snifferanimationcondition1Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState1.animateWhen(Snifferanimationcondition2Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState2.animateWhen(Snifferanimationcondition3Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState3.animateWhen(Snifferanimationcondition4Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState4.animateWhen(Snifferanimationcondition5Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState5.animateWhen(Snifferanimationcondition6Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState6.animateWhen(Snifferanimationcondition7Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState7.animateWhen(Snifferanimationcondition8Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState8.animateWhen(Snifferanimationcondition9Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState9.animateWhen(Snifferanimationcondition10Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
	}

	@Override
	public void render(DrainedsniffercarcassblockBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight, Vec3 cameraPos) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(DrainedsniffercarcassblockBlock.FACING);
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
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.DRAINED_SNIFFER_CARCASS_BLOCK.get(), DrainedsniffercarcassblockRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelsniffer_carcass {
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;
		private final KeyframeAnimation keyframeAnimation4;
		private final KeyframeAnimation keyframeAnimation5;
		private final KeyframeAnimation keyframeAnimation6;
		private final KeyframeAnimation keyframeAnimation7;
		private final KeyframeAnimation keyframeAnimation8;
		private final KeyframeAnimation keyframeAnimation9;

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = sniffer_idleAnimation.idle.bake(root);
			this.keyframeAnimation1 = sniffer_headlessAnimation.headless.bake(root);
			this.keyframeAnimation2 = sniffer_skinnedAnimation.skinned.bake(root);
			this.keyframeAnimation3 = sniffer_cut_1Animation.cut_1.bake(root);
			this.keyframeAnimation4 = sniffer_cut_2Animation.cut_2.bake(root);
			this.keyframeAnimation5 = hanging_sniffer_anim_idleAnimation.idle.bake(root);
			this.keyframeAnimation6 = hanging_sniffer_anim_headlessAnimation.headless.bake(root);
			this.keyframeAnimation7 = hanging_sniffer_anim_skinnedAnimation.skinned.bake(root);
			this.keyframeAnimation8 = hanging_sniffer_anim_cut_1Animation.cut_1.bake(root);
			this.keyframeAnimation9 = hanging_sniffer_anim_cut_2Animation.cut_2.bake(root);
		}

		public void setupBlockEntityAnim(DrainedsniffercarcassblockBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(blockEntity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(blockEntity.animationState1, state.ageInTicks, 1f);
			this.keyframeAnimation2.apply(blockEntity.animationState2, state.ageInTicks, 1f);
			this.keyframeAnimation3.apply(blockEntity.animationState3, state.ageInTicks, 1f);
			this.keyframeAnimation4.apply(blockEntity.animationState4, state.ageInTicks, 1f);
			this.keyframeAnimation5.apply(blockEntity.animationState5, state.ageInTicks, 1f);
			this.keyframeAnimation6.apply(blockEntity.animationState6, state.ageInTicks, 1f);
			this.keyframeAnimation7.apply(blockEntity.animationState7, state.ageInTicks, 1f);
			this.keyframeAnimation8.apply(blockEntity.animationState8, state.ageInTicks, 1f);
			this.keyframeAnimation9.apply(blockEntity.animationState9, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}