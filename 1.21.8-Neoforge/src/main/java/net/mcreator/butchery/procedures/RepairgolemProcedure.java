package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
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
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RepairgolemProcedure {
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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM.get()
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "golemRepaired") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("golemRepaired", 1);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1.5), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1.5), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), y, (z + 0.25), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1), (z + 0.75), 40, 0.1, 0.1, 0.1, 0.8);
				} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "golemRepaired") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("golemRepaired", 2);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1.5), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1.5), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), y, (z + 0.25), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1), (z + 0.75), 40, 0.1, 0.1, 0.1, 0.8);
				} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "golemRepaired") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("golemRepaired", 3);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1.5), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1.5), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), y, (z + 0.25), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1), (z + 0.75), 40, 0.1, 0.1, 0.1, 0.8);
					if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58 ? blockstate.getValue(_getip58) : -1) == 0) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = ButcheryModBlocks.REPAIRED_IRONGOLEM.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}