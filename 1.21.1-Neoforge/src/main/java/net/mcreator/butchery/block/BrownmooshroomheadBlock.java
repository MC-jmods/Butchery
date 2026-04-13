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

public class BrownmooshroomheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BrownmooshroomheadBlock() {
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
			default -> Shapes.or(box(8.02769, 2.73654, 6.4, 10.02769, 4.73654, 8.4), box(4.02531, -0.01346, 4.99067, 12.02531, 7.98654, 10.99067), box(3.02531, 5.98654, 7.99067, 4.02531, 8.98654, 8.99067),
					box(12.02531, 5.98654, 7.99067, 13.02531, 8.98654, 8.99067));
			case NORTH -> Shapes.or(box(5.97231, 2.73654, 7.6, 7.97231, 4.73654, 9.6), box(3.97469, -0.01346, 5.00933, 11.97469, 7.98654, 11.00933), box(11.97469, 5.98654, 7.00933, 12.97469, 8.98654, 8.00933),
					box(2.97469, 5.98654, 7.00933, 3.97469, 8.98654, 8.00933));
			case EAST -> Shapes.or(box(6.4, 2.73654, 5.97231, 8.4, 4.73654, 7.97231), box(4.99067, -0.01346, 3.97469, 10.99067, 7.98654, 11.97469), box(7.99067, 5.98654, 11.97469, 8.99067, 8.98654, 12.97469),
					box(7.99067, 5.98654, 2.97469, 8.99067, 8.98654, 3.97469));
			case WEST -> Shapes.or(box(7.6, 2.73654, 8.02769, 9.6, 4.73654, 10.02769), box(5.00933, -0.01346, 4.02531, 11.00933, 7.98654, 12.02531), box(7.00933, 5.98654, 3.02531, 8.00933, 8.98654, 4.02531),
					box(7.00933, 5.98654, 12.02531, 8.00933, 8.98654, 13.02531));
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