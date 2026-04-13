package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.CavespidercarcassbrokenProcedure;
import net.mcreator.butchery.block.entity.CavespidercarcassBlockEntity;

public class CavespidercarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 7);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public CavespidercarcassBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.HONEY_BLOCK).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
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
				default -> Shapes.or(box(5.2, 20, 8, 10.7, 24.5, 12), box(5.8, 12.5, 6.8, 10.3, 19.3, 10.8), box(4.2, 5.3, 6, 11.7, 14.3, 14.8));
				case NORTH -> Shapes.or(box(5.3, 20, 4, 10.8, 24.5, 8), box(5.7, 12.5, 5.2, 10.2, 19.3, 9.2), box(4.3, 5.3, 1.2, 11.8, 14.3, 10));
				case EAST -> Shapes.or(box(8, 20, 5.3, 12, 24.5, 10.8), box(6.8, 12.5, 5.7, 10.8, 19.3, 10.2), box(6, 5.3, 4.3, 14.8, 14.3, 11.8));
				case WEST -> Shapes.or(box(4, 20, 5.2, 8, 24.5, 10.7), box(5.2, 12.5, 5.8, 9.2, 19.3, 10.3), box(1.2, 5.3, 4.2, 10, 14.3, 11.7));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5.2, 20, 8, 10.7, 24.5, 12), box(5.8, 12.5, 6.8, 10.3, 19.3, 10.8), box(4.2, 5.3, 6, 11.7, 14.3, 14.8));
				case NORTH -> Shapes.or(box(5.3, 20, 4, 10.8, 24.5, 8), box(5.7, 12.5, 5.2, 10.2, 19.3, 9.2), box(4.3, 5.3, 1.2, 11.8, 14.3, 10));
				case EAST -> Shapes.or(box(8, 20, 5.3, 12, 24.5, 10.8), box(6.8, 12.5, 5.7, 10.8, 19.3, 10.2), box(6, 5.3, 4.3, 14.8, 14.3, 11.8));
				case WEST -> Shapes.or(box(4, 20, 5.2, 8, 24.5, 10.7), box(5.2, 12.5, 5.8, 9.2, 19.3, 10.3), box(1.2, 5.3, 4.2, 10, 14.3, 11.7));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5.2, 20, 8, 10.7, 24.5, 12), box(5.8, 12.5, 6.8, 10.3, 19.3, 10.8), box(4.2, 5.3, 6, 11.7, 14.3, 14.8));
				case NORTH -> Shapes.or(box(5.3, 20, 4, 10.8, 24.5, 8), box(5.7, 12.5, 5.2, 10.2, 19.3, 9.2), box(4.3, 5.3, 1.2, 11.8, 14.3, 10));
				case EAST -> Shapes.or(box(8, 20, 5.3, 12, 24.5, 10.8), box(6.8, 12.5, 5.7, 10.8, 19.3, 10.2), box(6, 5.3, 4.3, 14.8, 14.3, 11.8));
				case WEST -> Shapes.or(box(4, 20, 5.2, 8, 24.5, 10.7), box(5.2, 12.5, 5.8, 9.2, 19.3, 10.3), box(1.2, 5.3, 4.2, 10, 14.3, 11.7));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5.2, 20, 8, 10.7, 24.5, 12), box(5.8, 12.5, 6.8, 10.3, 19.3, 10.8), box(4.2, 5.3, 6, 11.7, 14.3, 14.8));
				case NORTH -> Shapes.or(box(5.3, 20, 4, 10.8, 24.5, 8), box(5.7, 12.5, 5.2, 10.2, 19.3, 9.2), box(4.3, 5.3, 1.2, 11.8, 14.3, 10));
				case EAST -> Shapes.or(box(8, 20, 5.3, 12, 24.5, 10.8), box(6.8, 12.5, 5.7, 10.8, 19.3, 10.2), box(6, 5.3, 4.3, 14.8, 14.3, 11.8));
				case WEST -> Shapes.or(box(4, 20, 5.2, 8, 24.5, 10.7), box(5.2, 12.5, 5.8, 9.2, 19.3, 10.3), box(1.2, 5.3, 4.2, 10, 14.3, 11.7));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(5.62724, 0.075, 5.92724, 10.12724, 4.575, 10.42724);
			case NORTH -> box(5.87276, 0.075, 5.57276, 10.37276, 4.575, 10.07276);
			case EAST -> box(5.92724, 0.075, 5.87276, 10.42724, 4.575, 10.37276);
			case WEST -> box(5.57276, 0.075, 5.62724, 10.07276, 4.575, 10.12724);
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
		CavespidercarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CavespidercarcassBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	protected void affectNeighborsAfterRemoval(BlockState blockstate, ServerLevel world, BlockPos blockpos, boolean flag) {
		Containers.updateNeighboursAfterDestroy(blockstate, world, blockpos);
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof CavespidercarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}