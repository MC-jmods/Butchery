package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedDragonMeatItem extends Item {
	public CookedDragonMeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(16).saturationModifier(0.3f).build()));
	}
}