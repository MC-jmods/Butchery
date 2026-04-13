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

import net.mcreator.butchery.procedures.Ravageranimationcondition5Procedure;
import net.mcreator.butchery.procedures.Ravageranimationcondition4Procedure;
import net.mcreator.butchery.procedures.Ravageranimationcondition3Procedure;
import net.mcreator.butchery.procedures.Ravageranimationcondition2Procedure;
import net.mcreator.butchery.procedures.Ravageranimationcondition1Procedure;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.ravager_leg_4Animation;
import net.mcreator.butchery.client.model.animations.ravager_leg_3Animation;
import net.mcreator.butchery.client.model.animations.ravager_leg_2Animation;
import net.mcreator.butchery.client.model.animations.ravager_leg_1Animation;
import net.mcreator.butchery.client.model.animations.ravager_headlessAnimation;
import net.mcreator.butchery.client.model.Modelravager;
import net.mcreator.butchery.block.entity.RavagerBlockEntity;
import net.mcreator.butchery.block.RavagerBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RavagerRenderer implements BlockEntityRenderer<RavagerBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;
	private final LivingEntityRenderState renderState;

	RavagerRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelravager.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/ravager.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(RavagerBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
		blockEntity.animationState0.animateWhen(Ravageranimationcondition1Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState1.animateWhen(Ravageranimationcondition2Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState2.animateWhen(Ravageranimationcondition3Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState3.animateWhen(Ravageranimationcondition4Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
		blockEntity.animationState4.animateWhen(Ravageranimationcondition5Procedure.execute(blockEntity.getLevel(), blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(), blockEntity.getBlockPos().getZ()), tickCount);
	}

	@Override
	public void render(RavagerBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(RavagerBlock.FACING);
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
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.RAVAGER.get(), RavagerRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelravager {
		public CustomHierarchicalModel(ModelPart root) {
			super(root);
		}

		public void setupBlockEntityAnim(RavagerBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(blockEntity.animationState0, ravager_headlessAnimation.ravager_headless, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState1, ravager_leg_1Animation.ravager_leg_1, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState2, ravager_leg_2Animation.ravager_leg_2, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState3, ravager_leg_3Animation.ravager_leg_3, state.ageInTicks, 1f);
			this.animate(blockEntity.animationState4, ravager_leg_4Animation.ravager_leg_4, state.ageInTicks, 1f);
			super.setupAnim(state);
		}

		public ModelPart getRoot() {
			return root;
		}
	}
}