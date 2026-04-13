/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.butchery.world.features.SulfuroregenerationFeature;
import net.mcreator.butchery.world.features.SaltdiscgenerationFeature;
import net.mcreator.butchery.ButcheryMod;

@Mod.EventBusSubscriber
public class ButcheryModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ButcheryMod.MODID);
	public static final RegistryObject<Feature<?>> SALTDISCGENERATION = REGISTRY.register("saltdiscgeneration", SaltdiscgenerationFeature::new);
	public static final RegistryObject<Feature<?>> SULFUROREGENERATION = REGISTRY.register("sulfuroregeneration", SulfuroregenerationFeature::new);
}