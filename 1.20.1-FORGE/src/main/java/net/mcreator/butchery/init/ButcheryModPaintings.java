/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.butchery.ButcheryMod;

public class ButcheryModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ButcheryMod.MODID);
	public static final RegistryObject<PaintingVariant> COWPOSTER = REGISTRY.register("cowposter", () -> new PaintingVariant(64, 38));
	public static final RegistryObject<PaintingVariant> MENU = REGISTRY.register("menu", () -> new PaintingVariant(64, 38));
}