package net.mcreator.butchery.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.butchery.network.ButcheryModVariables;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FirstjoinguideProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (ButcheryconfigConfiguration.FIRST_JOIN_BOOK.get() == true) {
			if ((entity.getCapability(ButcheryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ButcheryModVariables.PlayerVariables())).first_join_guide == 0) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p patchouli:guide_book{\"patchouli:book\":\"butchery:butchers_guide\"}");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p patchouli:guide_book[patchouli:book=\"butchery:butchers_guide\"]");
					}
				}
				{
					double _setval = 1;
					entity.getCapability(ButcheryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.first_join_guide = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}