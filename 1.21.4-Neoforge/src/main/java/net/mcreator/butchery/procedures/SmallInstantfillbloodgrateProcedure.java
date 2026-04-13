package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

public class SmallInstantfillbloodgrateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip3)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 1, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip8
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip8)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 2, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip13)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 3, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip18
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip18)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 4, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip23)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 5, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip28
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip28)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 6, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip33)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 7, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip38)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 8, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip43
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip43)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 9, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip48
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip48)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 10, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip53)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 11, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip58)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 12, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip63
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip63)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 13, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip68
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip68)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 14, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip73
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip73)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 15, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip78
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip78)
						: -1) == 0) {
			if (world instanceof ILevelExtension _ext) {
				IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 16, z), null);
				if (_fluidHandler != null)
					_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 250), IFluidHandler.FluidAction.EXECUTE);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip83)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip87
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip87)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip91)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip95
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip95)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip99
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip99)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip103
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip103)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip107
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip107)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip111
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip111)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip115
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip115)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip119)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip123)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip127
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip127)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip131
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip131)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip135
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip135)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip139
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip139)
						: -1) == 1) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip143
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip143)
						: -1) == 1) {
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip147
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip147)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip151
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip151)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip155
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip155)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip159
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip159)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip163
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip163)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip167
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip167)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip171
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip171)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip175
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip175)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip179
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip179)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip183
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip183)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip187
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip187)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip191
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip191)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip195
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip195)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip199
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip199)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip203
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip203)
						: -1) == 2) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip207
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip207)
						: -1) == 2) {
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip211
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip211)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip215
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip215)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip219
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip219)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip223
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip223)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip227
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip227)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip231
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip231)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip235
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip235)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip239
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip239)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip243
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip243)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip247
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip247)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip251
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip251)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip255
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip255)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip259
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip259)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip263
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip263)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip267
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip267)
						: -1) == 3) {
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip271
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip271)
						: -1) == 3) {
		}
	}
}