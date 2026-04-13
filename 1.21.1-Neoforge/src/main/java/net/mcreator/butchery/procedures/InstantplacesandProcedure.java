package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class InstantplacesandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 3, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 4, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 5, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 6, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 7, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 8, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 9, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 10, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 11, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 12, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 13, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 14, z), Blocks.SAND.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == Blocks.AIR && !((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y - 15, z), Blocks.SAND.defaultBlockState(), 3);
		}
	}
}