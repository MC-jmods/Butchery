/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.butchery.world.features.SulfuroregenerationFeature;
import net.mcreator.butchery.world.features.SaltdiscgenerationFeature;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, ButcheryMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> SALTDISCGENERATION = REGISTRY.register("saltdiscgeneration", SaltdiscgenerationFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SULFUROREGENERATION = REGISTRY.register("sulfuroregeneration", SulfuroregenerationFeature::new);
}