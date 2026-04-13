package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.entity.BlockEntity;
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

@EventBusSubscriber
public class DrainedsniffercarcassbrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_SNIFFER_CARCASS_BLOCK.get()) {
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "butcherStage") == 0 || getBlockNBTNumber(world, BlockPos.containing(x, y, z), "butcherStage") == 5) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.DRAINED_SNIFFER_CARCASS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ButcheryModItems.RAW_SNIFFER_STEAK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}