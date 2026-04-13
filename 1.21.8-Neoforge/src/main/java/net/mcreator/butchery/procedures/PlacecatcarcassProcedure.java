package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlacecatcarcassProcedure {
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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HOOK.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
				&& !(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip5) : -1) == 3
						|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip7)
								: -1) == 7)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip57
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip57)
									: -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip63
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip63)
									: -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip69
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip69)
									: -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip75
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip75)
									: -1) == 4) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip81
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip81)
									: -1) == 5) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip87
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip87)
									: -1) == 6) {
						{
							int _value = 7;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
								3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.BLACK_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.CALICO_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.JELLIE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
								3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
								3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.RED_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
								3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.TABBY_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.WHITE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HOOK.get()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.BLACK_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.CALICO_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.JELLIE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.PERSIAN_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.RED_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.SIAMESE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.TABBY_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.WHITE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip288
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip288)
									: -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip294
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip294)
									: -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip300
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip300)
									: -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip306
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip306)
									: -1) == 4) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip312
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip312)
									: -1) == 5) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip318
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip318)
									: -1) == 6) {
						{
							int _value = 7;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:rope")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()) {
						world.setBlock(BlockPos.containing(x, y - 1, z),
								(blockStateWithDirection(ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HOOK.get()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putBoolean("isDrained", true);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
				&& (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip474
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip474)
						: -1) == 3
						|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip476
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip476)
								: -1) == 7)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		}
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}

	private static BlockState blockStateWithDirection(BlockState blockState, Direction newValue) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty enumProperty && enumProperty.getPossibleValues().contains(newValue))
			return blockState.setValue(enumProperty, newValue);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty enumProperty && enumProperty.getPossibleValues().contains(newValue.getAxis()))
			return blockState.setValue(enumProperty, newValue.getAxis());
		return blockState;
	}
}