package net.mcreator.butchery.init;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.StreamSupport;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class ButcheryModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("butchery:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		ingredientStack.add(new ItemStack(ButcheryModItems.BAT_WING.get()));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.AWKWARD));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.SLOW_FALLING));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy(), ResourceLocation.parse("butchery:batwingbrewing")));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.NETHER_STAR));
		inputStack.add(new ItemStack(ButcheryModItems.WISHBONE.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(ButcheryModItems.MAGIC_WISHBONE.get()), ResourceLocation.parse("butchery:magic_wishbone_recipe")));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(ButcheryModItems.POISON_SAC.get()));
		inputStack.add(new ItemStack(Items.GLASS_BOTTLE));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), potion.copy(), ResourceLocation.parse("butchery:bottledpoisonrecipe")));
		ingredientStack.clear();
		inputStack.clear();
		ingredientStack.add(new ItemStack(ButcheryModItems.BEE_WINGS.get()));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.AWKWARD));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.SLOW_FALLING));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy(), ResourceLocation.parse("butchery:beewingsrecipe")));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(ButcheryModItems.PUFFERFISH_SPIKE.get()));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.AWKWARD));
		potion2.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.POISON));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy(), ResourceLocation.parse("butchery:pufferfishspikerecipe")));
		ingredientStack.clear();
		ingredientStack = (ArrayList<ItemStack>) StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(ResourceLocation.parse("c:sulfur"))).spliterator(), false).map(item -> new ItemStack(item.value()))
				.collect(Collectors.toCollection(ArrayList::new));
		potion.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), new ItemStack(ButcheryModItems.BOTTLE_OF_SULFURIC_ACID.get()), ResourceLocation.parse("butchery:sulfuricacidbrewing")));
		ingredientStack.clear();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}