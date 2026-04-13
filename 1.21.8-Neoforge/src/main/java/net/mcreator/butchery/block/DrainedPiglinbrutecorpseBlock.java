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

import net.mcreator.butchery.procedures.DrainedpiglinbrutecorpsebrokenProcedure;
import net.mcreator.butchery.procedures.Drained_carcass_placedProcedure;
import net.mcreator.butchery.block.entity.DrainedPiglinbrutecorpseBlockEntity;

public class DrainedPiglinbrutecorpseBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 9);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public DrainedPiglinbrutecorpseBlock(BlockBehaviour.Properties properties) {
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
				default -> box(3.75, 7.75, 6.75, 12.25, 20.25, 11.25);
				case NORTH -> box(3.75, 7.75, 4.75, 12.25, 20.25, 9.25);
				case EAST -> box(6.75, 7.75, 3.75, 11.25, 20.25, 12.25);
				case WEST -> box(4.75, 7.75, 3.75, 9.25, 20.25, 12.25);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(3.75, 7.75, 6.75, 12.25, 20.25, 11.25);
				case NORTH -> box(3.75, 7.75, 4.75, 12.25, 20.25, 9.25);
				case EAST -> box(6.75, 7.75, 3.75, 11.25, 20.25, 12.25);
				case WEST -> box(4.75, 7.75, 3.75, 9.25, 20.25, 12.25);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(3.75, 7.75, 6.75, 12.25, 20.25, 11.25);
				case NORTH -> box(3.75, 7.75, 4.75, 12.25, 20.25, 9.25);
				case EAST -> box(6.75, 7.75, 3.75, 11.25, 20.25, 12.25);
				case WEST -> box(4.75, 7.75, 3.75, 9.25, 20.25, 12.25);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> box(3.75, 7.75, 6.75, 12.25, 20.25, 11.25);
				case NORTH -> box(3.75, 7.75, 4.75, 12.25, 20.25, 9.25);
				case EAST -> box(6.75, 7.75, 3.75, 11.25, 20.25, 12.25);
				case WEST -> box(4.75, 7.75, 3.75, 9.25, 20.25, 12.25);
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> box(3.75, 7.75, 6.75, 12.25, 20.25, 11.25);
				case NORTH -> box(3.75, 7.75, 4.75, 12.25, 20.25, 9.25);
				case EAST -> box(6.75, 7.75, 3.75, 11.25, 20.25, 12.25);
				case WEST -> box(4.75, 7.75, 3.75, 9.25, 20.25, 12.25);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(3.75, 3.75, 1.75, 12.25, 16.25, 6.25);
			case NORTH -> box(3.75, 3.75, 9.75, 12.25, 16.25, 14.25);
			case EAST -> box(1.75, 3.75, 3.75, 6.25, 16.25, 12.25);
			case WEST -> box(9.75, 3.75, 3.75, 14.25, 16.25, 12.25);
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
		DrainedpiglinbrutecorpsebrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DrainedPiglinbrutecorpseBlockEntity(pos, state);
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
		if (tileentity instanceof DrainedPiglinbrutecorpseBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}