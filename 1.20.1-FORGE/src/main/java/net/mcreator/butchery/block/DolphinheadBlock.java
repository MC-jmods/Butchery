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

public class DolphinheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DolphinheadBlock() {
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
			default -> Shapes.or(box(3.98865, 0.001, 3.03746, 11.98865, 7.001, 9.03746), box(6.98865, 2.001, 2.03746, 8.98865, 4.001, 3.03746), box(6.98865, 0.001, 9.03746, 8.98865, 2.001, 13.03746));
			case NORTH -> Shapes.or(box(4.01135, 0.001, 6.96254, 12.01135, 7.001, 12.96254), box(7.01135, 2.001, 12.96254, 9.01135, 4.001, 13.96254), box(7.01135, 0.001, 2.96254, 9.01135, 2.001, 6.96254));
			case EAST -> Shapes.or(box(3.03746, 0.001, 4.01135, 9.03746, 7.001, 12.01135), box(2.03746, 2.001, 7.01135, 3.03746, 4.001, 9.01135), box(9.03746, 0.001, 7.01135, 13.03746, 2.001, 9.01135));
			case WEST -> Shapes.or(box(6.96254, 0.001, 3.98865, 12.96254, 7.001, 11.98865), box(12.96254, 2.001, 6.98865, 13.96254, 4.001, 8.98865), box(2.96254, 0.001, 6.98865, 6.96254, 2.001, 8.98865));
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