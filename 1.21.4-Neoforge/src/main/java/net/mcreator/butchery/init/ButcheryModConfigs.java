package net.mcreator.butchery.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

@EventBusSubscriber(modid = ButcheryMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ButcheryModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModList.get().getModContainerById("butchery").get().registerConfig(ModConfig.Type.COMMON, ButcheryconfigConfiguration.SPEC, "Butchery.toml");
		});
	}
}