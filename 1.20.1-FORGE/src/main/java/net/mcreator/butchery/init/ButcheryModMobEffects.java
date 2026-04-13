/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.butchery.potion.WitheredhearteffectMobEffect;
import net.mcreator.butchery.potion.PillagerfriendMobEffect;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ButcheryMod.MODID);
	public static final RegistryObject<MobEffect> WITHEREDHEARTEFFECT = REGISTRY.register("witheredhearteffect", () -> new WitheredhearteffectMobEffect());
	public static final RegistryObject<MobEffect> PILLAGERFRIEND = REGISTRY.register("pillagerfriend", () -> new PillagerfriendMobEffect());
}