/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.butchery.client.particle.WithersmokeParticle;
import net.mcreator.butchery.client.particle.SparksParticle;
import net.mcreator.butchery.client.particle.SandparticleParticle;
import net.mcreator.butchery.client.particle.FreezersmokeParticle;
import net.mcreator.butchery.client.particle.FeathersParticle;
import net.mcreator.butchery.client.particle.BloodparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ButcheryModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ButcheryModParticleTypes.BLOOD_PARTICLE.get(), BloodparticleParticle::provider);
		event.registerSpriteSet(ButcheryModParticleTypes.FEATHERS.get(), FeathersParticle::provider);
		event.registerSpriteSet(ButcheryModParticleTypes.FREEZERSMOKE.get(), FreezersmokeParticle::provider);
		event.registerSpriteSet(ButcheryModParticleTypes.SANDPARTICLE.get(), SandparticleParticle::provider);
		event.registerSpriteSet(ButcheryModParticleTypes.SPARKS.get(), SparksParticle::provider);
		event.registerSpriteSet(ButcheryModParticleTypes.WITHERSMOKE.get(), WithersmokeParticle::provider);
	}
}