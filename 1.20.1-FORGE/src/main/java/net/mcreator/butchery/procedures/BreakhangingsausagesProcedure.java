package net.mcreator.butchery.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BreakhangingsausagesProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get())
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) == 0) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get())
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1) == 1) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get())
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip59 ? blockstate.getValue(_getip59) : -1) == 2) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.RAW_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.COOKED_BLOOD_SAUSAGES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.COOKED_BLOOD_SAUSAGE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}