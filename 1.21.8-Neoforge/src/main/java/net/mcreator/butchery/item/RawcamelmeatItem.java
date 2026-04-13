package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawcamelmeatItem extends Item {
	public RawcamelmeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}
}