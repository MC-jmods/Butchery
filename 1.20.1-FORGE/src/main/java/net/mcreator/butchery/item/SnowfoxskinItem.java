package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SnowfoxskinItem extends Item {
	public SnowfoxskinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}