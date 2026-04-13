package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantcutabovetherestadvancementProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:drained_carcass")))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))) {
				if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel _serverLevel6
						&& _plr6.getAdvancements().getOrStartProgress(_serverLevel6.getServer().getAdvancements().get(ResourceLocation.parse("butchery:first_blood"))).isDone()) == true) {
					if ((entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel _serverLevel7
							&& _plr7.getAdvancements().getOrStartProgress(_serverLevel7.getServer().getAdvancements().get(ResourceLocation.parse("butchery:cut_abovethe_rest"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
							AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:cut_abovethe_rest"));
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
		}
	}
}