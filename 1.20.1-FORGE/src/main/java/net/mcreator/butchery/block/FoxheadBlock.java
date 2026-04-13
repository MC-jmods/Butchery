package net.mcreator.butchery.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FoxheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FoxheadBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(3.75, 0, 4.05, 11.75, 6, 10.05), box(9.75254, 6.03477, 8, 11.75254, 8.03477, 9), box(3.75254, 6.03477, 8, 5.75254, 8.03477, 9), box(5.75, 0, 10.05, 9.75, 2, 13.05));
			case NORTH -> Shapes.or(box(4.25, 0, 5.95, 12.25, 6, 11.95), box(4.24746, 6.03477, 7, 6.24746, 8.03477, 8), box(10.24746, 6.03477, 7, 12.24746, 8.03477, 8), box(6.25, 0, 2.95, 10.25, 2, 5.95));
			case EAST -> Shapes.or(box(4.05, 0, 4.25, 10.05, 6, 12.25), box(8, 6.03477, 4.24746, 9, 8.03477, 6.24746), box(8, 6.03477, 10.24746, 9, 8.03477, 12.24746), box(10.05, 0, 6.25, 13.05, 2, 10.25));
			case WEST -> Shapes.or(box(5.95, 0, 3.75, 11.95, 6, 11.75), box(7, 6.03477, 9.75254, 8, 8.03477, 11.75254), box(7, 6.03477, 3.75254, 8, 8.03477, 5.75254), box(2.95, 0, 5.75, 5.95, 2, 9.75));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
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
}