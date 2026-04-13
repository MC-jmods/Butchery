package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedhoglinchunkItem extends Item {
	public CookedhoglinchunkItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(15).saturationModifier(0.3f).build()));
	}
}