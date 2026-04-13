package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawlambloinItem extends Item {
	public RawlambloinItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}
}