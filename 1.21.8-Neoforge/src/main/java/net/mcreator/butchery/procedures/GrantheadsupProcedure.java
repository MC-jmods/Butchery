package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantheadsupProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity,
				new ItemStack((BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("butchery:head_mount")), RandomSource.create()).orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value())))) {
			if ((entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel _serverLevel2
					&& _plr2.getAdvancements().getOrStartProgress(_serverLevel2.getServer().getAdvancements().get(ResourceLocation.parse("butchery:heads_up"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
					AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:heads_up"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}