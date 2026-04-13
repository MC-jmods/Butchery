package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;

public class FrogcarcassbrokenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.GRAY_FROG_CARCASS.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) == 0
					|| (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) == 1) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModBlocks.GRAY_FROG_CARCASS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.GREEN_FROG_CARCASS.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip11 ? blockstate.getValue(_getip11) : -1) == 0
					|| (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) == 1) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModBlocks.GREEN_FROG_CARCASS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.ORANGE_FROG_CARCASS.get()) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) == 0
					|| (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) == 1) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModBlocks.ORANGE_FROG_CARCASS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}