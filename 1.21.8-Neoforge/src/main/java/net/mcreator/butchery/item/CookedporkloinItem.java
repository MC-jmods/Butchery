package net.mcreator.butchery.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

import net.mcreator.butchery.init.ButcheryModItems;

@EventBusSubscriber
public class CookedporkloinItem extends Item {
	public CookedporkloinItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.4f).build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(ButcheryModItems.COOKED_PORK_LOIN.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(ButcheryModItems.CRACKLING.get()))));
	}
}