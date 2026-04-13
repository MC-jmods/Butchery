package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonscaleingotItem extends Item {
	public DragonscaleingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}