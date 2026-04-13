package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SausageattachmentItem extends Item {
	public SausageattachmentItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}