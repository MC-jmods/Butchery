/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.butchery.ButcheryMod;

public class ButcheryModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ButcheryMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLOOD_PARTICLE = REGISTRY.register("blood_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FEATHERS = REGISTRY.register("feathers", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FREEZERSMOKE = REGISTRY.register("freezersmoke", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SANDPARTICLE = REGISTRY.register("sandparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPARKS = REGISTRY.register("sparks", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> WITHERSMOKE = REGISTRY.register("withersmoke", () -> new SimpleParticleType(false));
}