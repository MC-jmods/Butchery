package net.mcreator.butchery.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedcreeperlegItem extends Item {
	public CookedcreeperlegItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.3f).build()).usingConvertsTo(Items.BONE));
	}
}