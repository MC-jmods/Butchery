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
public class PlacefrogcarcassProcedure {
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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.GRAY_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.GRAY_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip32
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip32)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip38)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip44
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip44)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip50
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip50)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip56
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip56)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip62
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip62)
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
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.GREEN_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.GREEN_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip89
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip89)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip95
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip95)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip101
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip101)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip107
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip107)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip113
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip113)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip119)
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
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.ORANGE_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.ORANGE_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip146
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip146)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip152
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip152)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip158
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip158)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip164
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip164)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip170
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip170)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip176
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip176)
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
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
							3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip214
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip214)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip220
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip220)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip226
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip226)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip232
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip232)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip238
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip238)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip244
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip244)
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
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
							3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip272
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip272)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip278
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip278)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip284
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip284)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip290
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip290)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip296
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip296)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip302
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip302)
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
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(blockStateWithDirection(ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip330
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip330)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip336
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip336)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip342
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip342)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip348
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip348)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip354
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip354)
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
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip360
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip360)
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
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
				&& (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip366
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip366)
						: -1) == 3
						|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip368
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip368)
								: -1) == 7)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.METAL_TRAY.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
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
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get().asItem()) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GRAY_FROG_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
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
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get().asItem()) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GREEN_FROG_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.chain.hit")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
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
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get().asItem()) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_ORANGE_FROG_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
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