package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.ButcheryMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ConvertingskinProcedure {
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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SKIN_RACK.get()
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1) >= 1
				&& !(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip5)
						: -1) == 26)
				&& !(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip7)
						: -1) == 27)
				&& !(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip9)
						: -1) == 30)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.SALT.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:salt")))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:salt")))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.sand.place")), SoundSource.NEUTRAL, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.sand.place")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				{
					int _value = 26;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SKIN_RACK.get()
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip24
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip24)
						: -1) < 26) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.SALT.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("forge:salt")))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:salt")))) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You've already applied salt to this skin."), true);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SKIN_RACK.get()
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip35
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip35)
						: -1) == 26) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.SPONGE.get()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) >= 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
					}
				}
				{
					int _value = 27;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if ((entity instanceof ServerPlayer _plr43 && _plr43.level() instanceof ServerLevel _serverLevel43
						&& _plr43.getAdvancements().getOrStartProgress(_serverLevel43.getServer().getAdvancements().get(ResourceLocation.parse("butchery:splish_splash"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:splish_splash"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						final String _tagName = "spongeWetness";
						final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) - 1);
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				ButcheryMod.queueServerWork(1800, () -> {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SKIN_RACK.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip53)
									: -1) == 27) {
						{
							int _value = 30;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				});
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ButcheryModItems.RAG.get()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) >= 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.fishing_bobber.splash")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
					}
				}
				{
					int _value = 27;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if ((entity instanceof ServerPlayer _plr63 && _plr63.level() instanceof ServerLevel _serverLevel63
						&& _plr63.getAdvancements().getOrStartProgress(_serverLevel63.getServer().getAdvancements().get(ResourceLocation.parse("butchery:splish_splash"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("butchery:splish_splash"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						final String _tagName = "ragWetness";
						final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) - 1);
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				ButcheryMod.queueServerWork(1800, () -> {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ButcheryModBlocks.SKIN_RACK.get()
							&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip73
									? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip73)
									: -1) == 27) {
						{
							int _value = 30;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				});
			}
		}
	}
}