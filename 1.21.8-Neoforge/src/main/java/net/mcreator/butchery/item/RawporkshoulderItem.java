package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawporkshoulderItem extends Item {
	public RawporkshoulderItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build()));
	}
}