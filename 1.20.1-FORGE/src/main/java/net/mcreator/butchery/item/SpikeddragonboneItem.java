package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpikeddragonboneItem extends Item {
	public SpikeddragonboneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}