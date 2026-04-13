package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedpinkaxolotlfilletItem extends Item {
	public CookedpinkaxolotlfilletItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.3f).build()));
	}
}