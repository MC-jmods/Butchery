package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedlambshoulderItem extends Item {
	public CookedlambshoulderItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.3f).build()));
	}
}