package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AnimalfatItem extends Item {
	public AnimalfatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}