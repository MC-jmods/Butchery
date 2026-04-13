package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Meatgrinderprogressdisplay4Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double craftingTime = 0;
		craftingTime = getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingTime") / 10;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") > craftingTime * 4 && getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") <= craftingTime * 5) {
			return true;
		}
		return false;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}
}