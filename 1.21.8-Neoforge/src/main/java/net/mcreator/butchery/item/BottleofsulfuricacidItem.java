package net.mcreator.butchery.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class BottleofsulfuricacidItem extends Item {
	public BottleofsulfuricacidItem(Item.Properties properties) {
		super(properties.stacksTo(16));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.butchery.bottle_of_sulfuric_acid.description_0"));
	}
}