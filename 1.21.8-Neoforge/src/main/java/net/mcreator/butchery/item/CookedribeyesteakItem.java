package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedribeyesteakItem extends Item {
	public CookedribeyesteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.4f).build()));
	}
}