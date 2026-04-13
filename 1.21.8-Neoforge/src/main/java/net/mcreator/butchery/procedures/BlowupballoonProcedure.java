package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BlowupballoonProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BAMBOO.asItem()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if ((entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel _serverLevel4
					&& _plr4.getAdvancements().getOrStartProgress(_serverLevel4.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"))).isDone()) == false) {
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
				if ((entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel _serverLevel6
						&& _plr6.getAdvancements().getOrStartProgress(_serverLevel6.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"));
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			ButcheryMod.queueServerWork(40, () -> {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack11 = new ItemStack(ButcheryModItems.GREEN_FROG_BALLOON.get()).copy();
						_setstack11.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack11);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BAMBOO.asItem()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if ((entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel _serverLevel17
					&& _plr17.getAdvancements().getOrStartProgress(_serverLevel17.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"))).isDone()) == false) {
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
				if ((entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel _serverLevel19
						&& _plr19.getAdvancements().getOrStartProgress(_serverLevel19.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"));
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			ButcheryMod.queueServerWork(40, () -> {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack24 = new ItemStack(ButcheryModItems.ORANGE_FROG_BALLOON.get()).copy();
						_setstack24.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack24);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			});
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BAMBOO.asItem()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if ((entity instanceof ServerPlayer _plr30 && _plr30.level() instanceof ServerLevel _serverLevel30
					&& _plr30.getAdvancements().getOrStartProgress(_serverLevel30.getServer().getAdvancements().get(ResourceLocation.parse("butchery:butcherssecrets"))).isDone()) == false) {
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
				if ((entity instanceof ServerPlayer _plr32 && _plr32.level() instanceof ServerLevel _serverLevel32
						&& _plr32.getAdvancements().getOrStartProgress(_serverLevel32.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:breathless"));
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:inflate")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			ButcheryMod.queueServerWork(40, () -> {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack37 = new ItemStack(ButcheryModItems.GRAY_FROG_BALLOON.get()).copy();
						_setstack37.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack37);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			});
		}
	}
}