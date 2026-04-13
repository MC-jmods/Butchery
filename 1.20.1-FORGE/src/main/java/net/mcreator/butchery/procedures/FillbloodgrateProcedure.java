package net.mcreator.butchery.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

public class FillbloodgrateProcedure {
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
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip28
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip28)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 6, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip33)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 7, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip38)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 8, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip43
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip43)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 9, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip48
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip48)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 10, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip53)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 11, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip58)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 12, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip63
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip63)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 13, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip68
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip68)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 14, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip73
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip73)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 15, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip78
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip78)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 16, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip83)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 1), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip89
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip89)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 2), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip95
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip95)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 3), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip101
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip101)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 4), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip107
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip107)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 5), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip113
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip113)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 6), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip119)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 7), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip125
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip125)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 8), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip131
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip131)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 9), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip137
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip137)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 10), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip143
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip143)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 11), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip149
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip149)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 12), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip155
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip155)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 13), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip161
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip161)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 14), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip167
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip167)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 15), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip173
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip173)
						: -1) == 1) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 16), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("bloodmagic:life_essence_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip179
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip179)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 1), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip185
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip185)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 2), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip191
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip191)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 3), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip197
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip197)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 4), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip203
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip203)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 5), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip209
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip209)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 6), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip215
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip215)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 7), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip221
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip221)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 8), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip227
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip227)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 9), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip233
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip233)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 10), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip239
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip239)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 11), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip245
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip245)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 12), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip251
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip251)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 13), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip257
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip257)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 14), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip263
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip263)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 15), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip269
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip269)
						: -1) == 2) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 16), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("hexerei:blood_fluid")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip275
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip275)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 1), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip281
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip281)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 2), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip287
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip287)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 3), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip293
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip293)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 4), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip299
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip299)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 5), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip305
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip305)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 6), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip311
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip311)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 7), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip317
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip317)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 8), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip323
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip323)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 9), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip329
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip329)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 10), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip335
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip335)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 11), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip341
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip341)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 12), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip347
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip347)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 13), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip353
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip353)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 14), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip359
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip359)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 15), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip365
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip365)
						: -1) == 3) {
			{
				int _fill = 50;
				BlockEntity blockEntity = world.getBlockEntity(BlockPos.containing(x, (y - 16), z));
				if (blockEntity != null) {
					blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
							.ifPresent(capability -> capability.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.get(ResourceLocation.tryParse("vampirism:impure_blood")), 1)).getFluid(), _fill), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip371
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip371)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip376
						? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip376)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 2, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip381
						? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip381)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 3, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip386
						? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip386)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 4, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip391
						? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip391)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 5, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip396
						? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip396)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 6, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip401
						? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip401)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 7, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip406
						? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip406)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 8, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip411
						? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip411)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 9, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip416
						? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip416)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 10, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip421
						? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip421)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 11, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip426
						? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip426)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 12, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip431
						? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip431)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 13, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip436
						? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip436)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 14, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip441
						? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip441)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 15, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
				&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip446
						? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip446)
						: -1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 16, z));
				int _amount = 50;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		}
	}
}