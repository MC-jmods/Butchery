/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.butchery.world.inventory.TaxidermystationguiMenu;
import net.mcreator.butchery.world.inventory.PestleandmotarguiMenu;
import net.mcreator.butchery.world.inventory.MeatgrinderguiMenu;
import net.mcreator.butchery.world.inventory.FreezerinventoryMenu;
import net.mcreator.butchery.network.MenuStateUpdateMessage;
import net.mcreator.butchery.ButcheryMod;

import java.util.Map;

public class ButcheryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ButcheryMod.MODID);
	public static final RegistryObject<MenuType<MeatgrinderguiMenu>> MEATGRINDERGUI = REGISTRY.register("meatgrindergui", () -> IForgeMenuType.create(MeatgrinderguiMenu::new));
	public static final RegistryObject<MenuType<FreezerinventoryMenu>> FREEZERINVENTORY = REGISTRY.register("freezerinventory", () -> IForgeMenuType.create(FreezerinventoryMenu::new));
	public static final RegistryObject<MenuType<TaxidermystationguiMenu>> TAXIDERMYSTATIONGUI = REGISTRY.register("taxidermystationgui", () -> IForgeMenuType.create(TaxidermystationguiMenu::new));
	public static final RegistryObject<MenuType<PestleandmotarguiMenu>> PESTLEANDMOTARGUI = REGISTRY.register("pestleandmotargui", () -> IForgeMenuType.create(PestleandmotarguiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				ButcheryMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof ButcheryModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ButcheryMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}