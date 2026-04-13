/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.butchery.fluid.InfectedBloodFluid;
import net.mcreator.butchery.fluid.BloodFluid;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ButcheryMod.MODID);
	public static final RegistryObject<FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());
	public static final RegistryObject<FlowingFluid> INFECTED_BLOOD = REGISTRY.register("infected_blood", () -> new InfectedBloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_INFECTED_BLOOD = REGISTRY.register("flowing_infected_blood", () -> new InfectedBloodFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(INFECTED_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_INFECTED_BLOOD.get(), RenderType.translucent());
		}
	}
}