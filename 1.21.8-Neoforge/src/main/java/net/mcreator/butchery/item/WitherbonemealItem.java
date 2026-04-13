package net.mcreator.butchery.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.butchery.procedures.Wither_bonemeal_right_clickProcedure;

import java.util.function.Consumer;

public class WitherbonemealItem extends Item {
	public WitherbonemealItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.butchery.wither_bone_meal.description_0"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Wither_bonemeal_right_clickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}