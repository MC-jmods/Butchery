package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedelderguardianmeatItem extends Item {
	public CookedelderguardianmeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(18).saturationModifier(0.3f).build()));
	}
}