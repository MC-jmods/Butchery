package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantPlayertickadvancementsProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (hasEntityInInventory(entity, new ItemStack(ButcheryModItems.RAW_BEEF_MINCE.get()))) {
				if ((entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel _serverLevel2
						&& _plr2.getAdvancements().getOrStartProgress(_serverLevel2.getServer().getAdvancements().get(ResourceLocation.parse("butchery:bloodandgears"))).isDone()) == true) {
					if ((entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel _serverLevel3
							&& _plr3.getAdvancements().getOrStartProgress(_serverLevel3.getServer().getAdvancements().get(ResourceLocation.parse("butchery:groundbreaking"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:groundbreaking"));
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
			} else if (hasEntityInInventory(entity, new ItemStack(ButcheryModItems.RAW_LAMB_MINCE.get()))) {
				if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel _serverLevel6
						&& _plr6.getAdvancements().getOrStartProgress(_serverLevel6.getServer().getAdvancements().get(ResourceLocation.parse("butchery:bloodandgears"))).isDone()) == true) {
					if ((entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel _serverLevel7
							&& _plr7.getAdvancements().getOrStartProgress(_serverLevel7.getServer().getAdvancements().get(ResourceLocation.parse("butchery:groundbreaking"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:groundbreaking"));
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
			} else if (hasEntityInInventory(entity, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()))) {
				if ((entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel _serverLevel10
						&& _plr10.getAdvancements().getOrStartProgress(_serverLevel10.getServer().getAdvancements().get(ResourceLocation.parse("butchery:the_missing_link"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:the_missing_link"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (hasEntityInInventory(entity, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()))) {
				if ((entity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel _serverLevel13
						&& _plr13.getAdvancements().getOrStartProgress(_serverLevel13.getServer().getAdvancements().get(ResourceLocation.parse("butchery:the_dark_sausage"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:the_dark_sausage"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (hasEntityInInventory(entity, new ItemStack(ButcheryModItems.MEAT_SCRAPS.get()))) {
				if ((entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel _serverLevel16
						&& _plr16.getAdvancements().getOrStartProgress(_serverLevel16.getServer().getAdvancements().get(ResourceLocation.parse("butchery:bloodandgears"))).isDone()) == true) {
					if ((entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel _serverLevel17
							&& _plr17.getAdvancements().getOrStartProgress(_serverLevel17.getServer().getAdvancements().get(ResourceLocation.parse("butchery:a_ruff_meal"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:a_ruff_meal"));
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

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}