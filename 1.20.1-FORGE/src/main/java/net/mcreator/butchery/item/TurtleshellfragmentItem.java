package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TurtleshellfragmentItem extends Item {
	public TurtleshellfragmentItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}