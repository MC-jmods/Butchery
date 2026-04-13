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

import net.mcreator.butchery.procedures.DrainedhuskcarcassbrokenProcedure;
import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.block.entity.DrainedhuskcorpseBlockEntity;

public class DrainedhuskcorpseBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 7);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedhuskcorpseBlock(BlockBehaviour.Properties properties) {
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
				default -> Shapes.or(box(4.1, 8, 7, 12.1, 20, 11), box(12.09316, 7.90942, 7.06368, 16.09316, 19.90942, 11.06368), box(0.09316, 8.09058, 6.93632, 4.09316, 20.09058, 10.93632), box(8.09433, -4, 7.00794, 12.09433, 8, 11.00794),
						box(4.09068, -3.99464, 7, 8.09068, 8.00536, 11));
				case NORTH -> Shapes.or(box(3.9, 8, 5, 11.9, 20, 9), box(-0.09316, 7.90942, 4.93632, 3.90684, 19.90942, 8.93632), box(11.90684, 8.09058, 5.06368, 15.90684, 20.09058, 9.06368), box(3.90567, -4, 4.99206, 7.90567, 8, 8.99206),
						box(7.90932, -3.99464, 5, 11.90932, 8.00536, 9));
				case EAST -> Shapes.or(box(7, 8, 3.9, 11, 20, 11.9), box(7.06368, 7.90942, -0.09316, 11.06368, 19.90942, 3.90684), box(6.93632, 8.09058, 11.90684, 10.93632, 20.09058, 15.90684), box(7.00794, -4, 3.90567, 11.00794, 8, 7.90567),
						box(7, -3.99464, 7.90932, 11, 8.00536, 11.90932));
				case WEST -> Shapes.or(box(5, 8, 4.1, 9, 20, 12.1), box(4.93632, 7.90942, 12.09316, 8.93632, 19.90942, 16.09316), box(5.06368, 8.09058, 0.09316, 9.06368, 20.09058, 4.09316), box(4.99206, -4, 8.09433, 8.99206, 8, 12.09433),
						box(5, -3.99464, 4.09068, 9, 8.00536, 8.09068));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(4.1, 8, 7, 12.1, 20, 11), box(12.09316, 7.90942, 7.06368, 16.09316, 19.90942, 11.06368), box(0.09316, 8.09058, 6.93632, 4.09316, 20.09058, 10.93632), box(8.09433, -4, 7.00794, 12.09433, 8, 11.00794),
						box(4.09068, -3.99464, 7, 8.09068, 8.00536, 11));
				case NORTH -> Shapes.or(box(3.9, 8, 5, 11.9, 20, 9), box(-0.09316, 7.90942, 4.93632, 3.90684, 19.90942, 8.93632), box(11.90684, 8.09058, 5.06368, 15.90684, 20.09058, 9.06368), box(3.90567, -4, 4.99206, 7.90567, 8, 8.99206),
						box(7.90932, -3.99464, 5, 11.90932, 8.00536, 9));
				case EAST -> Shapes.or(box(7, 8, 3.9, 11, 20, 11.9), box(7.06368, 7.90942, -0.09316, 11.06368, 19.90942, 3.90684), box(6.93632, 8.09058, 11.90684, 10.93632, 20.09058, 15.90684), box(7.00794, -4, 3.90567, 11.00794, 8, 7.90567),
						box(7, -3.99464, 7.90932, 11, 8.00536, 11.90932));
				case WEST -> Shapes.or(box(5, 8, 4.1, 9, 20, 12.1), box(4.93632, 7.90942, 12.09316, 8.93632, 19.90942, 16.09316), box(5.06368, 8.09058, 0.09316, 9.06368, 20.09058, 4.09316), box(4.99206, -4, 8.09433, 8.99206, 8, 12.09433),
						box(5, -3.99464, 4.09068, 9, 8.00536, 8.09068));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(4.1, 8, 7, 12.1, 20, 11), box(12.09316, 7.90942, 7.06368, 16.09316, 19.90942, 11.06368), box(0.09316, 8.09058, 6.93632, 4.09316, 20.09058, 10.93632), box(8.09433, -4, 7.00794, 12.09433, 8, 11.00794),
						box(4.09068, -3.99464, 7, 8.09068, 8.00536, 11));
				case NORTH -> Shapes.or(box(3.9, 8, 5, 11.9, 20, 9), box(-0.09316, 7.90942, 4.93632, 3.90684, 19.90942, 8.93632), box(11.90684, 8.09058, 5.06368, 15.90684, 20.09058, 9.06368), box(3.90567, -4, 4.99206, 7.90567, 8, 8.99206),
						box(7.90932, -3.99464, 5, 11.90932, 8.00536, 9));
				case EAST -> Shapes.or(box(7, 8, 3.9, 11, 20, 11.9), box(7.06368, 7.90942, -0.09316, 11.06368, 19.90942, 3.90684), box(6.93632, 8.09058, 11.90684, 10.93632, 20.09058, 15.90684), box(7.00794, -4, 3.90567, 11.00794, 8, 7.90567),
						box(7, -3.99464, 7.90932, 11, 8.00536, 11.90932));
				case WEST -> Shapes.or(box(5, 8, 4.1, 9, 20, 12.1), box(4.93632, 7.90942, 12.09316, 8.93632, 19.90942, 16.09316), box(5.06368, 8.09058, 0.09316, 9.06368, 20.09058, 4.09316), box(4.99206, -4, 8.09433, 8.99206, 8, 12.09433),
						box(5, -3.99464, 4.09068, 9, 8.00536, 8.09068));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(4.1, 8, 7, 12.1, 20, 11), box(12.09316, 7.90942, 7.06368, 16.09316, 19.90942, 11.06368), box(0.09316, 8.09058, 6.93632, 4.09316, 20.09058, 10.93632), box(8.09433, -4, 7.00794, 12.09433, 8, 11.00794),
						box(4.09068, -3.99464, 7, 8.09068, 8.00536, 11));
				case NORTH -> Shapes.or(box(3.9, 8, 5, 11.9, 20, 9), box(-0.09316, 7.90942, 4.93632, 3.90684, 19.90942, 8.93632), box(11.90684, 8.09058, 5.06368, 15.90684, 20.09058, 9.06368), box(3.90567, -4, 4.99206, 7.90567, 8, 8.99206),
						box(7.90932, -3.99464, 5, 11.90932, 8.00536, 9));
				case EAST -> Shapes.or(box(7, 8, 3.9, 11, 20, 11.9), box(7.06368, 7.90942, -0.09316, 11.06368, 19.90942, 3.90684), box(6.93632, 8.09058, 11.90684, 10.93632, 20.09058, 15.90684), box(7.00794, -4, 3.90567, 11.00794, 8, 7.90567),
						box(7, -3.99464, 7.90932, 11, 8.00536, 11.90932));
				case WEST -> Shapes.or(box(5, 8, 4.1, 9, 20, 12.1), box(4.93632, 7.90942, 12.09316, 8.93632, 19.90942, 16.09316), box(5.06368, 8.09058, 0.09316, 9.06368, 20.09058, 4.09316), box(4.99206, -4, 8.09433, 8.99206, 8, 12.09433),
						box(5, -3.99464, 4.09068, 9, 8.00536, 8.09068));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(4.1, 4, 2, 12.1, 16, 6);
			case NORTH -> box(3.9, 4, 10, 11.9, 16, 14);
			case EAST -> box(2, 4, 3.9, 6, 16, 11.9);
			case WEST -> box(10, 4, 4.1, 14, 16, 12.1);
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
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		Drained_carcass_placedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DrainedhuskcarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedhuskcorpseBlockEntity(pos, state);
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
		if (tileentity instanceof DrainedhuskcorpseBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}