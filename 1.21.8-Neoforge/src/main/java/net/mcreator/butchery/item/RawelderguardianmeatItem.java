package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawelderguardianmeatItem extends Item {
	public RawelderguardianmeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(0.3f).build()));
	}
}