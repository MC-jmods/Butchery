package net.mcreator.butchery.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedtbonesteakItem extends Item {
	public CookedtbonesteakItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(10).saturationModifier(0.6f).build()).usingConvertsTo(Items.BONE));
	}
}