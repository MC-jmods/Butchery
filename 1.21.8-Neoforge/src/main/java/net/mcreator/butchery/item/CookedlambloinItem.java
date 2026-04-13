package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedlambloinItem extends Item {
	public CookedlambloinItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.4f).build()));
	}
}