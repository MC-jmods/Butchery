package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedvindicatormeatItem extends Item {
	public CookedvindicatormeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(13).saturationModifier(0.3f).build()));
	}
}