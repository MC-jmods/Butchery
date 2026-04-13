package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedravagermeatItem extends Item {
	public CookedravagermeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(14).saturationMod(0.3f).meat().build()));
	}
}