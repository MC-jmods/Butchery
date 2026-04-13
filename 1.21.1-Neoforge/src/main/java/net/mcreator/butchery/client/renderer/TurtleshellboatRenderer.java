package net.mcreator.butchery.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.butchery.entity.TurtleshellboatEntity;
import net.mcreator.butchery.client.model.Modelshell_boat;

import com.mojang.blaze3d.vertex.PoseStack;

public class TurtleshellboatRenderer extends MobRenderer<TurtleshellboatEntity, Modelshell_boat<TurtleshellboatEntity>> {
	public TurtleshellboatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshell_boat<TurtleshellboatEntity>(context.bakeLayer(Modelshell_boat.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(TurtleshellboatEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurtleshellboatEntity entity) {
		return ResourceLocation.parse("butchery:textures/entities/turtle_drained.png");
	}
}