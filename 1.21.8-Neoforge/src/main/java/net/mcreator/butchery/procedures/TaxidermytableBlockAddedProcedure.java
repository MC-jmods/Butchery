package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

public class TaxidermytableBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4) : -1) == 0
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(ButcheryModBlocks.TAXIDERMY_TABLE.get().defaultBlockState(), "blockstate", 1)), 3);
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip13) : -1) == 0
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x - 1, y, z), (blockStateWithDirection((new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(ButcheryModBlocks.TAXIDERMY_TABLE.get().defaultBlockState(), "blockstate", 1)), Direction.SOUTH)), 3);
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip23) : -1) == 0
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z - 1), (blockStateWithDirection((new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(ButcheryModBlocks.TAXIDERMY_TABLE.get().defaultBlockState(), "blockstate", 1)), Direction.WEST)), 3);
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip33) : -1) == 0
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z + 1), (blockStateWithDirection((new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(ButcheryModBlocks.TAXIDERMY_TABLE.get().defaultBlockState(), "blockstate", 1)), Direction.EAST)), 3);
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