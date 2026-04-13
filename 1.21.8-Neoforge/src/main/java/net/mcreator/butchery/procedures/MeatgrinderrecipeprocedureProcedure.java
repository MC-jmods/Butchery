package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.ModList;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

public class MeatgrinderrecipeprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == Blocks.AIR.asItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("craftingTime", 0);
					_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState())
				.is(BlockTags.create(ResourceLocation.parse("butchery:scrappable"))) || (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("butchery:scrappable"))))
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == ButcheryModItems.MEAT_SCRAPS.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("craftingTime", 150);
					_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState())
						.is(BlockTags.create(ResourceLocation.parse("butchery:carcass")))
						|| ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState())
								.is(BlockTags.create(ResourceLocation.parse("butchery:drained_carcass")))) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(ButcheryModItems.MEAT_SCRAPS.get()).copy();
						_setstack.setCount((int) (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + Mth.nextDouble(RandomSource.create(), 3, 8)));
						_itemHandlerModifiable.setStackInSlot(4, _setstack);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(ButcheryModItems.MEAT_SCRAPS.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
						_itemHandlerModifiable.setStackInSlot(4, _setstack);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		} else if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_pork")))
				|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_pork"))))
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == ButcheryModItems.RAW_SAUSAGE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).getCount() == 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("craftingTime", 150);
					_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.RAW_SAUSAGE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(4, _setstack);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_pork")))
				|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_pork"))))
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == ButcheryModItems.RAW_BLOOD_SAUSAGE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get()
				&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == ButcheryModItems.BOTTLE_OF_BLOOD.get()
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).is(ItemTags.create(ResourceLocation.parse("c:blood_bottle")))
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).copy()).is(ItemTags.create(ResourceLocation.parse("forge:blood_bottle"))))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("craftingTime", 150);
					_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 1;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 5;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 3;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(5, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.RAW_BLOOD_SAUSAGE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(4, _setstack);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_mutton")))
				|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_mutton"))))
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == ButcheryModItems.RAW_LAMB_MINCE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("craftingTime", 150);
					_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					int _slotid = 0;
					ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
					_stk.shrink(1);
					_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ButcheryModItems.RAW_LAMB_MINCE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(4, _setstack);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else if (ModList.get().isLoaded("farmersdelight") == false ^ ButcheryconfigConfiguration.FARMERS_DELIGHT.get() == false) {
			if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_beef")))
					|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_beef"))))
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
							|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == ButcheryModItems.RAW_BEEF_MINCE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("craftingTime", 150);
						_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						int _slotid = 0;
						ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
						_stk.shrink(1);
						_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(ButcheryModItems.RAW_BEEF_MINCE.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
						_itemHandlerModifiable.setStackInSlot(4, _setstack);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		} else if (ModList.get().isLoaded("farmersdelight") == true && ButcheryconfigConfiguration.FARMERS_DELIGHT.get() == true) {
			if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_beef")))
					|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_beef"))))
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() == 0
							|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == BuiltInRegistries.ITEM.getValue(ResourceLocation.parse("farmersdelight:minced_beef"))
									&& itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() <= 63)) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("craftingTime", 150);
						_blockEntity.getPersistentData().putDouble("craftingProgress", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "craftingProgress") >= 150) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						int _slotid = 0;
						ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
						_stk.shrink(1);
						_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse("farmersdelight:minced_beef"))).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() + 1);
						_itemHandlerModifiable.setStackInSlot(4, _setstack);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
		if ((!(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
				|| !(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))
				&& !((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get())
				&& !((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get())) {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
				|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))
				&& !((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get())
				&& !((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get())) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& (!((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get())
						|| !(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
						|| !(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))) {
			{
				int _value = 2;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get()
				&& (!(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
						|| !(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))) {
			{
				int _value = 4;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == ButcheryModItems.SAUSAGE_ATTACHMENT.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == ButcheryModItems.INTESTINES.get()
				&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("forge:raw_meat")))
						|| (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).is(ItemTags.create(ResourceLocation.parse("c:raw_meat"))))) {
			{
				int _value = 5;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}