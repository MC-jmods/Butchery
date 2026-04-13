package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedvillagersteakItem extends Item {
	public CookedvillagersteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.3f).build()));
	}
}