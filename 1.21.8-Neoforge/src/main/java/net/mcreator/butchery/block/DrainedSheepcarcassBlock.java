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

import net.mcreator.butchery.procedures.DrainedsheepcarcassbrokenProcedure;
import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.block.entity.DrainedSheepcarcassBlockEntity;

public class DrainedSheepcarcassBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 9);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedSheepcarcassBlock(BlockBehaviour.Properties properties) {
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
				default -> box(3.17723, -1.02911, 7.40745, 12.97723, 14.77089, 15.20745);
				case NORTH -> box(3.02277, -1.02911, 0.79255, 12.82277, 14.77089, 8.59255);
				case EAST -> box(7.40745, -1.02911, 3.02277, 15.20745, 14.77089, 12.82277);
				case WEST -> box(0.79255, -1.02911, 3.17723, 8.59255, 14.77089, 12.97723);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(3.17723, -1.02911, 7.40745, 12.97723, 14.77089, 15.20745);
				case NORTH -> box(3.02277, -1.02911, 0.79255, 12.82277, 14.77089, 8.59255);
				case EAST -> box(7.40745, -1.02911, 3.02277, 15.20745, 14.77089, 12.82277);
				case WEST -> box(0.79255, -1.02911, 3.17723, 8.59255, 14.77089, 12.97723);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(3.17723, -1.02911, 7.40745, 12.97723, 14.77089, 15.20745);
				case NORTH -> box(3.02277, -1.02911, 0.79255, 12.82277, 14.77089, 8.59255);
				case EAST -> box(7.40745, -1.02911, 3.02277, 15.20745, 14.77089, 12.82277);
				case WEST -> box(0.79255, -1.02911, 3.17723, 8.59255, 14.77089, 12.97723);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> box(3.17723, -1.02911, 7.40745, 12.97723, 14.77089, 15.20745);
				case NORTH -> box(3.02277, -1.02911, 0.79255, 12.82277, 14.77089, 8.59255);
				case EAST -> box(7.40745, -1.02911, 3.02277, 15.20745, 14.77089, 12.82277);
				case WEST -> box(0.79255, -1.02911, 3.17723, 8.59255, 14.77089, 12.97723);
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> box(3.17723, -1.02911, 7.40745, 12.97723, 14.77089, 15.20745);
				case NORTH -> box(3.02277, -1.02911, 0.79255, 12.82277, 14.77089, 8.59255);
				case EAST -> box(7.40745, -1.02911, 3.02277, 15.20745, 14.77089, 12.82277);
				case WEST -> box(0.79255, -1.02911, 3.17723, 8.59255, 14.77089, 12.97723);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0.0473, 0.10082, 3.19482, 15.8473, 9.90082, 10.99482);
			case NORTH -> box(0.1527, 0.10082, 5.00518, 15.9527, 9.90082, 12.80518);
			case EAST -> box(3.19482, 0.10082, 0.1527, 10.99482, 9.90082, 15.9527);
			case WEST -> box(5.00518, 0.10082, 0.0473, 12.80518, 9.90082, 15.8473);
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
		DrainedsheepcarcassbrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedSheepcarcassBlockEntity(pos, state);
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
		if (tileentity instanceof DrainedSheepcarcassBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}