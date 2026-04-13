/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.butchery.client.gui.TaxidermystationguiScreen;
import net.mcreator.butchery.client.gui.PestleandmotarguiScreen;
import net.mcreator.butchery.client.gui.MeatgrinderguiScreen;
import net.mcreator.butchery.client.gui.FreezerinventoryScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ButcheryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ButcheryModMenus.MEATGRINDERGUI.get(), MeatgrinderguiScreen::new);
			MenuScreens.register(ButcheryModMenus.FREEZERINVENTORY.get(), FreezerinventoryScreen::new);
			MenuScreens.register(ButcheryModMenus.TAXIDERMYSTATIONGUI.get(), TaxidermystationguiScreen::new);
			MenuScreens.register(ButcheryModMenus.PESTLEANDMOTARGUI.get(), PestleandmotarguiScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}