package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ButcherspapersItem extends Item {
	public ButcherspapersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}