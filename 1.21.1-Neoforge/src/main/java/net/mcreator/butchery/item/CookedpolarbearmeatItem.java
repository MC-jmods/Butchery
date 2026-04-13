package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedpolarbearmeatItem extends Item {
	public CookedpolarbearmeatItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(16).saturationModifier(0.3f).build()));
	}
}