package net.mcreator.butchery.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.butchery.init.ButcheryModEnchantments;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HorsebrowndropProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Horse || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:horse"))) || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("c:horse")))) {
			if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.isBaby())) {
				if (ButcheryconfigConfiguration.HORSE_CARCASS.get() == true) {
					if (ButcheryconfigConfiguration.SPECIFIC_TOOLS.get() == true) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
								|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))
								|| EnchantmentHelper.getItemEnchantmentLevel(ButcheryModEnchantments.BUTCHERSTOUCH.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
							Horse horseEntity = (Horse) entity;
							if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("NONE")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && horseEntity.getMarkings().toString().contains("WHITE") && !horseEntity.getMarkings().toString().contains("WHITE_DOTS")
									&& !horseEntity.getMarkings().toString().contains("WHITE_FIELD") && !horseEntity.getVariant().toString().contains("DARK_BROWN")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_FIELD")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("BLACK_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							ButcheryMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"/kill @e[type=item,nbt={Item:{id:\"minecraft:leather\"}},distance=..20]");
									}
								}
							});
						}
					} else if (ButcheryconfigConfiguration.SPECIFIC_TOOLS.get() == false) {
						Horse horseEntity = (Horse) entity;
						if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("NONE")) {
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (horseEntity.getVariant().toString().contains("BROWN") && horseEntity.getMarkings().toString().contains("WHITE") && !horseEntity.getMarkings().toString().contains("WHITE_DOTS")
								&& !horseEntity.getMarkings().toString().contains("WHITE_FIELD") && !horseEntity.getVariant().toString().contains("DARK_BROWN")) {
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_FIELD")) {
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_DOTS")) {
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("BLACK_DOTS")) {
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						ButcheryMod.queueServerWork(1, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/kill @e[type=item,nbt={Item:{id:\"minecraft:leather\"}},distance=..20]");
								}
							}
						});
					} else if (sourceentity instanceof Animal) {
						if (ButcheryconfigConfiguration.HORSE_CARCASS.get() == true) {
							Horse horseEntity = (Horse) entity;
							if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("NONE")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && horseEntity.getMarkings().toString().contains("WHITE") && !horseEntity.getMarkings().toString().contains("WHITE_DOTS")
									&& !horseEntity.getMarkings().toString().contains("WHITE_FIELD") && !horseEntity.getVariant().toString().contains("DARK_BROWN")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_FIELD")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("BLACK_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							ButcheryMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"/kill @e[type=item,nbt={Item:{id:\"minecraft:leather\"}},distance=..20]");
									}
								}
							});
						}
					} else if (sourceentity instanceof Monster) {
						if (ButcheryconfigConfiguration.HORSE_CARCASS.get() == true) {
							Horse horseEntity = (Horse) entity;
							if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("NONE")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && horseEntity.getMarkings().toString().contains("WHITE") && !horseEntity.getMarkings().toString().contains("WHITE_DOTS")
									&& !horseEntity.getMarkings().toString().contains("WHITE_FIELD") && !horseEntity.getVariant().toString().contains("DARK_BROWN")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_FIELD")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("WHITE_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else if (horseEntity.getVariant().toString().contains("BROWN") && !horseEntity.getVariant().toString().contains("DARK_BROWN") && horseEntity.getMarkings().toString().contains("BLACK_DOTS")) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/regular_brown_carcass_loot"))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							ButcheryMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"/kill @e[type=item,nbt={Item:{id:\"minecraft:leather\"}},distance=..20]");
									}
								}
							});
						}
					}
				}
			}
		}
	}
}