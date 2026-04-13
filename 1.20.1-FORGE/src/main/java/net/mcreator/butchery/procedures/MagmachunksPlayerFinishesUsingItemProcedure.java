package net.mcreator.butchery.procedures;

import net.minecraft.world.entity.Entity;

public class MagmachunksPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(1);
	}
}