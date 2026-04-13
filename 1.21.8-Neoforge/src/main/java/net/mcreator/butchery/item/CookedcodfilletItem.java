package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedcodfilletItem extends Item {
	public CookedcodfilletItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.3f).build()));
	}
}