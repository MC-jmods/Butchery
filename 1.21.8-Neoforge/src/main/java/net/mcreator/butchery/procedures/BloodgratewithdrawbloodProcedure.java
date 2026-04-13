package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BloodgratewithdrawbloodProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) == 0 && !(FluidStack.isSameFluid((new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						if (level instanceof ILevelExtension extension) {
							IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, pos, null);
							if (fluidHandler != null) {
								return fluidHandler.getFluidInTank(tank).copy();
							} else {
								return FluidStack.EMPTY;
							}
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)), (new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1))))) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 333) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack13 = new ItemStack(Items.GLASS_BOTTLE).copy();
								_setstack13.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack13);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
							if (_fluidHandler != null)
								_fluidHandler.drain(333, IFluidHandler.FluidAction.EXECUTE);
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.BOTTLE_OF_BLOOD.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) == 0 && FluidStack.isSameFluid((new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						if (level instanceof ILevelExtension extension) {
							IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, pos, null);
							if (fluidHandler != null) {
								return fluidHandler.getFluidInTank(tank).copy();
							} else {
								return FluidStack.EMPTY;
							}
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)), (new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 333) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack27 = new ItemStack(Items.GLASS_BOTTLE).copy();
								_setstack27.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack27);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
							if (_fluidHandler != null)
								_fluidHandler.drain(333, IFluidHandler.FluidAction.EXECUTE);
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.BOTTLE_OF_INFECTED_BLOOD.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33 ? blockstate.getValue(_getip33) : -1) == 1) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 333) {
						if (ModList.get().isLoaded("blood_magic")) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip39 ? blockstate.getValue(_getip39) : -1) == 2) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 333) {
						if (ModList.get().isLoaded("hexerei")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack45 = new ItemStack(Items.GLASS_BOTTLE).copy();
									_setstack45.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack45);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(333, IFluidHandler.FluidAction.EXECUTE);
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p hexerei:blood_bottle{Damage:9}");
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip52 ? blockstate.getValue(_getip52) : -1) == 3) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 333) {
						if (ModList.get().isLoaded("vampirism")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack58 = new ItemStack(Items.GLASS_BOTTLE).copy();
									_setstack58.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack58);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(333, IFluidHandler.FluidAction.EXECUTE);
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p vampirism:blood_bottle{Damage:9}");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p vampirism:blood_bottle[vampirism:bottle_blood={blood:9}]");
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.BLOOD_GRATE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip70 ? blockstate.getValue(_getip70) : -1) == 0 && !(FluidStack.isSameFluid((new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						if (level instanceof ILevelExtension extension) {
							IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, pos, null);
							if (fluidHandler != null) {
								return fluidHandler.getFluidInTank(tank).copy();
							} else {
								return FluidStack.EMPTY;
							}
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)), (new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1))))) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1000) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack78 = new ItemStack(Items.BUCKET).copy();
								_setstack78.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack78);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
							if (_fluidHandler != null)
								_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip84 ? blockstate.getValue(_getip84) : -1) == 0 && FluidStack.isSameFluid((new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						if (level instanceof ILevelExtension extension) {
							IFluidHandler fluidHandler = extension.getCapability(Capabilities.FluidHandler.BLOCK, pos, null);
							if (fluidHandler != null) {
								return fluidHandler.getFluidInTank(tank).copy();
							} else {
								return FluidStack.EMPTY;
							}
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)), (new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1000) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack92 = new ItemStack(Items.BUCKET).copy();
								_setstack92.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack92);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (world instanceof ILevelExtension _ext) {
							IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
							if (_fluidHandler != null)
								_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.INFECTED_BLOOD_BUCKET.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip98 ? blockstate.getValue(_getip98) : -1) == 1) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1000) {
						if (ModList.get().isLoaded("bloodmagic")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack104 = new ItemStack(Items.BUCKET).copy();
									_setstack104.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack104);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p bloodmagic:life_essence_bucket");
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip112 ? blockstate.getValue(_getip112) : -1) == 2) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1000) {
						if (ModList.get().isLoaded("hexerei")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack118 = new ItemStack(Items.BUCKET).copy();
									_setstack118.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack118);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p hexerei:blood_bucket");
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip126 ? blockstate.getValue(_getip126) : -1) == 3) {
					if (getFluidTankLevel(world, BlockPos.containing(x, y, z), 1, null) >= 1000) {
						if (ModList.get().isLoaded("vampirism")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack132 = new ItemStack(Items.BUCKET).copy();
									_setstack132.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack132);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							if (Math.random() <= 0.1) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p vampirism:blood_bucket");
									}
								}
							} else {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/give @p vampirism:impure_blood_bucket");
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof ILevelExtension _ext) {
								IFluidHandler _fluidHandler = _ext.getCapability(Capabilities.FluidHandler.BLOCK, BlockPos.containing(x, y, z), null);
								if (_fluidHandler != null)
									_fluidHandler.drain(1000, IFluidHandler.FluidAction.EXECUTE);
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				}
			}
		}
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