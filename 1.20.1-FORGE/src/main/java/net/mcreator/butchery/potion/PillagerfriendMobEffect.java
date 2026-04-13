package net.mcreator.butchery.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.butchery.procedures.PillagerignoreProcedure;
import net.mcreator.butchery.procedures.Pillager_disguised_startedProcedure;
import net.mcreator.butchery.procedures.Pillager_disguise_expiresProcedure;

public class PillagerfriendMobEffect extends MobEffect {
	public PillagerfriendMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10066330);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		Pillager_disguised_startedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PillagerignoreProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Pillager_disguise_expiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}