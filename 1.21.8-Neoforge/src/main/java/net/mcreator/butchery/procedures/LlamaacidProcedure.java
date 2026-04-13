package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class LlamaacidProcedure {
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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:llama"))) || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("c:llama")))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:acid_bottle")))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:acid_bottle")))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.empty")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.bottle.empty")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:acid")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("butchery:acid")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1);
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.5), (y + 0.55), (z + 0.5), 20, 0.1, 0.1, 0.1, 0.1);
				ButcheryMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.25), y, (z + 0.25), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(40, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.55), (y + 0.55), (z + 0.55), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(60, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.5), y, (z + 0.5), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(80, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.25), (y + 0.55), (z + 0.25), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.55), y, (z + 0.55), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(120, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.5), (y + 0.55), (z + 0.5), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(140, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.25), y, (z + 0.25), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(160, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.55), y, (z + 0.55), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(180, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.25), y, (z + 0.25), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(200, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 0.55), (y + 0.55), (z + 0.55), 20, 0.1, 0.1, 0.1, 0.1);
				});
				ButcheryMod.queueServerWork(220, () -> {
					if (((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:llama"))) || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("c:llama"))))
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip43
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip43)
									: -1) == 0) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = ButcheryModBlocks.LLAMA_SKELETON.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:llama")))
							|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("c:llama"))))
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip50
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip50)
									: -1) == 1) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(ButcheryModBlocks.LLAMA_SKELETON.get().defaultBlockState(), "blockstate", 1));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				});
			}
		}
	}
}