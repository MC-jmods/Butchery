package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedendermanlungsItem extends Item {
	public CookedendermanlungsItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(13).saturationModifier(0.3f).build()));
	}
}