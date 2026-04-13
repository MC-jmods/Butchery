package net.mcreator.butchery.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.butchery.entity.TurtleshellboatEntity;
import net.mcreator.butchery.client.model.Modelshell_boat;

import com.mojang.blaze3d.vertex.PoseStack;

public class TurtleshellboatRenderer extends MobRenderer<TurtleshellboatEntity, LivingEntityRenderState, Modelshell_boat> {
	private TurtleshellboatEntity entity = null;

	public TurtleshellboatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshell_boat(context.bakeLayer(Modelshell_boat.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TurtleshellboatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("butchery:textures/entities/turtle_drained.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
	}
}