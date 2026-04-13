package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantleatherlatethanneveradvancementProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer(), event.getItemEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (itemstack.getItem() == Items.LEATHER) {
				if ((entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel _serverLevel3
						&& _plr3.getAdvancements().getOrStartProgress(_serverLevel3.getServer().getAdvancements().get(ResourceLocation.parse("butchery:splish_splash"))).isDone()) == true) {
					if ((entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel _serverLevel4
							&& _plr4.getAdvancements().getOrStartProgress(_serverLevel4.getServer().getAdvancements().get(ResourceLocation.parse("butchery:leather_late_than_never"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:leather_late_than_never"));
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
}