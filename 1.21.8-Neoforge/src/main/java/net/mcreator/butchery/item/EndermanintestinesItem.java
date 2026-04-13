package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class EndermanintestinesItem extends Item {
	public EndermanintestinesItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).build()));
	}
}