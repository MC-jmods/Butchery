package net.mcreator.butchery.client.renderer.block;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.butchery.procedures.Elderguardiananimationcondition4Procedure;
import net.mcreator.butchery.procedures.Elderguardiananimationcondition3Procedure;
import net.mcreator.butchery.procedures.Elderguardiananimationcondition2Procedure;
import net.mcreator.butchery.procedures.Elderguardiananimationcondition1Procedure;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.elder_guardian_idleAnimation;
import net.mcreator.butchery.client.model.animations.elder_guardian_cut_3Animation;
import net.mcreator.butchery.client.model.animations.elder_guardian_cut_2Animation;
import net.mcreator.butchery.client.model.animations.elder_guardian_cut_1Animation;
import net.mcreator.butchery.client.model.Modelelder_guardian;
import net.mcreator.butchery.block.entity.ElderguardiancarcassBlockEntity;
import net.mcreator.butchery.block.ElderguardiancarcassBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElderguardiancarcassRenderer implements BlockEntityRenderer<ElderguardiancarcassBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	ElderguardiancarcassRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelelder_guardian.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/elder_guardian.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(ElderguardiancarcassBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
		blockEntity.animationState0.animateWhen(Elderguardiananimationcondition1Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState1.animateWhen(Elderguardiananimationcondition2Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState2.animateWhen(Elderguardiananimationcondition3Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState3.animateWhen(Elderguardiananimationcondition4Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
	}

	@Override
	public void render(ElderguardiancarcassBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(ElderguardiancarcassBlock.FACING);
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
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.ELDER_GUARDIAN_CARCASS.get(), ElderguardiancarcassRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelelder_guardian {
		public CustomHierarchicalModel(ModelPart root) {
			super(root);
		}

		public void setupBlockEntityAnim(ElderguardiancarcassBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(blockEntity.animationState0, elder_guardian_idleAnimation.idle, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState1, elder_guardian_cut_2Animation.eye_removed, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState2, elder_guardian_cut_1Animation.tail_removed, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState3, elder_guardian_cut_3Animation.spikes_removed, state.ageInTicks, 1f);
			super.setupAnim(state);
		}

		public ModelPart getRoot() {
			return root;
		}
	}
}