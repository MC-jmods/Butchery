package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

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
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.init.ButcheryModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
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
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemRepaired") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemRepaired", 1);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				} else if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemRepaired") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemRepaired", 2);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				} else if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemRepaired") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemRepaired", 3);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.anvil.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
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
}