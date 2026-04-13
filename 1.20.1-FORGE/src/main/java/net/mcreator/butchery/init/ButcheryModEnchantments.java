/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.butchery.enchantment.ButcherstouchEnchantment;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ButcheryMod.MODID);
	public static final RegistryObject<Enchantment> BUTCHERSTOUCH = REGISTRY.register("butcherstouch", () -> new ButcherstouchEnchantment());
}