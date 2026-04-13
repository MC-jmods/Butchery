package net.mcreator.butchery.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class ShellboatridingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1, 1, false, false));
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SEAGRASS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.KELP_PLANT || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.KELP
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SEA_PICKLE) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1, 1, false, false));
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TUBE_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TUBE_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TUBE_CORAL_WALL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HORN_CORAL
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HORN_CORAL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HORN_CORAL_WALL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE_CORAL_WALL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_CORAL
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_CORAL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_CORAL_WALL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BRAIN_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BRAIN_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BRAIN_CORAL_WALL_FAN) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1, 1, false, false));
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_TUBE_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_TUBE_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_TUBE_CORAL_WALL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_HORN_CORAL
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_HORN_CORAL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_HORN_CORAL_WALL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_FIRE_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_FIRE_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_FIRE_CORAL_WALL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BUBBLE_CORAL
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BUBBLE_CORAL_FAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BUBBLE_CORAL_WALL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BRAIN_CORAL || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BRAIN_CORAL_FAN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEAD_BRAIN_CORAL_WALL_FAN) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1, 1, false, false));
		} else {
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		}
	}
}