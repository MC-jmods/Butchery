package net.mcreator.butchery.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.butchery.init.ButcheryModMobEffects;
import net.mcreator.butchery.ButcheryMod;

public class WitheredheardfinishedusingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("hasBlessing") == false) {
			entity.getPersistentData().putBoolean("hasBlessing", true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ButcheryModMobEffects.WITHEREDHEARTEFFECT.get(), 6000, 1, false, false));
			ButcheryMod.queueServerWork(6000, () -> {
				entity.getPersistentData().putBoolean("hasBlessing", false);
			});
			if (Math.random() < 0.25) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 250, 12, false, false));
			}
		}
	}
}