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

public class BlooddrippingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1) == 1
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip16
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip16)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip30
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip30)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip44
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip44)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip58)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip72
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip72)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip86
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip86)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip100)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip114
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip114)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip128
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip128)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip142
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip142)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip156
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip156)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(336, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip170
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip170)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(364, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip184
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip184)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(392, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip198
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip198)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(420, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip212
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip212)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(448, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip226
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip226)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(476, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip240
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip240)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(504, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip254
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip254)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(532, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip268
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip268)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(560, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip282
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip282)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(588, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip296
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip296)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(616, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip310
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip310)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(644, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip324
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip324)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(672, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip338
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip338)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(700, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip352
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip352)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(728, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip366
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip366)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(756, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip380
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip380)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(784, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip394
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip394)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(812, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip408
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip408)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(840, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip422
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip422)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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
		ButcheryMod.queueServerWork(868, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip436
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip436)
							: -1) == 1
					|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery:carcass_no_states")))) {
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