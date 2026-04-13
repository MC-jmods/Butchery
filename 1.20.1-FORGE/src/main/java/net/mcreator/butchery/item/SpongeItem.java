package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpongeItem extends Item {
	public SpongeItem() {
		super(new Item.Properties().durability(4062).rarity(Rarity.COMMON));
	}
}