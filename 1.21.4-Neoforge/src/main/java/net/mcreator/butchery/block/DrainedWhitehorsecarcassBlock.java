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

import net.mcreator.butchery.procedures.DrainedregularwhitehorsecarcassbrokenProcedure;
import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.block.entity.DrainedWhitehorsecarcassBlockEntity;

public class DrainedWhitehorsecarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 9);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedWhitehorsecarcassBlock(BlockBehaviour.Properties properties) {
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
				default -> Shapes.or(box(3, -2, 2, 11, 5, 8), box(3, 5, 5, 11, 11, 11), box(3, 11, 6, 11, 16, 14));
				case NORTH -> Shapes.or(box(5, -2, 8, 13, 5, 14), box(5, 5, 5, 13, 11, 11), box(5, 11, 2, 13, 16, 10));
				case EAST -> Shapes.or(box(2, -2, 5, 8, 5, 13), box(5, 5, 5, 11, 11, 13), box(6, 11, 5, 14, 16, 13));
				case WEST -> Shapes.or(box(8, -2, 3, 14, 5, 11), box(5, 5, 3, 11, 11, 11), box(2, 11, 3, 10, 16, 11));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(3, -2, 2, 11, 5, 8), box(3, 5, 5, 11, 11, 11), box(3, 11, 6, 11, 16, 14));
				case NORTH -> Shapes.or(box(5, -2, 8, 13, 5, 14), box(5, 5, 5, 13, 11, 11), box(5, 11, 2, 13, 16, 10));
				case EAST -> Shapes.or(box(2, -2, 5, 8, 5, 13), box(5, 5, 5, 11, 11, 13), box(6, 11, 5, 14, 16, 13));
				case WEST -> Shapes.or(box(8, -2, 3, 14, 5, 11), box(5, 5, 3, 11, 11, 11), box(2, 11, 3, 10, 16, 11));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(3, -2, 2, 11, 5, 8), box(3, 5, 5, 11, 11, 11), box(3, 11, 6, 11, 16, 14));
				case NORTH -> Shapes.or(box(5, -2, 8, 13, 5, 14), box(5, 5, 5, 13, 11, 11), box(5, 11, 2, 13, 16, 10));
				case EAST -> Shapes.or(box(2, -2, 5, 8, 5, 13), box(5, 5, 5, 11, 11, 13), box(6, 11, 5, 14, 16, 13));
				case WEST -> Shapes.or(box(8, -2, 3, 14, 5, 11), box(5, 5, 3, 11, 11, 11), box(2, 11, 3, 10, 16, 11));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(3, -2, 2, 11, 5, 8), box(3, 5, 5, 11, 11, 11), box(3, 11, 6, 11, 16, 14));
				case NORTH -> Shapes.or(box(5, -2, 8, 13, 5, 14), box(5, 5, 5, 13, 11, 11), box(5, 11, 2, 13, 16, 10));
				case EAST -> Shapes.or(box(2, -2, 5, 8, 5, 13), box(5, 5, 5, 11, 11, 13), box(6, 11, 5, 14, 16, 13));
				case WEST -> Shapes.or(box(8, -2, 3, 14, 5, 11), box(5, 5, 3, 11, 11, 11), box(2, 11, 3, 10, 16, 11));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(3, -2, 2, 11, 5, 8), box(3, 5, 5, 11, 11, 11), box(3, 11, 6, 11, 16, 14));
				case NORTH -> Shapes.or(box(5, -2, 8, 13, 5, 14), box(5, 5, 5, 13, 11, 11), box(5, 11, 2, 13, 16, 10));
				case EAST -> Shapes.or(box(2, -2, 5, 8, 5, 13), box(5, 5, 5, 11, 11, 13), box(6, 11, 5, 14, 16, 13));
				case WEST -> Shapes.or(box(8, -2, 3, 14, 5, 11), box(5, 5, 3, 11, 11, 11), box(2, 11, 3, 10, 16, 11));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(-1.27335, 3.95, 2.72665, 20.82665, 14.05, 12.82665);
			case NORTH -> box(-4.82665, 3.95, 3.17335, 17.27335, 14.05, 13.27335);
			case EAST -> box(2.72665, 3.95, -4.82665, 12.82665, 14.05, 17.27335);
			case WEST -> box(3.17335, 3.95, -1.27335, 13.27335, 14.05, 20.82665);
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
		DrainedregularwhitehorsecarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedWhitehorsecarcassBlockEntity(pos, state);
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
			if (blockEntity instanceof DrainedWhitehorsecarcassBlockEntity be) {
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
		if (tileentity instanceof DrainedWhitehorsecarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}