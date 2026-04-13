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

public class WolfheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public WolfheadBlock() {
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
			default -> Shapes.or(box(4.99513, -0.03291, 4.99257, 10.99513, 5.96709, 8.99257), box(8.97013, 5.96715, 4.98416, 10.97013, 7.96715, 5.98416), box(5.02013, 5.96715, 4.98416, 7.02013, 7.96715, 5.98416),
					box(6.49513, -0.01291, 7.99257, 9.49513, 2.98709, 11.99257));
			case NORTH -> Shapes.or(box(5.00487, -0.03291, 7.00743, 11.00487, 5.96709, 11.00743), box(5.02987, 5.96715, 10.01584, 7.02987, 7.96715, 11.01584), box(8.97987, 5.96715, 10.01584, 10.97987, 7.96715, 11.01584),
					box(6.50487, -0.01291, 4.00743, 9.50487, 2.98709, 8.00743));
			case EAST -> Shapes.or(box(4.99257, -0.03291, 5.00487, 8.99257, 5.96709, 11.00487), box(4.98416, 5.96715, 5.02987, 5.98416, 7.96715, 7.02987), box(4.98416, 5.96715, 8.97987, 5.98416, 7.96715, 10.97987),
					box(7.99257, -0.01291, 6.50487, 11.99257, 2.98709, 9.50487));
			case WEST -> Shapes.or(box(7.00743, -0.03291, 4.99513, 11.00743, 5.96709, 10.99513), box(10.01584, 5.96715, 8.97013, 11.01584, 7.96715, 10.97013), box(10.01584, 5.96715, 5.02013, 11.01584, 7.96715, 7.02013),
					box(4.00743, -0.01291, 6.49513, 8.00743, 2.98709, 9.49513));
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