package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedrumpSteakItem extends Item {
	public CookedrumpSteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.5f).build()));
	}
}