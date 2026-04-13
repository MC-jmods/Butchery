package net.mcreator.butchery.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class RabbitheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public RabbitheadBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(5.54442, -0.01078, 5.20711, 10.54442, 3.98922, 10.20711), box(7.54442, 1.48922, 9.70711, 8.54442, 2.48922, 10.70711), box(8.54442, 3.98922, 5.45711, 10.54442, 8.98922, 6.45711),
					box(5.54442, 3.98922, 5.45711, 7.54442, 8.98922, 6.45711));
			case NORTH -> Shapes.or(box(5.45558, -0.01078, 5.79289, 10.45558, 3.98922, 10.79289), box(7.45558, 1.48922, 5.29289, 8.45558, 2.48922, 6.29289), box(5.45558, 3.98922, 9.54289, 7.45558, 8.98922, 10.54289),
					box(8.45558, 3.98922, 9.54289, 10.45558, 8.98922, 10.54289));
			case EAST -> Shapes.or(box(5.20711, -0.01078, 5.45558, 10.20711, 3.98922, 10.45558), box(9.70711, 1.48922, 7.45558, 10.70711, 2.48922, 8.45558), box(5.45711, 3.98922, 5.45558, 6.45711, 8.98922, 7.45558),
					box(5.45711, 3.98922, 8.45558, 6.45711, 8.98922, 10.45558));
			case WEST -> Shapes.or(box(5.79289, -0.01078, 5.54442, 10.79289, 3.98922, 10.54442), box(5.29289, 1.48922, 7.54442, 6.29289, 2.48922, 8.54442), box(9.54289, 3.98922, 8.54442, 10.54289, 8.98922, 10.54442),
					box(9.54289, 3.98922, 5.54442, 10.54289, 8.98922, 7.54442));
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