package net.mcreator.butchery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedelderguardianmeatItem extends Item {
	public CookedelderguardianmeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(18).saturationMod(0.3f).meat().build()));
	}
}