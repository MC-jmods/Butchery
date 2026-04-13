package net.mcreator.butchery.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawlambribItem extends Item {
	public RawlambribItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()).usingConvertsTo(Items.BONE));
	}
}