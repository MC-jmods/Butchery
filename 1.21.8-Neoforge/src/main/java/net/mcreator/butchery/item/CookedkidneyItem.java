package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedkidneyItem extends Item {
	public CookedkidneyItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.3f).build()));
	}
}