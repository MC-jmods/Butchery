package net.mcreator.butchery.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SandBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 14);

	public SandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				if (s.getValue(BLOCKSTATE) == 11)
					return 0;
				if (s.getValue(BLOCKSTATE) == 12)
					return 0;
				if (s.getValue(BLOCKSTATE) == 13)
					return 0;
				if (s.getValue(BLOCKSTATE) == 14)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			return box(0, 0, 0, 16, 2, 16);
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return box(0, 0, 0, 16, 3, 16);
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return box(0, 0, 0, 16, 4, 16);
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return box(0, 0, 0, 16, 5, 16);
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return box(0, 0, 0, 16, 6, 16);
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return box(0, 0, 0, 16, 7, 16);
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return box(0, 0, 0, 16, 8, 16);
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return box(0, 0, 0, 16, 9, 16);
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return box(0, 0, 0, 16, 10, 16);
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return box(0, 0, 0, 16, 11, 16);
		}
		if (state.getValue(BLOCKSTATE) == 11) {
			return box(0, 0, 0, 16, 12, 16);
		}
		if (state.getValue(BLOCKSTATE) == 12) {
			return box(0, 0, 0, 16, 13, 16);
		}
		if (state.getValue(BLOCKSTATE) == 13) {
			return box(0, 0, 0, 16, 14, 16);
		}
		if (state.getValue(BLOCKSTATE) == 14) {
			return box(0, 0, 0, 16, 15, 16);
		}
		return box(0, 0, 0, 16, 1, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BLOCKSTATE);
	}
}