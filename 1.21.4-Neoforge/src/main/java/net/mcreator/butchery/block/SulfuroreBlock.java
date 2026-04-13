package net.mcreator.butchery.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.procedures.ReplacesulfurProcedure;

public class SulfuroreBlock extends Block {
	public SulfuroreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 3f).randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		ReplacesulfurProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}