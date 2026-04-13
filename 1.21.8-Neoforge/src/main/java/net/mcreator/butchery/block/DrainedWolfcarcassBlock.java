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

import net.mcreator.butchery.procedures.DrainedwolfcarcassbrokenProcedure;
import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.block.entity.DrainedWolfcarcassBlockEntity;

public class DrainedWolfcarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 9);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedWolfcarcassBlock(BlockBehaviour.Properties properties) {
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
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
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
				default -> box(5.19625, -1.24876, 7.75251, 10.79625, 13.35124, 13.35251);
				case NORTH -> box(5.20375, -1.24876, 2.64749, 10.80375, 13.35124, 8.24749);
				case EAST -> box(7.75251, -1.24876, 5.20375, 13.35251, 13.35124, 10.80375);
				case WEST -> box(2.64749, -1.24876, 5.19625, 8.24749, 13.35124, 10.79625);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(5.19625, -1.24876, 7.75251, 10.79625, 13.35124, 13.35251);
				case NORTH -> box(5.20375, -1.24876, 2.64749, 10.80375, 13.35124, 8.24749);
				case EAST -> box(7.75251, -1.24876, 5.20375, 13.35251, 13.35124, 10.80375);
				case WEST -> box(2.64749, -1.24876, 5.19625, 8.24749, 13.35124, 10.79625);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(5.19625, -1.24876, 7.75251, 10.79625, 13.35124, 13.35251);
				case NORTH -> box(5.20375, -1.24876, 2.64749, 10.80375, 13.35124, 8.24749);
				case EAST -> box(7.75251, -1.24876, 5.20375, 13.35251, 13.35124, 10.80375);
				case WEST -> box(2.64749, -1.24876, 5.19625, 8.24749, 13.35124, 10.79625);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> box(5.19625, -1.24876, 7.75251, 10.79625, 13.35124, 13.35251);
				case NORTH -> box(5.20375, -1.24876, 2.64749, 10.80375, 13.35124, 8.24749);
				case EAST -> box(7.75251, -1.24876, 5.20375, 13.35251, 13.35124, 10.80375);
				case WEST -> box(2.64749, -1.24876, 5.19625, 8.24749, 13.35124, 10.79625);
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> box(5.19625, -1.24876, 7.75251, 10.79625, 13.35124, 13.35251);
				case NORTH -> box(5.20375, -1.24876, 2.64749, 10.80375, 13.35124, 8.24749);
				case EAST -> box(7.75251, -1.24876, 5.20375, 13.35251, 13.35124, 10.80375);
				case WEST -> box(2.64749, -1.24876, 5.19625, 8.24749, 13.35124, 10.79625);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(2.2, 2.14749, 5.75251, 16.8, 7.74749, 11.35251);
			case NORTH -> box(-0.8, 2.14749, 4.64749, 13.8, 7.74749, 10.24749);
			case EAST -> box(5.75251, 2.14749, -0.8, 11.35251, 7.74749, 13.8);
			case WEST -> box(4.64749, 2.14749, 2.2, 10.24749, 7.74749, 16.8);
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
		DrainedwolfcarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedWolfcarcassBlockEntity(pos, state);
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
		if (tileentity instanceof DrainedWolfcarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}