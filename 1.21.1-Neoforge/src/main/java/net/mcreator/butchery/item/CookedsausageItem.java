package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedsausageItem extends Item {
	public CookedsausageItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(11).saturationModifier(0.3f).build()));
	}
}