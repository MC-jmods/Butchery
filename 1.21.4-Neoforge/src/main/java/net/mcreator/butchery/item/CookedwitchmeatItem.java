package net.mcreator.butchery.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedwitchmeatItem extends Item {
	public CookedwitchmeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(13).saturationModifier(0.3f).build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}