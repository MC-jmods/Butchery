package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModEntities;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlaceshellboatProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.EMPTY_TURTLE_SHELL.get().asItem() && entity.level()
				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getType() == HitResult.Type.BLOCK) {
			if ((world
					.getFluidState(new BlockPos(
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()))
					.createLegacyBlock()).getBlock() == Blocks.WATER) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.EMPTY_TURTLE_SHELL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = ButcheryModEntities.TURTLESHELLBOAT.get().spawn(_level, new BlockPos(
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
							EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if ((entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel _serverLevel14
						&& _plr14.getAdvancements().getOrStartProgress(_serverLevel14.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel _serverLevel16
						&& _plr16.getAdvancements().getOrStartProgress(_serverLevel16.getServer().getAdvancements().get(ResourceLocation.parse("butchery:itsafloater"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:itsafloater"));
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
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.EMPTY_TURTLE_SHELL.get().asItem()) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.EMPTY_TURTLE_SHELL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = ButcheryModEntities.TURTLESHELLBOAT.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if ((entity instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel _serverLevel25
						&& _plr25.getAdvancements().getOrStartProgress(_serverLevel25.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel _serverLevel27
						&& _plr27.getAdvancements().getOrStartProgress(_serverLevel27.getServer().getAdvancements().get(ResourceLocation.parse("butchery:itsafloater"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:itsafloater"));
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