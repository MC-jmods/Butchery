package net.mcreator.butchery.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BottleofbloodItem extends Item {
	public BottleofbloodItem(Item.Properties properties) {
		super(properties.stacksTo(1).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}
}