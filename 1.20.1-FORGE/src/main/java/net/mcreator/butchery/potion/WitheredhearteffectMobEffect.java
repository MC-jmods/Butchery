package net.mcreator.butchery.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WitheredhearteffectMobEffect extends MobEffect {
	public WitheredhearteffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}