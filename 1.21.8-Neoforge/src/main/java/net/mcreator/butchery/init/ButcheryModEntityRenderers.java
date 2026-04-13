/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.butchery.client.renderer.TurtleshellboatRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class ButcheryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ButcheryModEntities.TURTLESHELLBOAT.get(), TurtleshellboatRenderer::new);
	}
}