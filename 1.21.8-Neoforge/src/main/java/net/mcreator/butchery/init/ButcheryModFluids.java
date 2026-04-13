/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.butchery.fluid.InfectedBloodFluid;
import net.mcreator.butchery.fluid.BloodFluid;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, ButcheryMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> INFECTED_BLOOD = REGISTRY.register("infected_blood", () -> new InfectedBloodFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_INFECTED_BLOOD = REGISTRY.register("flowing_infected_blood", () -> new InfectedBloodFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(INFECTED_BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_INFECTED_BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}