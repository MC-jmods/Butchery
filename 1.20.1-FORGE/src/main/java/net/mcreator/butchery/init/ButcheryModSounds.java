/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.butchery.ButcheryMod;

public class ButcheryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ButcheryMod.MODID);
	public static final RegistryObject<SoundEvent> CHA_CHING = REGISTRY.register("cha_ching", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "cha_ching")));
	public static final RegistryObject<SoundEvent> DRAWER_CLOSE = REGISTRY.register("drawer_close", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "drawer_close")));
	public static final RegistryObject<SoundEvent> DRAWER_OPEN = REGISTRY.register("drawer_open", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "drawer_open")));
	public static final RegistryObject<SoundEvent> COIN = REGISTRY.register("coin", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "coin")));
	public static final RegistryObject<SoundEvent> INFLATE = REGISTRY.register("inflate", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "inflate")));
	public static final RegistryObject<SoundEvent> DEFLATE = REGISTRY.register("deflate", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "deflate")));
	public static final RegistryObject<SoundEvent> ROPE = REGISTRY.register("rope", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "rope")));
	public static final RegistryObject<SoundEvent> HACKSAW = REGISTRY.register("hacksaw", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "hacksaw")));
	public static final RegistryObject<SoundEvent> CRUMBLING = REGISTRY.register("crumbling", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "crumbling")));
	public static final RegistryObject<SoundEvent> WISHBONE_BREAK = REGISTRY.register("wishbone_break", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "wishbone_break")));
	public static final RegistryObject<SoundEvent> WATER_FREEZING = REGISTRY.register("water_freezing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "water_freezing")));
	public static final RegistryObject<SoundEvent> ACID = REGISTRY.register("acid", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "acid")));
}