package net.mcreator.butchery.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModParticleTypes;
import net.mcreator.butchery.init.ButcheryModItems;

public class Wither_bonemeal_right_clickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ROSE_BUSH) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ROSE_BUSH) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(ButcheryModItems.WITHER_BONE_MEAL.get()).copy();
						_setstack.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
				if (Math.random() < 0.2) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.WITHER_ROSE.defaultBlockState(), 3);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("The rose withered and died.."), true);
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ButcheryModParticleTypes.WITHERSMOKE.get()), (x + 0.5), (y - 1), (z + 0.5), 15, 0.4, 1, 0.4, 0.02);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.grass.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.grass.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
					}
				}
			}
		}
	}
}