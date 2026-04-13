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
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.butchery.init.ButcheryModEnchantments;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PolarbearcarcassdropProcedure {
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
		if (entity instanceof PolarBear || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:polar_bear"))) || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("c:polar_bear")))) {
			if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.isBaby())) {
				if (ButcheryconfigConfiguration.POLAR_BEAR_CARCASS.get() == true) {
					if (ButcheryconfigConfiguration.SPECIFIC_TOOLS.get() == true) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
								|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))
								|| EnchantmentHelper.getItemEnchantmentLevel(ButcheryModEnchantments.BUTCHERSTOUCH.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							} else if (event != null && event.hasResult()) {
								event.setResult(Event.Result.DENY);
							}
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/polar_bear_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					} else if (ButcheryconfigConfiguration.SPECIFIC_TOOLS.get() == false) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						if (!world.isClientSide() && world.getServer() != null) {
							for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/polar_bear_carcass_loot"))
									.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else if (sourceentity instanceof Animal) {
						if (ButcheryconfigConfiguration.POLAR_BEAR_CARCASS.get() == true) {
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							} else if (event != null && event.hasResult()) {
								event.setResult(Event.Result.DENY);
							}
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/polar_bear_carcass_loot"))
										.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					} else if (sourceentity instanceof Monster) {
						if (ButcheryconfigConfiguration.POLAR_BEAR_CARCASS.get() == true) {
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							} else if (event != null && event.hasResult()) {
								event.setResult(Event.Result.DENY);
							}
							if (!world.isClientSide() && world.getServer() != null) {
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/polar_bear_carcass_loot"))
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