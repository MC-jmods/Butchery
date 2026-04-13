package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.ButcheryMod;

public class SmallblooddrippingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1) == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
			ButcheryMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
			});
			ButcheryMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
			});
			ButcheryMod.queueServerWork(15, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
			});
		}
		ButcheryMod.queueServerWork(28, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip14
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip14)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(56, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip26
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip26)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(84, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip38)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(112, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip50
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip50)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(140, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip62
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip62)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(168, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip74
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip74)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(196, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip86
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip86)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(224, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip98
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip98)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(252, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip110
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip110)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(280, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip122
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip122)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
		ButcheryMod.queueServerWork(308, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:small_carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip134
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip134)
							: -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.5), (y - 0.6), (z + 0.5), 1, 0, 0.1, 0, 0.1);
				ButcheryMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.6), (y - 0.6), (z + 0.4), 1, 0, 0.1, 0, 0.1);
				});
				ButcheryMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.BLOOD_PARTICLE.get()), (x + 0.4), (y - 0.6), (z + 0.6), 1, 0, 0.1, 0, 0.1);
				});
			}
		});
	}
}