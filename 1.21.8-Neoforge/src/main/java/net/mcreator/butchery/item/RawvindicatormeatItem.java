package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawvindicatormeatItem extends Item {
	public RawvindicatormeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}