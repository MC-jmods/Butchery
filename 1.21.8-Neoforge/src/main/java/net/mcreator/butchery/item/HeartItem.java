package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HeartItem extends Item {
	public HeartItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.3f).build()));
	}
}