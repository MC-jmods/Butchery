package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BatwingItem extends Item {
	public BatwingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}