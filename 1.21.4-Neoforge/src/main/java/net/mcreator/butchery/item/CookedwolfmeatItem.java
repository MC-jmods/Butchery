package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedwolfmeatItem extends Item {
	public CookedwolfmeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(11).saturationModifier(0.3f).build()));
	}
}