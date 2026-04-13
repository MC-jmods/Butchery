package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

public class TaxidermytableBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}