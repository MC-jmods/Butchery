package net.mcreator.butchery.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.init.ButcheryModFluids;

public class InfectedBloodBlock extends LiquidBlock {
	public InfectedBloodBlock() {
		super(ButcheryModFluids.INFECTED_BLOOD.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(10f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}
}