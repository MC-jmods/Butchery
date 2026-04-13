package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;

public class DrainedgrayfrogcarcassBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 6);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DrainedgrayfrogcarcassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.HONEY_BLOCK).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				default -> box(4.425, 2.69795, 8.08295, 11.425, 11.69795, 13.08295);
				case NORTH -> box(4.575, 2.69795, 2.91705, 11.575, 11.69795, 7.91705);
				case EAST -> box(8.08295, 2.69795, 4.575, 13.08295, 11.69795, 11.575);
				case WEST -> box(2.91705, 2.69795, 4.425, 7.91705, 11.69795, 11.425);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1.6, 0, 0, 17.4, 2, 16), box(4.4, 2.05, 4, 11.4, 6.05, 13));
				case NORTH -> Shapes.or(box(-1.4, 0, 0, 17.6, 2, 16), box(4.6, 2.05, 3, 11.6, 6.05, 12));
				case EAST -> Shapes.or(box(0, 0, -1.4, 16, 2, 17.6), box(4, 2.05, 4.6, 13, 6.05, 11.6));
				case WEST -> Shapes.or(box(0, 0, -1.6, 16, 2, 17.4), box(3, 2.05, 4.4, 12, 6.05, 11.4));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1.6, 0, 0, 17.4, 2, 16), box(4.4, 2.05, 4, 11.4, 6.05, 13));
				case NORTH -> Shapes.or(box(-1.4, 0, 0, 17.6, 2, 16), box(4.6, 2.05, 3, 11.6, 6.05, 12));
				case EAST -> Shapes.or(box(0, 0, -1.4, 16, 2, 17.6), box(4, 2.05, 4.6, 13, 6.05, 11.6));
				case WEST -> Shapes.or(box(0, 0, -1.6, 16, 2, 17.4), box(3, 2.05, 4.4, 12, 6.05, 11.4));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1.6, 0, 0, 17.4, 2, 16), box(4.4, 2.05, 4, 11.4, 6.05, 13));
				case NORTH -> Shapes.or(box(-1.4, 0, 0, 17.6, 2, 16), box(4.6, 2.05, 3, 11.6, 6.05, 12));
				case EAST -> Shapes.or(box(0, 0, -1.4, 16, 2, 17.6), box(4, 2.05, 4.6, 13, 6.05, 11.6));
				case WEST -> Shapes.or(box(0, 0, -1.6, 16, 2, 17.4), box(3, 2.05, 4.4, 12, 6.05, 11.4));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1.6, 0, 0, 17.4, 2, 16), box(4.4, 2.05, 4, 11.4, 6.05, 13));
				case NORTH -> Shapes.or(box(-1.4, 0, 0, 17.6, 2, 16), box(4.6, 2.05, 3, 11.6, 6.05, 12));
				case EAST -> Shapes.or(box(0, 0, -1.4, 16, 2, 17.6), box(4, 2.05, 4.6, 13, 6.05, 11.6));
				case WEST -> Shapes.or(box(0, 0, -1.6, 16, 2, 17.4), box(3, 2.05, 4.4, 12, 6.05, 11.4));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1.6, 0, 0, 17.4, 2, 16), box(4.4, 2.05, 4, 11.4, 6.05, 13));
				case NORTH -> Shapes.or(box(-1.4, 0, 0, 17.6, 2, 16), box(4.6, 2.05, 3, 11.6, 6.05, 12));
				case EAST -> Shapes.or(box(0, 0, -1.4, 16, 2, 17.6), box(4, 2.05, 4.6, 13, 6.05, 11.6));
				case WEST -> Shapes.or(box(0, 0, -1.6, 16, 2, 17.4), box(3, 2.05, 4.4, 12, 6.05, 11.4));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(4.5, 0.125, 4, 11.5, 5.125, 13);
			case NORTH -> box(4.5, 0.125, 3, 11.5, 5.125, 12);
			case EAST -> box(4, 0.125, 4.5, 13, 5.125, 11.5);
			case WEST -> box(3, 0.125, 4.5, 12, 5.125, 11.5);
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
}