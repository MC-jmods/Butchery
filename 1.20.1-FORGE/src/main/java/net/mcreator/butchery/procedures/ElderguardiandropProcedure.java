package net.mcreator.butchery.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModEnchantments;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ElderguardiandropProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof ElderGuardian || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:elder_guardian")))
				|| entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("c:elder_guardian")))) {
			if (ButcheryconfigConfiguration.ELDER_GUARDIAN_CARCASS.get() == true) {
				if (ButcheryconfigConfiguration.SPECIFIC_TOOLS.get()) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:cleaver")))
							|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:cleaver")))
							|| EnchantmentHelper.getItemEnchantmentLevel(ButcheryModEnchantments.BUTCHERSTOUCH.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						if (entity instanceof ElderGuardian) {
							ButcheryMod.queueServerWork(10, () -> {
								world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), ButcheryModBlocks.ELDER_GUARDIAN_CARCASS.get().defaultBlockState(), 3);
							});
						}
					}
				} else if (!ButcheryconfigConfiguration.SPECIFIC_TOOLS.get()) {
					if (entity instanceof ElderGuardian) {
						ButcheryMod.queueServerWork(10, () -> {
							world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), ButcheryModBlocks.ELDER_GUARDIAN_CARCASS.get().defaultBlockState(), 3);
						});
					}
				}
			}
		}
	}
}