package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Wardenanimationcondition3Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return getBlockNBTNumber(world, BlockPos.containing(x, y, z), "butcherStage") == 3;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}