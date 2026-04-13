/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.butchery.ButcheryMod;

public class ButcheryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ButcheryMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CHA_CHING = REGISTRY.register("cha_ching", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "cha_ching")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DRAWER_CLOSE = REGISTRY.register("drawer_close", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "drawer_close")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DRAWER_OPEN = REGISTRY.register("drawer_open", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "drawer_open")));
	public static final DeferredHolder<SoundEvent, SoundEvent> COIN = REGISTRY.register("coin", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "coin")));
	public static final DeferredHolder<SoundEvent, SoundEvent> INFLATE = REGISTRY.register("inflate", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "inflate")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DEFLATE = REGISTRY.register("deflate", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "deflate")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ROPE = REGISTRY.register("rope", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "rope")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HACKSAW = REGISTRY.register("hacksaw", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "hacksaw")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CRUMBLING = REGISTRY.register("crumbling", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "crumbling")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WISHBONE_BREAK = REGISTRY.register("wishbone_break", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "wishbone_break")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WATER_FREEZING = REGISTRY.register("water_freezing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "water_freezing")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ACID = REGISTRY.register("acid", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("butchery", "acid")));
}