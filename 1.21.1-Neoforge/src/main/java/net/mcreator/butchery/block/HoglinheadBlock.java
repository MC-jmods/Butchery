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

public class HoglinheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public HoglinheadBlock() {
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
			default -> Shapes.or(box(1.00687, 0.02963, -1.66911, 15.00687, 6.02963, 17.33089), box(0.00687, 0.62763, 9.46692, 2.00687, 11.62763, 11.46692), box(14.00687, 0.62763, 9.46692, 16.00687, 11.62763, 11.46692),
					box(0.22615, 2.55075, -0.63761, 1.22615, 6.55075, 5.36239), box(14.78758, 2.42722, -0.94591, 15.78758, 6.42722, 5.05409));
			case NORTH -> Shapes.or(box(0.99313, 0.02963, -1.33089, 14.99313, 6.02963, 17.66911), box(13.99313, 0.62763, 4.53308, 15.99313, 11.62763, 6.53308), box(-0.00687, 0.62763, 4.53308, 1.99313, 11.62763, 6.53308),
					box(14.77385, 2.55075, 10.63761, 15.77385, 6.55075, 16.63761), box(0.21242, 2.42722, 10.94591, 1.21242, 6.42722, 16.94591));
			case EAST -> Shapes.or(box(-1.66911, 0.02963, 0.99313, 17.33089, 6.02963, 14.99313), box(9.46692, 0.62763, 13.99313, 11.46692, 11.62763, 15.99313), box(9.46692, 0.62763, -0.00687, 11.46692, 11.62763, 1.99313),
					box(-0.63761, 2.55075, 14.77385, 5.36239, 6.55075, 15.77385), box(-0.94591, 2.42722, 0.21242, 5.05409, 6.42722, 1.21242));
			case WEST -> Shapes.or(box(-1.33089, 0.02963, 1.00687, 17.66911, 6.02963, 15.00687), box(4.53308, 0.62763, 0.00687, 6.53308, 11.62763, 2.00687), box(4.53308, 0.62763, 14.00687, 6.53308, 11.62763, 16.00687),
					box(10.63761, 2.55075, 0.22615, 16.63761, 6.55075, 1.22615), box(10.94591, 2.42722, 14.78758, 16.94591, 6.42722, 15.78758));
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