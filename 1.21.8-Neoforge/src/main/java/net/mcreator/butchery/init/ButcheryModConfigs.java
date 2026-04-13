package net.mcreator.butchery.init;

import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

public class ButcheryModConfigs {
	@EventBusSubscriber
	public static class CommonRegistry {
		@SubscribeEvent
		public static void register(FMLConstructModEvent event) {
			event.enqueueWork(() -> {
				ModContainer container = ModList.get().getModContainerById("butchery").get();
				container.registerConfig(ModConfig.Type.COMMON, ButcheryconfigConfiguration.SPEC, "Butchery.toml");
			});
		}
	}

	@EventBusSubscriber(value = Dist.CLIENT)
	public static class ClientRegistry {
		@SubscribeEvent
		public static void register(FMLConstructModEvent event) {
			event.enqueueWork(() -> {
				ModContainer container = ModList.get().getModContainerById("butchery").get();
				container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
			});
		}
	}
}