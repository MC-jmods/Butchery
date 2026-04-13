package net.mcreator.butchery.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.butchery.init.ButcheryModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GrantbutcheradvancementProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity(), event.getCrafting());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == ButcheryModItems.BONE_CLEAVER.get() || itemstack.getItem() == ButcheryModItems.IRON_CLEAVER.get() || itemstack.getItem() == ButcheryModItems.GOLD_CLEAVER.get()
				|| itemstack.getItem() == ButcheryModItems.DIAMOND_CLEAVER.get() || itemstack.getItem() == ButcheryModItems.NETHERITE_CLEAVER.get()) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(ResourceLocation.parse("butchery:butcher"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("butchery:butcher"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}