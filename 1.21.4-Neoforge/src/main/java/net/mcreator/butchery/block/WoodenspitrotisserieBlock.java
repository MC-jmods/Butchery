package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.WoodenspitrotisserieNeighbourBlockChangesProcedure;
import net.mcreator.butchery.block.entity.WoodenspitrotisserieBlockEntity;

import javax.annotation.Nullable;

public class WoodenspitrotisserieBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public WoodenspitrotisserieBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(25, -16, -2, 31, 14, 16), box(-15, -16, -2, -9, 14, 16), box(-16, 8, 4.5, 32, 14, 10.5), box(-0.0527, 1.23717, 2.55847, 15.9473, 9.23717, 12.55847));
				case NORTH -> Shapes.or(box(-15, -16, 0, -9, 14, 18), box(25, -16, 0, 31, 14, 18), box(-16, 8, 5.5, 32, 14, 11.5), box(0.0527, 1.23717, 3.44153, 16.0527, 9.23717, 13.44153));
				case EAST -> Shapes.or(box(-2, -16, -15, 16, 14, -9), box(-2, -16, 25, 16, 14, 31), box(4.5, 8, -16, 10.5, 14, 32), box(2.55847, 1.23717, 0.0527, 12.55847, 9.23717, 16.0527));
				case WEST -> Shapes.or(box(0, -16, 25, 18, 14, 31), box(0, -16, -15, 18, 14, -9), box(5.5, 8, -16, 11.5, 14, 32), box(3.44153, 1.23717, -0.0527, 13.44153, 9.23717, 15.9473));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(25, -16, -2, 31, 14, 16), box(-15, -16, -2, -9, 14, 16), box(-16, 8, 4.5, 32, 14, 10.5), box(-0.0527, 1.23717, 2.55847, 15.9473, 9.23717, 12.55847));
				case NORTH -> Shapes.or(box(-15, -16, 0, -9, 14, 18), box(25, -16, 0, 31, 14, 18), box(-16, 8, 5.5, 32, 14, 11.5), box(0.0527, 1.23717, 3.44153, 16.0527, 9.23717, 13.44153));
				case EAST -> Shapes.or(box(-2, -16, -15, 16, 14, -9), box(-2, -16, 25, 16, 14, 31), box(4.5, 8, -16, 10.5, 14, 32), box(2.55847, 1.23717, 0.0527, 12.55847, 9.23717, 16.0527));
				case WEST -> Shapes.or(box(0, -16, 25, 18, 14, 31), box(0, -16, -15, 18, 14, -9), box(5.5, 8, -16, 11.5, 14, 32), box(3.44153, 1.23717, -0.0527, 13.44153, 9.23717, 15.9473));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(25, -16, -2, 31, 14, 16), box(-15, -16, -2, -9, 14, 16), box(-16, 8, 4.5, 32, 14, 10.5), box(-0.0527, 1.23717, 2.55847, 15.9473, 9.23717, 12.55847));
				case NORTH -> Shapes.or(box(-15, -16, 0, -9, 14, 18), box(25, -16, 0, 31, 14, 18), box(-16, 8, 5.5, 32, 14, 11.5), box(0.0527, 1.23717, 3.44153, 16.0527, 9.23717, 13.44153));
				case EAST -> Shapes.or(box(-2, -16, -15, 16, 14, -9), box(-2, -16, 25, 16, 14, 31), box(4.5, 8, -16, 10.5, 14, 32), box(2.55847, 1.23717, 0.0527, 12.55847, 9.23717, 16.0527));
				case WEST -> Shapes.or(box(0, -16, 25, 18, 14, 31), box(0, -16, -15, 18, 14, -9), box(5.5, 8, -16, 11.5, 14, 32), box(3.44153, 1.23717, -0.0527, 13.44153, 9.23717, 15.9473));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(25, -16, -2, 31, 14, 16), box(-15, -16, -2, -9, 14, 16), box(-16, 8, 4.5, 32, 14, 10.5));
			case NORTH -> Shapes.or(box(-15, -16, 0, -9, 14, 18), box(25, -16, 0, 31, 14, 18), box(-16, 8, 5.5, 32, 14, 11.5));
			case EAST -> Shapes.or(box(-2, -16, -15, 16, 14, -9), box(-2, -16, 25, 16, 14, 31), box(4.5, 8, -16, 10.5, 14, 32));
			case WEST -> Shapes.or(box(0, -16, 25, 18, 14, 31), box(0, -16, -15, 18, 14, -9), box(5.5, 8, -16, 11.5, 14, 32));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		WoodenspitrotisserieNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new WoodenspitrotisserieBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof WoodenspitrotisserieBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof WoodenspitrotisserieBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}