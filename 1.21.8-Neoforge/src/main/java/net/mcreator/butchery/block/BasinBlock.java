package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.butchery.procedures.RemovewaterbesideProcedure;
import net.mcreator.butchery.procedures.FillsaltbasinProcedure;
import net.mcreator.butchery.procedures.BasinupdatetickProcedure;
import net.mcreator.butchery.init.ButcheryModBlocks;
import net.mcreator.butchery.block.entity.BasinBlockEntity;

import javax.annotation.Nullable;

public class BasinBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 7);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public BasinBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).lightLevel(s -> (new Object() {
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
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM));
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
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 3, 0, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 2, 12, 16), box(2, 3, 14, 14, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 0, 2, 14, 3, 14));
				case NORTH -> Shapes.or(box(0, 3, 0, 2, 12, 16), box(2, 3, 2, 14, 4, 14), box(14, 3, 0, 16, 12, 16), box(2, 3, 0, 14, 12, 2), box(2, 3, 14, 14, 12, 16), box(2, 0, 2, 14, 3, 14));
				case EAST -> Shapes.or(box(0, 3, 0, 16, 12, 2), box(2, 3, 2, 14, 4, 14), box(0, 3, 14, 16, 12, 16), box(14, 3, 2, 16, 12, 14), box(0, 3, 2, 2, 12, 14), box(2, 0, 2, 14, 3, 14));
				case WEST -> Shapes.or(box(0, 3, 14, 16, 12, 16), box(2, 3, 2, 14, 4, 14), box(0, 3, 0, 16, 12, 2), box(0, 3, 2, 2, 12, 14), box(14, 3, 2, 16, 12, 14), box(2, 0, 2, 14, 3, 14));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, 0, 0, 16, 12, 16);
			case NORTH -> box(0, 0, 0, 16, 12, 16);
			case EAST -> box(0, 0, 0, 16, 12, 16);
			case WEST -> box(0, 0, 0, 16, 12, 16);
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
		world.scheduleTick(pos, this, 2000);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		RemovewaterbesideProcedure.execute();
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		BasinupdatetickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		world.scheduleTick(pos, this, 2000);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		RemovewaterbesideProcedure.execute();
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
		FillsaltbasinProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new BasinBlockEntity(pos, state);
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
		if (tileentity instanceof BasinBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageWaterColor(world, pos) : -1;
		}, ButcheryModBlocks.BASIN.get());
	}
}