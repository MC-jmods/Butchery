package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModItems;

public class MagicwishbonebreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.MAGIC_WISHBONE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ButcheryModItems.BROKEN_WISHBONE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ButcheryModItems.MAGIC_WISHBONE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:wishbone_break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:wishbone_break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.chime")), SoundSource.NEUTRAL, (float) 0.25, (float) 0.25);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.chime")), SoundSource.NEUTRAL, (float) 0.25, (float) 0.25, false);
				}
			}
			if (Math.random() <= 0.1) {
				for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 4); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (Math.random() <= 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.GOLD_CLEAVER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() <= 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.IRON_HAMMER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() <= 0.1) {
				for (int index1 = 0; index1 < (int) Mth.nextDouble(RandomSource.create(), 1, 8); index1++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SILVERFISH.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (Math.random() <= 0.1) {
				for (int index2 = 0; index2 < (int) Mth.nextDouble(RandomSource.create(), 1, 4); index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 2400, 2, false, false));
			} else if (Math.random() <= 0.1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.MOB);
			} else if (Math.random() <= 0.1) {
				entity.setDeltaMovement(new Vec3(0, 4, 0));
			} else if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 2400, 2, false, false));
			} else if (Math.random() <= 0.1) {
				entity.igniteForSeconds(5);
			}
		}
	}
}