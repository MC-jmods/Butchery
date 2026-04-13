package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
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
import net.mcreator.butchery.procedures.DrainedTurtlecarcassbrokenProcedure;
import net.mcreator.butchery.block.entity.DrainedTurtlecarcassBlockEntity;

public class DrainedTurtlecarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 17);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DrainedTurtlecarcassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				if (s.getValue(BLOCKSTATE) == 11)
					return 0;
				if (s.getValue(BLOCKSTATE) == 12)
					return 0;
				if (s.getValue(BLOCKSTATE) == 13)
					return 0;
				if (s.getValue(BLOCKSTATE) == 14)
					return 0;
				if (s.getValue(BLOCKSTATE) == 15)
					return 0;
				if (s.getValue(BLOCKSTATE) == 16)
					return 0;
				if (s.getValue(BLOCKSTATE) == 17)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
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
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		if (state.getValue(BLOCKSTATE) == 17) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2.475, -0.38925, 6.14408, 13.475, 17.61075, 10.14408), box(-1.525, -1.38925, 9.14408, 17.475, 18.61075, 15.14408));
				case NORTH -> Shapes.or(box(2.525, -0.38925, 5.85592, 13.525, 17.61075, 9.85592), box(-1.475, -1.38925, 0.85592, 17.525, 18.61075, 6.85592));
				case EAST -> Shapes.or(box(6.14408, -0.38925, 2.525, 10.14408, 17.61075, 13.525), box(9.14408, -1.38925, -1.475, 15.14408, 18.61075, 17.525));
				case WEST -> Shapes.or(box(5.85592, -0.38925, 2.475, 9.85592, 17.61075, 13.475), box(0.85592, -1.38925, -1.525, 6.85592, 18.61075, 17.475));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(-1.99925, 3.07843, -2.05017, 18.00075, 9.07843, 16.94983), box(-0.99925, 0.07843, 1.94983, 17.00075, 4.07843, 12.94983));
			case NORTH -> Shapes.or(box(-2.00075, 3.07843, -0.94983, 17.99925, 9.07843, 18.05017), box(-1.00075, 0.07843, 3.05017, 16.99925, 4.07843, 14.05017));
			case EAST -> Shapes.or(box(-2.05017, 3.07843, -2.00075, 16.94983, 9.07843, 17.99925), box(1.94983, 0.07843, -1.00075, 12.94983, 4.07843, 16.99925));
			case WEST -> Shapes.or(box(-0.94983, 3.07843, -1.99925, 18.05017, 9.07843, 18.00075), box(3.05017, 0.07843, -0.99925, 14.05017, 4.07843, 17.00075));
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
		DrainedTurtlecarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedTurtlecarcassBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof DrainedTurtlecarcassBlockEntity be) {
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
		if (tileentity instanceof DrainedTurtlecarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}