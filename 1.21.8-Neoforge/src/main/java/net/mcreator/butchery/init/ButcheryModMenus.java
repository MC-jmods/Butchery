/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.butchery.world.inventory.TaxidermystationguiMenu;
import net.mcreator.butchery.world.inventory.PestleandmotarguiMenu;
import net.mcreator.butchery.world.inventory.MeatgrinderguiMenu;
import net.mcreator.butchery.world.inventory.FreezerinventoryMenu;
import net.mcreator.butchery.network.MenuStateUpdateMessage;
import net.mcreator.butchery.ButcheryMod;

import java.util.Map;

public class ButcheryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ButcheryMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MeatgrinderguiMenu>> MEATGRINDERGUI = REGISTRY.register("meatgrindergui", () -> IMenuTypeExtension.create(MeatgrinderguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FreezerinventoryMenu>> FREEZERINVENTORY = REGISTRY.register("freezerinventory", () -> IMenuTypeExtension.create(FreezerinventoryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TaxidermystationguiMenu>> TAXIDERMYSTATIONGUI = REGISTRY.register("taxidermystationgui", () -> IMenuTypeExtension.create(TaxidermystationguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PestleandmotarguiMenu>> PESTLEANDMOTARGUI = REGISTRY.register("pestleandmotargui", () -> IMenuTypeExtension.create(PestleandmotarguiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof ButcheryModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
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