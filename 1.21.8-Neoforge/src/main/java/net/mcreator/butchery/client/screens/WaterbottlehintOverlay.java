package net.mcreator.butchery.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.Minecraft;

import net.mcreator.butchery.procedures.WaterhintoverlayProcedure;

@EventBusSubscriber(Dist.CLIENT)
public class WaterbottlehintOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (WaterhintoverlayProcedure.execute(world, entity)) {
			event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("butchery:textures/screens/sponge_overlay.png"), w / 2 + -479, h / 2 + -267, 0, 0, 960, 540, 960, 540);

		}
	}
}