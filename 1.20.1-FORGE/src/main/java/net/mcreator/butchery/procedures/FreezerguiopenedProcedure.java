package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;

public class FreezerguiopenedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.FREEZERSMOKE.get()), (x + 0.6), (y + 0.5), (z + 0.6), 5, 0.1, 0.3, 0.2, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.FREEZERSMOKE.get()), (x + 0.5), (y + 1), (z + 0.5), 5, 0.2, 0.2, 0.2, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.FREEZERSMOKE.get()), (x + 0.2), (y + 0.5), (z + 0.5), 5, 0.1, 0.3, 0.2, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.FREEZERSMOKE.get()), (x + 0.5), (y + 1), (z + 0.2), 5, 0.2, 0.2, 0.2, 0);
		}
	}
}