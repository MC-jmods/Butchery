package net.mcreator.butchery.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class DioriteBrickSlabBlock extends SlabBlock {
	public DioriteBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}