package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FirstcarcassadvancementProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack dropped_carcass = ItemStack.EMPTY;
		if (entity instanceof Animal || entity instanceof Monster) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.BONE_CLEAVER.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.IRON_CLEAVER.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.GOLD_CLEAVER.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.DIAMOND_CLEAVER.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.NETHERITE_CLEAVER.get()) {
				if ((sourceentity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel _serverLevel12
						&& _plr12.getAdvancements().getOrStartProgress(_serverLevel12.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcher"))).isDone()) == true) {
					if ((sourceentity instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel _serverLevel13
							&& _plr13.getAdvancements().getOrStartProgress(_serverLevel13.getServer().getAdvancements().get(ResourceLocation.parse("butchery:firstcarcass"))).isDone()) == false) {
						if (sourceentity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:firstcarcass"));
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