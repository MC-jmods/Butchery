/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.butchery.procedures.Pillager_disguise_expiresProcedure;
import net.mcreator.butchery.potion.WitheredhearteffectMobEffect;
import net.mcreator.butchery.potion.PillagerfriendMobEffect;
import net.mcreator.butchery.ButcheryMod;

@EventBusSubscriber
public class ButcheryModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ButcheryMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> WITHEREDHEARTEFFECT = REGISTRY.register("witheredhearteffect", () -> new WitheredhearteffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PILLAGERFRIEND = REGISTRY.register("pillagerfriend", () -> new PillagerfriendMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(PILLAGERFRIEND)) {
			Pillager_disguise_expiresProcedure.execute(entity);
		}
	}
}