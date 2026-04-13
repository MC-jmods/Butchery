package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
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
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.PhantomcarcassbrokenProcedure;
import net.mcreator.butchery.procedures.PhantombleedingProcedure;
import net.mcreator.butchery.block.entity.PhantomcarcassBlockEntity;

public class PhantomcarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PhantomcarcassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.HONEY_BLOCK).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
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
				default -> Shapes.or(box(5.5, 3.48171, 6.29153, 10.5, 12.48171, 9.29153), box(10.5, 3.48171, 6.29153, 16.5, 12.48171, 8.29153), box(-0.5, 3.48171, 6.29153, 5.5, 12.48171, 8.29153), box(6.5, 12.46765, 6.28945, 9.5, 18.46765, 8.28945));
				case NORTH ->
					Shapes.or(box(5.5, 3.48171, 6.70847, 10.5, 12.48171, 9.70847), box(-0.5, 3.48171, 7.70847, 5.5, 12.48171, 9.70847), box(10.5, 3.48171, 7.70847, 16.5, 12.48171, 9.70847), box(6.5, 12.46765, 7.71055, 9.5, 18.46765, 9.71055));
				case EAST ->
					Shapes.or(box(6.29153, 3.48171, 5.5, 9.29153, 12.48171, 10.5), box(6.29153, 3.48171, -0.5, 8.29153, 12.48171, 5.5), box(6.29153, 3.48171, 10.5, 8.29153, 12.48171, 16.5), box(6.28945, 12.46765, 6.5, 8.28945, 18.46765, 9.5));
				case WEST ->
					Shapes.or(box(6.70847, 3.48171, 5.5, 9.70847, 12.48171, 10.5), box(7.70847, 3.48171, 10.5, 9.70847, 12.48171, 16.5), box(7.70847, 3.48171, -0.5, 9.70847, 12.48171, 5.5), box(7.71055, 12.46765, 6.5, 9.71055, 18.46765, 9.5));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(5.5, 0.05, 4, 10.5, 3.05, 13), box(10.5, 0.05, 4, 16.5, 2.05, 13), box(-0.5, 0.05, 4, 5.5, 2.05, 13));
			case NORTH -> Shapes.or(box(5.5, 0.05, 3, 10.5, 3.05, 12), box(-0.5, 0.05, 3, 5.5, 2.05, 12), box(10.5, 0.05, 3, 16.5, 2.05, 12));
			case EAST -> Shapes.or(box(4, 0.05, 5.5, 13, 3.05, 10.5), box(4, 0.05, -0.5, 13, 2.05, 5.5), box(4, 0.05, 10.5, 13, 2.05, 16.5));
			case WEST -> Shapes.or(box(3, 0.05, 5.5, 12, 3.05, 10.5), box(3, 0.05, 10.5, 12, 2.05, 16.5), box(3, 0.05, -0.5, 12, 2.05, 5.5));
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
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		PhantomcarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		PhantombleedingProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new PhantomcarcassBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof PhantomcarcassBlockEntity be) {
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
		if (tileentity instanceof PhantomcarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}