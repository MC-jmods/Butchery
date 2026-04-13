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
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.Hook_Block_DestroyedProcedure;

public class HookBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public HookBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CHAIN).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
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
				default -> box(4, 0, 4, 12, 16, 12);
				case NORTH -> box(4, 0, 4, 12, 16, 12);
				case EAST -> box(4, 0, 4, 12, 16, 12);
				case WEST -> box(4, 0, 4, 12, 16, 12);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(4, 8, 0, 12, 16, 11), box(4, 0, 5, 12, 8, 11));
				case NORTH -> Shapes.or(box(4, 8, 5, 12, 16, 16), box(4, 0, 5, 12, 8, 11));
				case EAST -> Shapes.or(box(0, 8, 4, 11, 16, 12), box(5, 0, 4, 11, 8, 12));
				case WEST -> Shapes.or(box(5, 8, 4, 16, 16, 12), box(5, 0, 4, 11, 8, 12));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 7, 7, 16, 9, 9), box(5.5, 0, 5, 10.5, 10, 11));
			case NORTH -> Shapes.or(box(0, 7, 7, 16, 9, 9), box(5.5, 0, 5, 10.5, 10, 11));
			case EAST -> Shapes.or(box(7, 7, 0, 9, 9, 16), box(5, 0, 5.5, 11, 10, 10.5));
			case WEST -> Shapes.or(box(7, 7, 0, 9, 9, 16), box(5, 0, 5.5, 11, 10, 10.5));
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
		Hook_Block_DestroyedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}
}