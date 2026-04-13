package net.mcreator.butchery.client.renderer.block;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.butchery.procedures.Snifferanimationcondition9Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition8Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition7Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition6Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition5Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition4Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition3Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition2Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition1Procedure;
import net.mcreator.butchery.procedures.Snifferanimationcondition10Procedure;
import net.mcreator.butchery.init.ButcheryModBlockEntities;
import net.mcreator.butchery.client.model.animations.sniffer_skinnedAnimation;
import net.mcreator.butchery.client.model.animations.sniffer_idleAnimation;
import net.mcreator.butchery.client.model.animations.sniffer_headlessAnimation;
import net.mcreator.butchery.client.model.animations.sniffer_cut_2Animation;
import net.mcreator.butchery.client.model.animations.sniffer_cut_1Animation;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_skinnedAnimation;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_idleAnimation;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_headlessAnimation;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_cut_2Animation;
import net.mcreator.butchery.client.model.animations.hanging_sniffer_anim_cut_1Animation;
import net.mcreator.butchery.client.model.Modelsniffer_carcass;
import net.mcreator.butchery.block.entity.DrainedsniffercarcassblockBlockEntity;
import net.mcreator.butchery.block.DrainedsniffercarcassblockBlock;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DrainedsniffercarcassblockRenderer implements BlockEntityRenderer<DrainedsniffercarcassblockBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	DrainedsniffercarcassblockRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(Modelsniffer_carcass.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("butchery:textures/block/sniffer.png");
	}

	private void updateRenderState(DrainedsniffercarcassblockBlockEntity blockEntity) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
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
	public void render(DrainedsniffercarcassblockBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity);
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
		model.setupBlockEntityAnim(blockEntity, blockEntity.getLevel().getGameTime() + partialTick);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ButcheryModBlockEntities.DRAINED_SNIFFER_CARCASS_BLOCK.get(), DrainedsniffercarcassblockRenderer::new);
	}

	private static final class CustomHierarchicalModel extends Modelsniffer_carcass {
		private final ModelPart root;
		private final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupBlockEntityAnim(DrainedsniffercarcassblockBlockEntity blockEntity, float ageInTicks) {
			animator.setupBlockEntityAnim(blockEntity, ageInTicks);
			super.setupAnim(null, 0, 0, ageInTicks, 0, 0);
		}

		public ModelPart getRoot() {
			return root;
		}

		private class BlockEntityHierarchicalModel extends HierarchicalModel<Entity> {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			}

			public void setupBlockEntityAnim(DrainedsniffercarcassblockBlockEntity blockEntity, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(blockEntity.animationState0, sniffer_idleAnimation.idle, ageInTicks, 1f);
				animator.animate(blockEntity.animationState1, sniffer_headlessAnimation.headless, ageInTicks, 1f);
				animator.animate(blockEntity.animationState2, sniffer_skinnedAnimation.skinned, ageInTicks, 1f);
				animator.animate(blockEntity.animationState3, sniffer_cut_1Animation.cut_1, ageInTicks, 1f);
				animator.animate(blockEntity.animationState4, sniffer_cut_2Animation.cut_2, ageInTicks, 1f);
				animator.animate(blockEntity.animationState5, hanging_sniffer_anim_idleAnimation.idle, ageInTicks, 1f);
				animator.animate(blockEntity.animationState6, hanging_sniffer_anim_headlessAnimation.headless, ageInTicks, 1f);
				animator.animate(blockEntity.animationState7, hanging_sniffer_anim_skinnedAnimation.skinned, ageInTicks, 1f);
				animator.animate(blockEntity.animationState8, hanging_sniffer_anim_cut_1Animation.cut_1, ageInTicks, 1f);
				animator.animate(blockEntity.animationState9, hanging_sniffer_anim_cut_2Animation.cut_2, ageInTicks, 1f);
			}
		}
	}
}