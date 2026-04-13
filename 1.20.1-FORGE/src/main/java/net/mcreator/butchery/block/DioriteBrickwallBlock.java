package net.mcreator.butchery.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class DioriteBrickwallBlock extends WallBlock {
	public DioriteBrickwallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}
}