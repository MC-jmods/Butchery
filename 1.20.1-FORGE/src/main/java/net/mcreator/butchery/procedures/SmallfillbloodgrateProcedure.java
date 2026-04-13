package net.mcreator.butchery.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

public class SmallfillbloodgrateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip3)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip8
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip8)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 2, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip13)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 3, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip18
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip18)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 4, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip23)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 5, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip28
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip28)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip32
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip32)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip36
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip36)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip40
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip40)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip44
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip44)
						: -1) == 1) {
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip48
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip48)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip52
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip52)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip56
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip56)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip60
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip60)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip64
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip64)
						: -1) == 2) {
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip68
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip68)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip72
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip72)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip76
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip76)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip80
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip80)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip84
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip84)
						: -1) == 3) {
		}
	}
}