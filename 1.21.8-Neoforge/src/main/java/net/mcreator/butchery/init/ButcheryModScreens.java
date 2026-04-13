/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.butchery.client.gui.TaxidermystationguiScreen;
import net.mcreator.butchery.client.gui.PestleandmotarguiScreen;
import net.mcreator.butchery.client.gui.MeatgrinderguiScreen;
import net.mcreator.butchery.client.gui.FreezerinventoryScreen;

@EventBusSubscriber(Dist.CLIENT)
public class ButcheryModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ButcheryModMenus.MEATGRINDERGUI.get(), MeatgrinderguiScreen::new);
		event.register(ButcheryModMenus.FREEZERINVENTORY.get(), FreezerinventoryScreen::new);
		event.register(ButcheryModMenus.TAXIDERMYSTATIONGUI.get(), TaxidermystationguiScreen::new);
		event.register(ButcheryModMenus.PESTLEANDMOTARGUI.get(), PestleandmotarguiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}