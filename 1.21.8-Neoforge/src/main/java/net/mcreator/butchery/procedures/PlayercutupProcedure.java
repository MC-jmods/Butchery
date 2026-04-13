package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

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
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayercutupProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))) {
			if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isDrained") == true) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip8
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip8)
								: -1) == 0) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 11;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINEDPLAYERCORPSE.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_head_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip22
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip22)
								: -1) == 11) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 12;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index0++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index1 = 0; index1 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index1++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index2 = 0; index2 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index2++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip61
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip61)
								: -1) == 12) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 13;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index3 = 0; index3 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index3++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index4 = 0; index4 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index4++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index5 = 0; index5 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index5++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_arm_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip100)
								: -1) == 13) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 14;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_chest_skin_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index6 = 0; index6 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index6++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_chest_skin_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index7 = 0; index7 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index7++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_chest_skin_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index8 = 0; index8 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index8++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_chest_skin_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip139
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip139)
								: -1) == 14) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 15;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_heart_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index9 = 0; index9 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index9++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_heart_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index10 = 0; index10 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index10++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_heart_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index11 = 0; index11 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index11++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_heart_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip178
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip178)
								: -1) == 15) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 16;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_stomach_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index12 = 0; index12 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index12++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_stomach_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index13 = 0; index13 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index13++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_stomach_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index14 = 0; index14 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index14++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_stomach_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip217
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip217)
								: -1) == 16) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 17;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_liver_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index15 = 0; index15 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index15++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_liver_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index16 = 0; index16 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index16++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_liver_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index17 = 0; index17 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index17++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_liver_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip256
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip256)
								: -1) == 17) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 19;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_intestine_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index18 = 0; index18 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index18++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_intestine_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index19 = 0; index19 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index19++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_intestine_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index20 = 0; index20 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index20++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_intestine_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip295
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip295)
								: -1) == 19) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 18;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_body_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index21 = 0; index21 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index21++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_body_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index22 = 0; index22 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index22++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_body_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index23 = 0; index23 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index23++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_body_drop")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINEDPLAYERCORPSE.get()
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip334
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip334)
								: -1) == 18) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_PIG_CARCASS.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.axe.strip")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.honey_block.step")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (!world.isClientSide() && world.getServer() != null) {
						for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
								.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (ButcheryconfigConfiguration.LOOTING_ENCHANT.get() == true) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 1) {
							for (int index24 = 0; index24 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index24++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 2) {
							for (int index25 = 0; index25 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index25++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) != 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING)) == 3) {
							for (int index26 = 0; index26 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index26++) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/player_leg_drop")))
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

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBooleanOr(tag, false);
		return false;
	}
}