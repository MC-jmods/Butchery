package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

public class PlacesandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 1, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 2, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 3, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 4, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 5, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 6, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 7, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 8, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 9, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 10, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 11, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 12, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 13, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 14, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.SAND.get())) {
			world.setBlock(BlockPos.containing(x, y - 15, z), ButcheryModBlocks.SAND.get().defaultBlockState(), 3);
		}
	}
}