package net.mcreator.butchery.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawtbonesteakItem extends Item {
	public RawtbonesteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4f).build()).usingConvertsTo(Items.BONE));
	}
}