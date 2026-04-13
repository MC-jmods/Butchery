package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
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
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;
import net.mcreator.butchery.ButcheryMod;

public class WithercutupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("butchery:boss_tool")))) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "witherCut") == 0) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(5, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("witherCut", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.WITHER_SKELETON_WALL_SKULL.defaultBlockState()));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:crumbling")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("butchery:crumbling")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
					}
				}
				if (!world.isClientSide() && world.getServer() != null) {
					for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/wither_heart_drop"))
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
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/wither_heart_drop"))
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
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/wither_heart_drop"))
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
								for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(ResourceLocation.parse("butchery:blocks/wither_heart_drop"))
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
				new Object() {
					void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.WITHERSMOKE.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 2)), y, (z + Mth.nextDouble(RandomSource.create(), 0, 2)), 10,
									(Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0.1, 0.75)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.WITHERSMOKE.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 2)), y, (z - Mth.nextDouble(RandomSource.create(), 0, 2)), 10,
									(Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0.1, 0.75)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.WITHERSMOKE.get()), (x - Mth.nextDouble(RandomSource.create(), 0, 2)), y, (z + Mth.nextDouble(RandomSource.create(), 0, 2)), 10,
									(Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0.1, 0.75)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.WITHERSMOKE.get()), (x - Mth.nextDouble(RandomSource.create(), 0, 2)), y, (z - Mth.nextDouble(RandomSource.create(), 0, 2)), 10,
									(Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0, 0.75)), (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)));
						final int tick2 = ticks;
						ButcheryMod.queueServerWork(tick2, () -> {
							if (timedlooptotal > timedloopiterator + 1) {
								timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
							}
						});
					}
				}.timedLoop(0, 25, 1);
				ButcheryMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
		}
	}
}