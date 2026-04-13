package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class JelliecatfurItem extends Item {
	public JelliecatfurItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}