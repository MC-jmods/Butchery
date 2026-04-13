/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.butchery.fluid.types.InfectedBloodFluidType;
import net.mcreator.butchery.fluid.types.BloodFluidType;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ButcheryMod.MODID);
	public static final RegistryObject<FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
	public static final RegistryObject<FluidType> INFECTED_BLOOD_TYPE = REGISTRY.register("infected_blood", () -> new InfectedBloodFluidType());
}