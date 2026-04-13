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

public class CreamyhorseheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CreamyhorseheadBlock() {
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
			default -> Shapes.or(box(5, -0.00768, 2.00288, 11, 4.99232, 9.00288), box(6, -0.00768, 9.00288, 10, 4.99232, 14.00288), box(5.45, 4.99232, 2.01288, 7.45, 7.99232, 3.01288), box(8.55, 4.99232, 2.01288, 10.55, 7.99232, 3.01288));
			case NORTH -> Shapes.or(box(5, -0.00768, 6.99712, 11, 4.99232, 13.99712), box(6, -0.00768, 1.99712, 10, 4.99232, 6.99712), box(8.55, 4.99232, 12.98712, 10.55, 7.99232, 13.98712), box(5.45, 4.99232, 12.98712, 7.45, 7.99232, 13.98712));
			case EAST -> Shapes.or(box(2.00288, -0.00768, 5, 9.00288, 4.99232, 11), box(9.00288, -0.00768, 6, 14.00288, 4.99232, 10), box(2.01288, 4.99232, 8.55, 3.01288, 7.99232, 10.55), box(2.01288, 4.99232, 5.45, 3.01288, 7.99232, 7.45));
			case WEST -> Shapes.or(box(6.99712, -0.00768, 5, 13.99712, 4.99232, 11), box(1.99712, -0.00768, 6, 6.99712, 4.99232, 10), box(12.98712, 4.99232, 5.45, 13.98712, 7.99232, 7.45), box(12.98712, 4.99232, 8.55, 13.98712, 7.99232, 10.55));
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