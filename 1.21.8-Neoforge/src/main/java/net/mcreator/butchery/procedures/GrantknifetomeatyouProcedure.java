package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantknifetomeatyouProcedure {
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
		if (itemstack.getItem() == ButcheryModItems.BONE_SKINNING_KNIFE.get() || itemstack.getItem() == ButcheryModItems.IRON_SKINNING_KNIFE.get() || itemstack.getItem() == ButcheryModItems.GOLD_SKINNING_KNIFE.get()
				|| itemstack.getItem() == ButcheryModItems.DIAMOND_SKINNING_KNIFE.get() || itemstack.getItem() == ButcheryModItems.NETHERITE_SKINNING_KNIFE.get()) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel _serverLevel10
					&& _plr10.getAdvancements().getOrStartProgress(_serverLevel10.getServer().getAdvancements().get(ResourceLocation.parse("butchery:cut_abovethe_rest"))).isDone()) == true) {
				if ((entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel _serverLevel11
						&& _plr11.getAdvancements().getOrStartProgress(_serverLevel11.getServer().getAdvancements().get(ResourceLocation.parse("butchery:knifeto_meet_you"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:knifeto_meet_you"));
						if (_adv != null) {
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
	}
}