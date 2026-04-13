package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
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

public class CatcarcassbleedingProcedure {
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
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get())
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip31
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip31)
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
						SmallblooddrippingProcedure.execute(world, x, y, z);
						new Object() {
							void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
								if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get()
										|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get())
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip58)
												: -1) == 1) {
									SmallfillbloodgrateProcedure.execute(world, x, y, z);
								}
								final int tick2 = ticks;
								ButcheryMod.queueServerWork(tick2, () -> {
									if (timedlooptotal > timedloopiterator + 1) {
										timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
									}
								});
							}
						}.timedLoop(0, 5, 45);
						ButcheryMod.queueServerWork(225, () -> {
							if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get()
									|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get())
									&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83
											? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip83)
											: -1) == 1) {
								if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip87
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip87)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip93
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip93)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip99
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip99)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip105
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip105)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip111
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip111)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip117
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip117)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip123)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip129
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip129)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip135
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip135)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip141
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip141)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
								} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get()
										&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip147
												? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip147)
												: -1) == 1) {
									{
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockState _bs = (new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get())
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip180
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip180)
									: -1) == 1) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ALL_BLACK_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip184
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip184)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLACK_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip190
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip190)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip196
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip196)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.CALICO_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip202
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip202)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.JELLIE_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip208
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip208)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.PERSIAN_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip214
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip214)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAGDOLL_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip220
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip220)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RED_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip226
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip226)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SIAMESE_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip232
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip232)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.TABBY_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip238
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip238)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.WHITE_CAT_CARCASS.get()
								&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip244
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip244)
										: -1) == 1) {
							{
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockState _bs = (new Object() {
									public BlockState with(BlockState _bs, String _property, int _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
									}
								}.with(ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get().defaultBlockState(), "blockstate", 1));
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
						SmallInstantfillbloodgrateProcedure.execute(world, x, y, z);
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
			PlacebloodpuddleProcedure.execute(world, x, y, z);
		}
	}
}