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

public class BrownllamaheadBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BrownllamaheadBlock() {
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
			default -> Shapes.or(box(5.96465, 4.26585, 5.44822, 9.96465, 8.26585, 14.44822), box(3.98465, 0.26585, 4.44822, 11.95965, 9.26585, 10.44822), box(8.96465, 9.26585, 6.44822, 11.96465, 12.26585, 8.44822),
					box(3.96465, 9.26585, 6.44822, 6.96465, 12.26585, 8.44822));
			case NORTH -> Shapes.or(box(6.03535, 4.26585, 1.55178, 10.03535, 8.26585, 10.55178), box(4.04035, 0.26585, 5.55178, 12.01535, 9.26585, 11.55178), box(4.03535, 9.26585, 7.55178, 7.03535, 12.26585, 9.55178),
					box(9.03535, 9.26585, 7.55178, 12.03535, 12.26585, 9.55178));
			case EAST -> Shapes.or(box(5.44822, 4.26585, 6.03535, 14.44822, 8.26585, 10.03535), box(4.44822, 0.26585, 4.04035, 10.44822, 9.26585, 12.01535), box(6.44822, 9.26585, 4.03535, 8.44822, 12.26585, 7.03535),
					box(6.44822, 9.26585, 9.03535, 8.44822, 12.26585, 12.03535));
			case WEST -> Shapes.or(box(1.55178, 4.26585, 5.96465, 10.55178, 8.26585, 9.96465), box(5.55178, 0.26585, 3.98465, 11.55178, 9.26585, 11.95965), box(7.55178, 9.26585, 8.96465, 9.55178, 12.26585, 11.96465),
					box(7.55178, 9.26585, 3.96465, 9.55178, 12.26585, 6.96465));
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