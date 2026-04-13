package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawsniffersteakItem extends Item {
	public RawsniffersteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.3f).build()));
	}
}