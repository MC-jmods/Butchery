package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModItems;

public class BasinupdatetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 1000 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1) == 1) {
			if (world instanceof Level _lvl3 && _lvl3.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(166, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 834 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) == 2) {
			if (world instanceof Level _lvl14 && _lvl14.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(166, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 3;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 668 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip24 ? blockstate.getValue(_getip24) : -1) == 3) {
			if (world instanceof Level _lvl25 && _lvl25.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(166, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 4;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 502 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) == 4) {
			if (world instanceof Level _lvl36 && _lvl36.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(166, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 5;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 336 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip46 ? blockstate.getValue(_getip46) : -1) == 5) {
			if (world instanceof Level _lvl47 && _lvl47.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(166, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 6;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 170 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip57 ? blockstate.getValue(_getip57) : -1) == 6) {
			if (world instanceof Level _lvl58 && _lvl58.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !world.getLevelData().isRaining()) {
				if (world instanceof ILevelExtension _ext) {
					IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
					if (_fluidHandler != null)
						_fluidHandler.drain(170, IFluidHandler.FluidAction.EXECUTE);
				}
				{
					int _value = 7;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.SALT.get()).copy();
					_setstack.setCount((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 0 && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip68 ? blockstate.getValue(_getip68) : -1) == 7
				&& !((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == ButcheryModItems.SALT.get())) {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) == 1000) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}

	private static int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IFluidHandler fluidHandler = levelExtension.getCapability(Capabilities.FluidHandler.BLOCK, pos, direction);
			if (fluidHandler != null)
				return fluidHandler.getFluidInTank(tank).getAmount();
		}
		return 0;
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}