package net.mcreator.butchery.procedures;

import net.minecraft.world.entity.Entity;

public class StraynecklaceeffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(0);
	}
}