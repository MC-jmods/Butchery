package net.mcreator.butchery.client.fluid;

import org.joml.Vector4f;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.fog.environment.FogEnvironment;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import net.mcreator.butchery.init.ButcheryModFluidTypes;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class BloodFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("butchery:block/blood_still");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("butchery:block/blood_flow");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public Vector4f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector4f fluidFogColor) {
				return new Vector4f(0.3843137255f, 0f, 0f, fluidFogColor.w);
			}

			@Override
			public void modifyFogRender(Camera camera, @Nullable FogEnvironment environment, float renderDistance, float partialTick, FogData fogData) {
				float nearDistance = fogData.environmentalStart;
				float farDistance = fogData.environmentalEnd;
				Entity entity = camera.getEntity();
				Level world = entity.level();
				fogData.environmentalStart = 0f;
				fogData.environmentalEnd = Math.min(48f, renderDistance);
			}
		}, ButcheryModFluidTypes.BLOOD_TYPE.get());
	}
}