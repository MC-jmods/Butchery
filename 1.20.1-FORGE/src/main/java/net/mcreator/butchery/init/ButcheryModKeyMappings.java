/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.butchery.network.VindicatornosepressMessage;
import net.mcreator.butchery.network.PillagernosepressMessage;
import net.mcreator.butchery.network.EvokermaskpressMessage;
import net.mcreator.butchery.ButcheryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ButcheryModKeyMappings {
	public static final KeyMapping EVOKERMASKPRESS = new KeyMapping("key.butchery.evokermaskpress", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ButcheryMod.PACKET_HANDLER.sendToServer(new EvokermaskpressMessage(0, 0));
				EvokermaskpressMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PILLAGERNOSEPRESS = new KeyMapping("key.butchery.pillagernosepress", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ButcheryMod.PACKET_HANDLER.sendToServer(new PillagernosepressMessage(0, 0));
				PillagernosepressMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping VINDICATORNOSEPRESS = new KeyMapping("key.butchery.vindicatornosepress", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ButcheryMod.PACKET_HANDLER.sendToServer(new VindicatornosepressMessage(0, 0));
				VindicatornosepressMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(EVOKERMASKPRESS);
		event.register(PILLAGERNOSEPRESS);
		event.register(VINDICATORNOSEPRESS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				EVOKERMASKPRESS.consumeClick();
				PILLAGERNOSEPRESS.consumeClick();
				VINDICATORNOSEPRESS.consumeClick();
			}
		}
	}
}