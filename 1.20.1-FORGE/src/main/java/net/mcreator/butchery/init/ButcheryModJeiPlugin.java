package net.mcreator.butchery.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.butchery.jei_recipes.TaxidermyRecipeCategory;
import net.mcreator.butchery.jei_recipes.TaxidermyRecipe;
import net.mcreator.butchery.jei_recipes.PestleandmortarrecipetypeRecipeCategory;
import net.mcreator.butchery.jei_recipes.PestleandmortarrecipetypeRecipe;
import net.mcreator.butchery.jei_recipes.MeatgrinderjeiRecipeCategory;
import net.mcreator.butchery.jei_recipes.MeatgrinderjeiRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ButcheryModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<TaxidermyRecipe> Taxidermy_Type = new mezz.jei.api.recipe.RecipeType<>(TaxidermyRecipeCategory.UID, TaxidermyRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<MeatgrinderjeiRecipe> Meatgrinderjei_Type = new mezz.jei.api.recipe.RecipeType<>(MeatgrinderjeiRecipeCategory.UID, MeatgrinderjeiRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<PestleandmortarrecipetypeRecipe> Pestleandmortarrecipetype_Type = new mezz.jei.api.recipe.RecipeType<>(PestleandmortarrecipetypeRecipeCategory.UID, PestleandmortarrecipetypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("butchery:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new TaxidermyRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new MeatgrinderjeiRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new PestleandmortarrecipetypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<TaxidermyRecipe> TaxidermyRecipes = recipeManager.getAllRecipesFor(TaxidermyRecipe.Type.INSTANCE);
		registration.addRecipes(Taxidermy_Type, TaxidermyRecipes);
		List<MeatgrinderjeiRecipe> MeatgrinderjeiRecipes = recipeManager.getAllRecipesFor(MeatgrinderjeiRecipe.Type.INSTANCE);
		registration.addRecipes(Meatgrinderjei_Type, MeatgrinderjeiRecipes);
		List<PestleandmortarrecipetypeRecipe> PestleandmortarrecipetypeRecipes = recipeManager.getAllRecipesFor(PestleandmortarrecipetypeRecipe.Type.INSTANCE);
		registration.addRecipes(Pestleandmortarrecipetype_Type, PestleandmortarrecipetypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.TAXIDERMY_TABLE.get().asItem()), Taxidermy_Type);
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.MEAT_GRINDER.get().asItem()), Meatgrinderjei_Type);
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.PESTLE_AND_MORTAR.get().asItem()), Pestleandmortarrecipetype_Type);
	}
}