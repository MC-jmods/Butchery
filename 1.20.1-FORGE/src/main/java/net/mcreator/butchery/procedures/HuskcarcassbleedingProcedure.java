package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

import java.util.Map;

public class HuskcarcassbleedingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))) {
			if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "isBleeding")) == false && (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "isDrained")) == false) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("isBleeding", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (ButcheryconfigConfiguration.INSTANT_BLEED.get() == false) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HUSK_CORPSE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip11
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip11)
									: -1) == 1) {
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.honey_block.hit")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.honey_block.hit")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						SandDrippingProcedure.execute(world, x, y, z);
						new Object() {
							void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
								if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HUSK_CORPSE.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip18
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip18)
												: -1) == 1) {
									PlacesandProcedure.execute(world, x, y, z);
								}
								final int tick2 = ticks;
								ButcheryMod.queueServerWork(tick2, () -> {
									if (timedlooptotal > timedloopiterator + 1) {
										timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
									}
								});
							}
						}.timedLoop(0, 22, 45);
						new Object() {
							void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip23)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip26
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip26)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip29
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip29)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip32
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip32)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip35
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip35)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip38)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip41
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip41)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip44
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip44)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip47
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip47)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip50
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip50)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip53)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip56
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip56)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip59
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip59)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip62
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip62)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 1, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip65
											? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip65)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 1, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip70
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip70)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip73
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip73)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip76
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip76)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip79
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip79)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip82
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip82)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip85
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip85)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip88
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip88)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip91)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip94
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip94)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip97)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip100)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip103
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip103)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip106
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip106)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip109
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip109)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 2, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip112
											? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip112)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 2, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip117
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip117)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip120
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip120)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip123)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip126
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip126)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip129
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip129)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip132
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip132)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip135
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip135)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip138
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip138)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip141
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip141)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip144
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip144)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip147
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip147)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip150
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip150)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip153
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip153)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip156
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip156)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 3, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip159
											? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip159)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 3, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip164
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip164)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip167
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip167)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip170
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip170)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip173
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip173)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip176
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip176)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip179
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip179)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip182
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip182)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip185
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip185)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip188
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip188)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip191
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip191)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip194
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip194)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip197
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip197)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip200
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip200)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip203
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip203)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 4, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip206
											? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip206)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 4, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip211
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip211)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip214
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip214)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip217
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip217)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip220
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip220)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip223
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip223)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip226
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip226)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip229
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip229)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip232
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip232)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip235
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip235)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip238
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip238)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip241
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip241)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip244
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip244)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip247
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip247)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip250
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip250)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 5, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip253
											? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip253)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 5, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip258
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip258)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip261
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip261)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip264
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip264)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip267
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip267)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip270
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip270)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip273
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip273)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip276
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip276)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip279
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip279)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip282
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip282)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip285
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip285)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip288
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip288)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip291
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip291)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip294
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip294)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip297
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip297)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 6, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip300
											? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip300)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 6, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip305
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip305)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip308
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip308)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip311
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip311)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip314
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip314)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip317
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip317)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip320
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip320)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip323
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip323)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip326
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip326)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip329
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip329)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip332
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip332)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip335
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip335)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip338
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip338)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip341
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip341)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip344
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip344)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 7, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip347
											? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip347)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 7, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip352
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip352)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip355
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip355)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip358
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip358)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip361
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip361)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip364
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip364)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip367
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip367)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip370
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip370)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip373
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip373)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip376
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip376)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip379
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip379)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip382
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip382)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip385
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip385)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip388
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip388)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip391
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip391)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 8, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip394
											? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip394)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 8, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip399
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip399)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip402
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip402)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip405
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip405)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip408
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip408)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip411
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip411)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip414
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip414)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip417
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip417)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip420
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip420)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip423
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip423)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip426
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip426)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip429
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip429)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip432
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip432)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip435
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip435)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip438
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip438)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 9, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip441
											? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip441)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 9, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip446
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip446)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip449
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip449)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip452
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip452)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip455
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip455)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip458
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip458)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip461
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip461)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip464
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip464)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip467
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip467)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip470
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip470)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip473
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip473)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip476
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip476)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip479
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip479)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip482
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip482)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip485
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip485)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 10, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip488
											? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip488)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 10, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip493
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip493)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip496
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip496)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip499
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip499)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip502
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip502)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip505
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip505)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip508
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip508)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip511
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip511)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip514
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip514)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip517
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip517)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip520
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip520)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip523
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip523)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip526
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip526)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip529
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip529)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip532
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip532)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 11, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip535
											? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip535)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 11, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip540
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip540)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip543
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip543)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip546
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip546)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip549
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip549)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip552
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip552)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip555
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip555)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip558
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip558)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip561
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip561)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip564
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip564)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip567
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip567)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip570
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip570)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip573
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip573)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip576
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip576)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip579
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip579)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 12, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip582
											? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip582)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 12, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip587
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip587)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip590
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip590)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip593
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip593)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip596
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip596)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip599
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip599)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip602
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip602)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip605
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip605)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip608
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip608)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip611
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip611)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip614
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip614)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip617
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip617)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip620
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip620)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip623
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip623)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip626
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip626)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 13, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip629
											? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip629)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 13, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip634
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip634)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip637
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip637)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip640
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip640)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip643
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip643)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip646
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip646)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip649
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip649)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip652
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip652)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip655
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip655)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip658
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip658)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip661
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip661)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip664
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip664)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip667
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip667)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip670
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip670)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip673
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip673)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 14, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip676
											? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip676)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 14, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip681
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip681)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip684
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip684)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip687
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip687)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip690
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip690)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip693
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip693)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip696
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip696)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip699
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip699)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip702
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip702)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip705
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip705)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip708
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip708)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip711
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip711)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip714
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip714)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip717
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip717)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip720
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip720)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 15, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip723
											? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip723)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 15, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.SAND.get()) {
									if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip728
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip728)
											: -1) == 0) {
										{
											int _value = 1;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip731
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip731)
											: -1) == 1) {
										{
											int _value = 2;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip734
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip734)
											: -1) == 2) {
										{
											int _value = 3;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip737
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip737)
											: -1) == 3) {
										{
											int _value = 4;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip740
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip740)
											: -1) == 4) {
										{
											int _value = 5;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip743
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip743)
											: -1) == 5) {
										{
											int _value = 6;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip746
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip746)
											: -1) == 6) {
										{
											int _value = 7;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip749
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip749)
											: -1) == 7) {
										{
											int _value = 8;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip752
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip752)
											: -1) == 8) {
										{
											int _value = 9;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip755
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip755)
											: -1) == 9) {
										{
											int _value = 10;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip758
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip758)
											: -1) == 10) {
										{
											int _value = 11;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip761
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip761)
											: -1) == 11) {
										{
											int _value = 12;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip764
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip764)
											: -1) == 12) {
										{
											int _value = 13;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip767
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip767)
											: -1) == 13) {
										{
											int _value = 14;
											BlockPos _pos = BlockPos.containing(x, y - 16, z);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
												world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
										}
									} else if (((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip770
											? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip770)
											: -1) == 14) {
										{
											BlockPos _bp = BlockPos.containing(x, y - 16, z);
											BlockState _bs = Blocks.SAND.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								}
								final int tick2 = ticks;
								ButcheryMod.queueServerWork(tick2, () -> {
									if (timedlooptotal > timedloopiterator + 1) {
										timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
									}
								});
							}
						}.timedLoop(0, 45, 65);
						ButcheryMod.queueServerWork(900, () -> {
							if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HUSK_CORPSE.get()
									&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip776
											? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip776)
											: -1) == 1) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockState _bs = (new Object() {
										public BlockState with(BlockState _bs, String _property, int _newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
											return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
										}
									}.with(ButcheryModBlocks.DRAINED_HUSK_CORPSE.get().defaultBlockState(), "blockstate", 1));
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									BlockEntity _be = world.getBlockEntity(_bp);
									CompoundTag _bnbt = null;
									if (_be != null) {
										_bnbt = _be.saveWithFullMetadata();
										_be.setRemoved();
									}
									world.setBlock(_bp, _bs, 3);
									if (_bnbt != null) {
										_be = world.getBlockEntity(_bp);
										if (_be != null) {
											try {
												_be.load(_bnbt);
											} catch (Exception ignored) {
											}
										}
									}
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("isBleeding", false);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("isDrained", true);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						});
					}
				} else if (ButcheryconfigConfiguration.INSTANT_BLEED.get() == true) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.honey_block.hit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.honey_block.hit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.HUSK_CORPSE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip789
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip789)
									: -1) == 1) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(ButcheryModBlocks.DRAINED_HUSK_CORPSE.get().defaultBlockState(), "blockstate", 1));
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putBoolean("isBleeding", false);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putBoolean("isDrained", true);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						InstantplacesandProcedure.execute(world, x, y, z);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
						ButcheryMod.queueServerWork(1, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
						});
						ButcheryMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
						});
						ButcheryMod.queueServerWork(3, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
						});
					}
				}
			}
		}
	}
}