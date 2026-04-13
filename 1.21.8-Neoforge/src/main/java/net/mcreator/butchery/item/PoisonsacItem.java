package net.mcreator.butchery.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.butchery.procedures.PoisonsacPlayerFinishesUsingItemProcedure;

public class PoisonsacItem extends Item {
	public PoisonsacItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		PoisonsacPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}