package net.mcreator.butchery.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class DioritebrickstairsBlock extends StairBlock {
	public DioritebrickstairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}