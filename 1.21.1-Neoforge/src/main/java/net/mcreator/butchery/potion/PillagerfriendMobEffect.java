package net.mcreator.butchery.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.butchery.procedures.PillagerignoreProcedure;
import net.mcreator.butchery.procedures.Pillager_disguised_startedProcedure;

public class PillagerfriendMobEffect extends MobEffect {
	public PillagerfriendMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10066330);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		Pillager_disguised_startedProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		PillagerignoreProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}