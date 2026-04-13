package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BloodgrateupdatetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isButchery") == true && getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/data merge block ~ ~ ~ {fluidTank:{FluidName: \"butchery:blood\"}}");
		} else if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isInfectedButchery") == true && getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/data merge block ~ ~ ~ {fluidTank:{FluidName: \"butchery:infected_blood\"}}");
		} else if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isBloodMagic") == true && getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/data merge block ~ ~ ~ {fluidTank:{FluidName: \"bloodmagic:life_essence_fluid\"}}");
		} else if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isHexeri") == true && getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/data merge block ~ ~ ~ {fluidTank:{FluidName: \"hexerei:blood_fluid\"}}");
		} else if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isVampirism") == true && getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/data merge block ~ ~ ~ {fluidTank:{FluidName: \"vampirism:impure_blood\"}}");
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}

	private static int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IFluidHandler fluidHandler = levelExtension.getCapability(Capabilities.FluidHandler.BLOCK, pos, direction);
			if (fluidHandler != null)
				return fluidHandler.getFluidInTank(tank).getAmount();
		}
		return 0;
	}
}