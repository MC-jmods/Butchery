package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

public class PlacebloodpuddleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ButcheryconfigConfiguration.BLOOD_PUDDLE.get() == true) {
			ButcheryMod.queueServerWork(40, () -> {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get() || (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get())) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get() || (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
							|| (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 1, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 1, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 1, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 2, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 2, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 2, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 3, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 3, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 3, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 4, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 4, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 4, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 5, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 5, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 5, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 6, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 6, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 6, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 7, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 7, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 7, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 8, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 8, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 8, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 9, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 9, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 9, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 10, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 10, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 10, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 11, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 11, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 11, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 12, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 12, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 12, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 13, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 13, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 13, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 14, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 14, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 14, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR
							&& (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get()
									|| (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_PUDDLE.get())) {
						world.setBlock(BlockPos.containing(x, y - 15, z), ButcheryModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y - 15, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putBoolean("sourceBlood", true);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						ButcheryMod.queueServerWork(110, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y - 15, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null) {
									_blockEntity.getPersistentData().putBoolean("sourceBlood", false);
								}
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						});
					}
				}
			});
		}
	}
}