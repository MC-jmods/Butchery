package net.mcreator.butchery.init;

import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

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

import java.util.stream.Collectors;
import java.util.List;

@JeiPlugin
public class ButcheryModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<TaxidermyRecipe> Taxidermy_Type = new mezz.jei.api.recipe.RecipeType<>(TaxidermyRecipeCategory.UID, TaxidermyRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<MeatgrinderjeiRecipe> Meatgrinderjei_Type = new mezz.jei.api.recipe.RecipeType<>(MeatgrinderjeiRecipeCategory.UID, MeatgrinderjeiRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<PestleandmortarrecipetypeRecipe> Pestleandmortarrecipetype_Type = new mezz.jei.api.recipe.RecipeType<>(PestleandmortarrecipetypeRecipeCategory.UID, PestleandmortarrecipetypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("butchery:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new TaxidermyRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new MeatgrinderjeiRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new PestleandmortarrecipetypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		List<TaxidermyRecipe> TaxidermyRecipes = ButcheryModRecipeTypes.recipes.byType(TaxidermyRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(Taxidermy_Type, TaxidermyRecipes);
		List<MeatgrinderjeiRecipe> MeatgrinderjeiRecipes = ButcheryModRecipeTypes.recipes.byType(MeatgrinderjeiRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(Meatgrinderjei_Type, MeatgrinderjeiRecipes);
		List<PestleandmortarrecipetypeRecipe> PestleandmortarrecipetypeRecipes = ButcheryModRecipeTypes.recipes.byType(PestleandmortarrecipetypeRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(Pestleandmortarrecipetype_Type, PestleandmortarrecipetypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.TAXIDERMY_TABLE.get().asItem()), Taxidermy_Type);
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.MEAT_GRINDER.get().asItem()), Meatgrinderjei_Type);
		registration.addRecipeCatalyst(new ItemStack(ButcheryModBlocks.PESTLE_AND_MORTAR.get().asItem()), Pestleandmortarrecipetype_Type);
	}
}