package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IronGolemCutUpProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:hacksaw")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:hacksaw")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM.get()
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip7)
							: -1) == 0) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 1);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 2);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 3);
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
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip55
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip55)
							: -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_head_drop"))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM.get()
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip63
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip63)
							: -1) == 1) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 3) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 4);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 4) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 5);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 5) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 6);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip111
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip111)
							: -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_arm_drop"))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM.get()
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip119)
							: -1) == 2) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 6) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 7);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 7) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 8);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 8) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 9);
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
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip167
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip167)
							: -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_body_drop"))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM.get()
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip175
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip175)
							: -1) == 3) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 9) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 10);
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
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip193
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip193)
							: -1) == 3) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_legs_drop"))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM_ARMS.get()) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 1);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 2);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 3);
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
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), y, (z + 0.25), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1), (z + 0.75), 40, 0.1, 0.1, 0.1, 0.8);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_1_drop"))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 1) {
							for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index0++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_1_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 2) {
							for (int index1 = 0; index1 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index1++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_1_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 3) {
							for (int index2 = 0; index2 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index2++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_1_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM_BODY.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.REPAIRED_IRON_GOLEM_BODY.get()) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 1);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 2);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 3);
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
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0.5), (z + 0.75), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), y, (z + 0.5), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 1), (z + 0.25), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 0), (z + 0.75), 40, 0.2, 0.2, 0.2, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 0.5), (z + 0.5), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), y, (z + 0.25), 40, 0.1, 0.1, 0.1, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.75), (y + 1), (z + 0.75), 40, 0.1, 0.1, 0.1, 0.8);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_2_drop"))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 1) {
							for (int index3 = 0; index3 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index3++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_2_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 2) {
							for (int index4 = 0; index4 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index4++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_2_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 3) {
							for (int index5 = 0; index5 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index5++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_2_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.IRON_GOLEM_LEGS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.REPAIRED_IRON_GOLEM_LEGS.get()) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 1);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 2);
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
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
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
				}.getValue(world, BlockPos.containing(x, y, z), "golemSaw") == 2) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("golemSaw", 3);
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
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.5), (y + 1), (z + 0.5), 40, 0.3, 0.3, 0.3, 0.8);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.SPARKS.get()), (x + 0.25), (y + 0), (z + 0.25), 40, 0.3, 0.3, 0.3, 0.8);
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
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.IRON_BLOCK.defaultBlockState()));
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:hacksaw")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_3_drop"))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 1) {
							for (int index6 = 0; index6 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index6++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_3_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 2) {
							for (int index7 = 0; index7 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index7++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_3_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) == 3) {
							for (int index8 = 0; index8 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index8++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/iron_golem_cut_3_drop"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}