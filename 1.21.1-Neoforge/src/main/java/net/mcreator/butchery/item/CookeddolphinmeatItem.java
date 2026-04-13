package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookeddolphinmeatItem extends Item {
	public CookeddolphinmeatItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.3f).build()));
	}
}