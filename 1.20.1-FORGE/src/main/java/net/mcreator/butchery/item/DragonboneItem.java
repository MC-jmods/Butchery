package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonboneItem extends Item {
	public DragonboneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}