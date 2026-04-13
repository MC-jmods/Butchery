package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
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
import net.minecraft.util.ProblemReporter;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HangingcatcarcasscutupProcedure {
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
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get())
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip28
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip28)
								: -1) == 1) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_OCELOT_CARCASS.get().defaultBlockState()));
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
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/all_black_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/black_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/bshorthair_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/calico_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/jellie_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/persian_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/ragdoll_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/red_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/siamese_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/tabby_cat_head_drop")))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/white_cat_head_drop")))
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
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:skinning_knives")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:skinning_knives")))) {
			if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "isDrained") == true) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get())
						&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip119
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip119)
								: -1) == 2) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/all_black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/all_black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/all_black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/all_black_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/black_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/black_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/bshorthair_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/bshorthair_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/bshorthair_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/bshorthair_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/calico_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/calico_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/calico_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/calico_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/jellie_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/jellie_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/jellie_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/jellie_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/persian_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/persian_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/persian_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/persian_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/ragdoll_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/ragdoll_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/ragdoll_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/ragdoll_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_RED_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/red_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/red_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/red_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/red_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/siamese_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/siamese_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/siamese_cat_skin_drop")))
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
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/siamese_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/tabby_cat_skin_drop")))
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
								for (int index27 = 0; index27 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index27++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/tabby_cat_skin_drop")))
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
								for (int index28 = 0; index28 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index28++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/tabby_cat_skin_drop")))
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
								for (int index29 = 0; index29 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index29++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/tabby_cat_skin_drop")))
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
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS.get()) {
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/white_cat_skin_drop")))
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
								for (int index30 = 0; index30 < (int) Mth.nextDouble(RandomSource.create(), 0, 1); index30++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/white_cat_skin_drop")))
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
								for (int index31 = 0; index31 < (int) Mth.nextDouble(RandomSource.create(), 0, 2); index31++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/white_cat_skin_drop")))
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
								for (int index32 = 0; index32 < (int) Mth.nextDouble(RandomSource.create(), 0, 3); index32++) {
									if (!world.isClientSide() && world.getServer() != null) {
										for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("butchery:blocks/white_cat_skin_drop")))
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
					ButcheryMod.queueServerWork(1, () -> {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = (blockStateWithDirection((new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(ButcheryModBlocks.CAT_CARCASS.get().defaultBlockState(), "blockstate", 1)), (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y + 1, z)))))));
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING, world.registryAccess(), _bnbt));
									} catch (Exception ignored) {
									}
								}
							}
						}
						world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ButcheryModBlocks.DRAINED_OCELOT_CARCASS.get().defaultBlockState()));
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
					});
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

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}

	private static BlockState blockStateWithDirection(BlockState blockState, Direction newValue) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty enumProperty && enumProperty.getPossibleValues().contains(newValue))
			return blockState.setValue(enumProperty, newValue);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty enumProperty && enumProperty.getPossibleValues().contains(newValue.getAxis()))
			return blockState.setValue(enumProperty, newValue.getAxis());
		return blockState;
	}
}