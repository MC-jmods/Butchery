package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedliverItem extends Item {
	public CookedliverItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).build()));
	}
}