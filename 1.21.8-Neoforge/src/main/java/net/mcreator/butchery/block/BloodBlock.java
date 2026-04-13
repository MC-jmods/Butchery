package net.mcreator.butchery.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.butchery.init.ButcheryModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock(BlockBehaviour.Properties properties) {
		super(ButcheryModFluids.BLOOD.get(), properties.mapColor(MapColor.WATER).strength(10f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 5;
	}
}