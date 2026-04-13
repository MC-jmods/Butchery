package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CracklingItem extends Item {
	public CracklingItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4f).build()));
	}
}