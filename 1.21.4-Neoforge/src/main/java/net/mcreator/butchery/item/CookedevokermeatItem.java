package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedevokermeatItem extends Item {
	public CookedevokermeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(13).saturationModifier(0.3f).build()));
	}
}