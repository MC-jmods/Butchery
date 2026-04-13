package net.mcreator.butchery.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.world.inventory.TaxidermystationguiMenu;
import net.mcreator.butchery.init.ButcheryModBlocks;

import io.netty.buffer.Unpooled;

public class TaxidermytableOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) == 0) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Taxidermystationgui");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TaxidermystationguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip7) : -1) == 1
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x - 1, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Taxidermystationgui");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TaxidermystationguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip15 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip15) : -1) == 1
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x + 1, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Taxidermystationgui");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TaxidermystationguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip23) : -1) == 1
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z + 1);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Taxidermystationgui");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TaxidermystationguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else if ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip31 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip31) : -1) == 1
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ButcheryModBlocks.TAXIDERMY_TABLE.get()) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z - 1);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Taxidermystationgui");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TaxidermystationguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (blockState.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (blockState.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}
}