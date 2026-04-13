package net.mcreator.butchery.recipe.brewing;

import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponents;

import net.mcreator.butchery.init.ButcheryModItems;

@EventBusSubscriber
public class PufferfishspikerecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new PufferfishspikerecipeBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(Potions.AWKWARD);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(ButcheryModItems.PUFFERFISH_SPIKE.get()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(input.getItem(), Potions.POISON);
		}
		return ItemStack.EMPTY;
	}
}