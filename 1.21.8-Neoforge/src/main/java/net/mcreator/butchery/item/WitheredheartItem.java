package net.mcreator.butchery.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.butchery.procedures.WitheredheardfinishedusingProcedure;

public class WitheredheartItem extends Item {
	public WitheredheartItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(18).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WitheredheardfinishedusingProcedure.execute(world, entity);
		return retval;
	}
}