package net.mcreator.butchery.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DioriteBrickwallBlock extends WallBlock {
	public DioriteBrickwallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}
}