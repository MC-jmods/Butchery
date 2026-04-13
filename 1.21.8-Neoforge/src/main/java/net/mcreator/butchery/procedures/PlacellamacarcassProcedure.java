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
public class PlacellamacarcassProcedure {
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
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BROWN_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip17
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip17)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip23)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip29
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip29)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip35
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip35)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip41
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip41)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip47
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip47)
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
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.BROWN_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.BROWN_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip70
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip70)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip76
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip76)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip82
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip82)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip88
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip88)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip94
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip94)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip100)
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
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip123)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip129
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip129)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip135
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip135)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip141
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip141)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip147
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip147)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip153
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip153)
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
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.GRAY_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.GRAY_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip176
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip176)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip182
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip182)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip188
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip188)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip194
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip194)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip200
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip200)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip206
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip206)
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
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.WHITE_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.WHITE_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip229
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip229)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip235
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip235)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip241
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip241)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip247
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip247)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip253
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip253)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip259
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip259)
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
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(blockStateWithDirection(ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip283
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip283)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip289
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip289)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip295
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip295)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip301
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip301)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip307
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip307)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip313
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip313)
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
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(blockStateWithDirection(ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip337
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip337)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip343
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip343)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip349
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip349)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip355
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip355)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip361
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip361)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip367
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip367)
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
					world.setBlock(BlockPos.containing(x, y - 1, z), (blockStateWithDirection(ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))),
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get().asItem()) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip391
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip391)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip397
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip397)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip403
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip403)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip409
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip409)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip415
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip415)
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
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip421
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip421)
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
					world.setBlock(BlockPos.containing(x, y - 1, z),
							(blockStateWithDirection(ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get().defaultBlockState(), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
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
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ROPE.get()
				&& (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip439
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip439)
						: -1) == 3
						|| ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip441
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip441)
								: -1) == 7)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.WHITE_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get().asItem()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS.get().asItem()) {
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