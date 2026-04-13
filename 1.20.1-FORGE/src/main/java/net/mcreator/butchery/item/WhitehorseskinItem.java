package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WhitehorseskinItem extends Item {
	public WhitehorseskinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}