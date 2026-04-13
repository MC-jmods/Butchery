/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.butchery.client.particle.*;

@EventBusSubscriber(Dist.CLIENT)
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