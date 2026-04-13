package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
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
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicInteger;

@Mod.EventBusSubscriber
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
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) == 0 && !(new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						BlockEntity blockEntity = level.getBlockEntity(pos);
						if (blockEntity != null) {
							return blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null).map(fluidHandler -> fluidHandler.getFluidInTank(tank).copy()).orElse(FluidStack.EMPTY);
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)).isFluidEqual((new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 333) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
								_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							int _amount = 333;
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.BOTTLE_OF_BLOOD.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) == 0 && (new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						BlockEntity blockEntity = level.getBlockEntity(pos);
						if (blockEntity != null) {
							return blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null).map(fluidHandler -> fluidHandler.getFluidInTank(tank).copy()).orElse(FluidStack.EMPTY);
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)).isFluidEqual((new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 333) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
								_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							int _amount = 333;
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ButcheryModItems.BOTTLE_OF_INFECTED_BLOOD.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33 ? blockstate.getValue(_getip33) : -1) == 1) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 333) {
						if (ModList.get().isLoaded("blood_magic")) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip39 ? blockstate.getValue(_getip39) : -1) == 2) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 333) {
						if (ModList.get().isLoaded("hexerei")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
									_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 333;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You need to use a bucket."), true);
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip52 ? blockstate.getValue(_getip52) : -1) == 3) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 333) {
						if (ModList.get().isLoaded("vampirism")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
									_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 333;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bottle.fill")), SoundSource.NEUTRAL, 1, 1, false);
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
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip70 ? blockstate.getValue(_getip70) : -1) == 0 && !(new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						BlockEntity blockEntity = level.getBlockEntity(pos);
						if (blockEntity != null) {
							return blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null).map(fluidHandler -> fluidHandler.getFluidInTank(tank).copy()).orElse(FluidStack.EMPTY);
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)).isFluidEqual((new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 1000) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
								_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							int _amount = 1000;
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip84 ? blockstate.getValue(_getip84) : -1) == 0 && (new Object() {
					public FluidStack getFluidInTank(LevelAccessor level, BlockPos pos, int tank) {
						BlockEntity blockEntity = level.getBlockEntity(pos);
						if (blockEntity != null) {
							return blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null).map(fluidHandler -> fluidHandler.getFluidInTank(tank).copy()).orElse(FluidStack.EMPTY);
						}
						return FluidStack.EMPTY;
					}
				}.getFluidInTank(world, BlockPos.containing(x, y, z), (int) 0)).isFluidEqual((new FluidStack(ButcheryModFluids.INFECTED_BLOOD.get(), 1)))) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 1000) {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
								_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							int _amount = 1000;
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip98 ? blockstate.getValue(_getip98) : -1) == 1) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 1000) {
						if (ModList.get().isLoaded("bloodmagic")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
									_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip112 ? blockstate.getValue(_getip112) : -1) == 2) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 1000) {
						if (ModList.get().isLoaded("hexerei")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
									_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ButcheryModItems.BLOOD_BUCKET.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip126 ? blockstate.getValue(_getip126) : -1) == 3) {
					if (new Object() {
						public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
							return _retval.get();
						}
					}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) >= 1000) {
						if (ModList.get().isLoaded("vampirism")) {
							if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
									_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								int _amount = 1000;
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
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
}