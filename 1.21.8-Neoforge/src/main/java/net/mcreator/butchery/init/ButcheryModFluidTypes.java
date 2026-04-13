/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.butchery.fluid.types.InfectedBloodFluidType;
import net.mcreator.butchery.fluid.types.BloodFluidType;
import net.mcreator.butchery.ButcheryMod;

public class ButcheryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ButcheryMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
	public static final DeferredHolder<FluidType, FluidType> INFECTED_BLOOD_TYPE = REGISTRY.register("infected_blood", () -> new InfectedBloodFluidType());
}