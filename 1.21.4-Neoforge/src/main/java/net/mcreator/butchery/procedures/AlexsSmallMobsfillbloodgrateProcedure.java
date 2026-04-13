package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AlexsSmallMobsfillbloodgrateProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("butchery_alexs_mobs:small_carcass")))
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1) == 1
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver"))))) {
			new Object() {
				void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip11
									? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip11)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 1, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip16
									? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip16)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 2, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip21
									? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip21)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 3, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip26
									? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip26)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 4, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip31
									? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip31)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 5, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip36
									? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip36)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 6, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip41
									? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip41)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 7, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip46
									? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip46)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 8, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip51
									? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip51)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 9, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip56
									? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip56)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 10, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip61
									? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip61)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 11, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip66
									? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip66)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 12, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip71
									? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip71)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 13, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip76
									? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip76)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 14, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip81
									? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip81)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 15, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip86
									? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip86)
									: -1) == 0) {
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y - 16, z), null);
							if (_fluidHandler != null)
								_fluidHandler.fill(new FluidStack(ButcheryModFluids.BLOOD.get(), 50), IFluidHandler.FluidAction.EXECUTE);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91
									? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip91)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 1), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97
									? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip97)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 2), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip103
									? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip103)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 3), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip109
									? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip109)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 4), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip115
									? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip115)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 5), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip121
									? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip121)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 6), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip127
									? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip127)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 7), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip133
									? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip133)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 8), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip139
									? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip139)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 9), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip145
									? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip145)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 10), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip151
									? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip151)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 11), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip157
									? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip157)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 12), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip163
									? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip163)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 13), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip169
									? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip169)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 14), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip175
									? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip175)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 15), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip181
									? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip181)
									: -1) == 1) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 16), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("bloodmagic:life_essence_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip187
									? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip187)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 1), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip193
									? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip193)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 2), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip199
									? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip199)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 3), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip205
									? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip205)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 4), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip211
									? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip211)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 5), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip217
									? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip217)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 6), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip223
									? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip223)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 7), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip229
									? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip229)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 8), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip235
									? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip235)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 9), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip241
									? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip241)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 10), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip247
									? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip247)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 11), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip253
									? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip253)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 12), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip259
									? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip259)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 13), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip265
									? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip265)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 14), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip271
									? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip271)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 15), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip277
									? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip277)
									: -1) == 2) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 16), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("hexerei:blood_fluid")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip283
									? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip283)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 1), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip289
									? (world.getBlockState(BlockPos.containing(x, y - 2, z))).getValue(_getip289)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 2), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip295
									? (world.getBlockState(BlockPos.containing(x, y - 3, z))).getValue(_getip295)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 3), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip301
									? (world.getBlockState(BlockPos.containing(x, y - 4, z))).getValue(_getip301)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 4), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip307
									? (world.getBlockState(BlockPos.containing(x, y - 5, z))).getValue(_getip307)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 5), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip313
									? (world.getBlockState(BlockPos.containing(x, y - 6, z))).getValue(_getip313)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 6), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip319
									? (world.getBlockState(BlockPos.containing(x, y - 7, z))).getValue(_getip319)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 7), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip325
									? (world.getBlockState(BlockPos.containing(x, y - 8, z))).getValue(_getip325)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 8), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 9, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip331
									? (world.getBlockState(BlockPos.containing(x, y - 9, z))).getValue(_getip331)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 9), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 10, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip337
									? (world.getBlockState(BlockPos.containing(x, y - 10, z))).getValue(_getip337)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 10), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 11, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip343
									? (world.getBlockState(BlockPos.containing(x, y - 11, z))).getValue(_getip343)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 11), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 12, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip349
									? (world.getBlockState(BlockPos.containing(x, y - 12, z))).getValue(_getip349)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 12), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 13, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip355
									? (world.getBlockState(BlockPos.containing(x, y - 13, z))).getValue(_getip355)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 13), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 14, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip361
									? (world.getBlockState(BlockPos.containing(x, y - 14, z))).getValue(_getip361)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 14), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 15, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip367
									? (world.getBlockState(BlockPos.containing(x, y - 15, z))).getValue(_getip367)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 15), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()
							&& ((world.getBlockState(BlockPos.containing(x, y - 16, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip373
									? (world.getBlockState(BlockPos.containing(x, y - 16, z))).getValue(_getip373)
									: -1) == 3) {
						{
							if (world instanceof ILevelExtension extension) {
								IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, (y - 16), z), null);
								if (fluidHandler != null) {
									fluidHandler.fill(new FluidStack((new FluidStack(BuiltInRegistries.FLUID.getValue(ResourceLocation.parse("vampirism:impure_blood")), 1)).getFluid(), (int) 50), IFluidHandler.FluidAction.EXECUTE);
								}
							}
						}
					}
					final int tick2 = ticks;
					ButcheryMod.queueServerWork(tick2, () -> {
						if (timedlooptotal > timedloopiterator + 1) {
							timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
						}
					});
				}
			}.timedLoop(0, 10, 45);
		}
	}
}