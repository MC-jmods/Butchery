package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Entity;

import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BrainattractProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Zombie) {
			if (entity instanceof PathfinderMob) {
				if (entity instanceof Monster) {
					((PathfinderMob) entity).goalSelector.addGoal(1, new RemoveBlockGoal(ButcheryModBlocks.BRAIN.get(), ((PathfinderMob) entity), 1, (int) 4));
				}
			}
		}
	}
}