package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.FluidState;
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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.procedures.DrainedPandacarcassbrokenProcedure;
import net.mcreator.butchery.block.entity.DrainedpandacarcassBlockEntity;

public class DrainedpandacarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 9);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedpandacarcassBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.HONEY_BLOCK).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
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
				default -> Shapes.or(box(-1, -3, 2, 16, 8, 10), box(-1, 8, 6, 16, 18, 15));
				case NORTH -> Shapes.or(box(0, -3, 6, 17, 8, 14), box(0, 8, 1, 17, 18, 10));
				case EAST -> Shapes.or(box(2, -3, 0, 10, 8, 17), box(6, 8, 0, 15, 18, 17));
				case WEST -> Shapes.or(box(6, -3, -1, 14, 8, 16), box(1, 8, -1, 10, 18, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, -3, 2, 16, 8, 10), box(-1, 8, 6, 16, 18, 15));
				case NORTH -> Shapes.or(box(0, -3, 6, 17, 8, 14), box(0, 8, 1, 17, 18, 10));
				case EAST -> Shapes.or(box(2, -3, 0, 10, 8, 17), box(6, 8, 0, 15, 18, 17));
				case WEST -> Shapes.or(box(6, -3, -1, 14, 8, 16), box(1, 8, -1, 10, 18, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, -3, 2, 16, 8, 10), box(-1, 8, 6, 16, 18, 15));
				case NORTH -> Shapes.or(box(0, -3, 6, 17, 8, 14), box(0, 8, 1, 17, 18, 10));
				case EAST -> Shapes.or(box(2, -3, 0, 10, 8, 17), box(6, 8, 0, 15, 18, 17));
				case WEST -> Shapes.or(box(6, -3, -1, 14, 8, 16), box(1, 8, -1, 10, 18, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, -3, 2, 16, 8, 10), box(-1, 8, 6, 16, 18, 15));
				case NORTH -> Shapes.or(box(0, -3, 6, 17, 8, 14), box(0, 8, 1, 17, 18, 10));
				case EAST -> Shapes.or(box(2, -3, 0, 10, 8, 17), box(6, 8, 0, 15, 18, 17));
				case WEST -> Shapes.or(box(6, -3, -1, 14, 8, 16), box(1, 8, -1, 10, 18, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, -3, 2, 16, 8, 10), box(-1, 8, 6, 16, 18, 15));
				case NORTH -> Shapes.or(box(0, -3, 6, 17, 8, 14), box(0, 8, 1, 17, 18, 10));
				case EAST -> Shapes.or(box(2, -3, 0, 10, 8, 17), box(6, 8, 0, 15, 18, 17));
				case WEST -> Shapes.or(box(6, -3, -1, 14, 8, 16), box(1, 8, -1, 10, 18, 16));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(-5.55475, 0.03068, 1.974, 20.44525, 19.03068, 14.974);
			case NORTH -> box(-4.44525, 0.03068, 1.026, 21.55475, 19.03068, 14.026);
			case EAST -> box(1.974, 0.03068, -4.44525, 14.974, 19.03068, 21.55475);
			case WEST -> box(1.026, 0.03068, -5.55475, 14.026, 19.03068, 20.44525);
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
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		Drained_carcass_placedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DrainedPandacarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedpandacarcassBlockEntity(pos, state);
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
			if (blockEntity instanceof DrainedpandacarcassBlockEntity be) {
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
		if (tileentity instanceof DrainedpandacarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}