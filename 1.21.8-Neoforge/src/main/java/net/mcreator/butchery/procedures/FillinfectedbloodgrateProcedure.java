package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

public class FillinfectedbloodgrateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 1, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9
					? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip9)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 2, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 2, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip20
					? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip20)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 2, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 3, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 3, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip31
					? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip31)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 3, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 4, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 4, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip42
					? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip42)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 4, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 5, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 5, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53
					? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip53)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 5, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 6, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 6, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip64
					? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip64)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 6, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 7, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 7, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip75
					? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip75)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 7, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 8, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 8, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip86
					? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip86)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 8, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 9, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 9, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97
					? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip97)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 9, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 10, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 10, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip108
					? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip108)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 10, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 11, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 11, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
					? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip119)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 11, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 12, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 12, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip130
					? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip130)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 12, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 13, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 13, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip141
					? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip141)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 13, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 14, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 14, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip152
					? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip152)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 14, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 15, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 15, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip163
					? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip163)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 15, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 16, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y - 16, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("isInfectedButchery", true);
					_blockEntity.getPersistentData().putBoolean("isButchery", false);
					_blockEntity.getPersistentData().putBoolean("isBloodMagic", false);
					_blockEntity.getPersistentData().putBoolean("isHexeri", false);
					_blockEntity.getPersistentData().putBoolean("isVampirism", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!(((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip174
					? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip174)
					: -1) == 0)) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y - 16, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}