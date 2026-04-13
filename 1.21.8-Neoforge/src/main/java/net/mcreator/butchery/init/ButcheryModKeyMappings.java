/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.butchery.network.VindicatornosepressMessage;
import net.mcreator.butchery.network.PillagernosepressMessage;
import net.mcreator.butchery.network.EvokermaskpressMessage;

@EventBusSubscriber(Dist.CLIENT)
public class ButcheryModKeyMappings {
	public static final KeyMapping EVOKERMASKPRESS = new KeyMapping("key.butchery.evokermaskpress", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new EvokermaskpressMessage(0, 0));
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
				ClientPacketDistributor.sendToServer(new PillagernosepressMessage(0, 0));
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
				ClientPacketDistributor.sendToServer(new VindicatornosepressMessage(0, 0));
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

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				EVOKERMASKPRESS.consumeClick();
				PILLAGERNOSEPRESS.consumeClick();
				VINDICATORNOSEPRESS.consumeClick();
			}
		}
	}
}