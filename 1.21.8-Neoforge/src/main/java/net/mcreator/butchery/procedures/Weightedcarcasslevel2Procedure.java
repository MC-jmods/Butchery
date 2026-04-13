package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Weightedcarcasslevel2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack weightedCarcass = ItemStack.EMPTY;
		if (ButcheryconfigConfiguration.WEIGHTED_CARCASS.get() == true) {
			if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerIter) {
				for (int _idx = 0; _idx < _modHandlerIter.getSlots(); _idx++) {
					ItemStack itemstackiterator = _modHandlerIter.getStackInSlot(_idx).copy();
					if (itemstackiterator.is(ItemTags.create(ResourceLocation.parse("butchery:weighted_carcass_ll")))) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (!(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.STRENGTH)
									&& ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.STRENGTH) ? _livEnt.getEffect(MobEffects.STRENGTH).getAmplifier() : 0) == 0
											|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.STRENGTH) ? _livEnt.getEffect(MobEffects.STRENGTH).getAmplifier() : 0) == 1))) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 3, 1, false, false));
							} else if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.STRENGTH)
									&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.STRENGTH) ? _livEnt.getEffect(MobEffects.STRENGTH).getAmplifier() : 0) == 0) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 3, 0, false, false));
							}
						}
					}
				}
			}
		}
	}
}