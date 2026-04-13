package net.mcreator.butchery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedlambsirloinItem extends Item {
	public CookedlambsirloinItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(9).saturationModifier(0.45f).build()));
	}
}