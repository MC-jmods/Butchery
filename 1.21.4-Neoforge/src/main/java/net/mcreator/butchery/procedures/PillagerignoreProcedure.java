package net.mcreator.butchery.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class PillagerignoreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Pillager.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(8 / 2d), e -> true).isEmpty()) {
			if (entity instanceof Mob _entity) {
				_entity.setTarget(null);
			}
		}
	}
}