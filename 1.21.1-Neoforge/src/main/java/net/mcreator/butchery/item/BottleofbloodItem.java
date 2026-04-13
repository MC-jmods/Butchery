package net.mcreator.butchery.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BottleofbloodItem extends Item {
	public BottleofbloodItem() {
		super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}
}