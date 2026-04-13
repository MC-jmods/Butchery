package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HoofItem extends Item {
	public HoofItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}