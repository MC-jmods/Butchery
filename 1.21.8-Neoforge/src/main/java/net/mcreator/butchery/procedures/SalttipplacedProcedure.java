package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.ProblemReporter;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SalttipplacedProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_TIP.get() && !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get())) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), ButcheryModBlocks.SALT_FORMATION_TIP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_TIP.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get()
				&& !((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_BASE.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_MIDDLE.get())) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 2, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_BASE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), ButcheryModBlocks.SALT_FORMATION_TIP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_TIP.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_BASE.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 2, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_MIDDLE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), ButcheryModBlocks.SALT_FORMATION_TIP.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_TIP.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get()
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SALT_FORMATION_MIDDLE.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_FRUSTUM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 2, z);
				BlockState _bs = ButcheryModBlocks.SALT_FORMATION_MIDDLE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
						} catch (Exception ignored) {
						}
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), ButcheryModBlocks.SALT_FORMATION_TIP.get().defaultBlockState(), 3);
		}
	}
}