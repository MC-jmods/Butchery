package net.mcreator.butchery.init;

import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.butchery.jei_recipes.*;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.recipe.types.IRecipeType;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.List;

@JeiPlugin
public class ButcheryModJeiPlugin implements IModPlugin {
	public static IRecipeType<TaxidermyRecipe> Taxidermy_Type = IRecipeType.create(TaxidermyRecipeCategory.UID, TaxidermyRecipe.class);
	public static IRecipeType<MeatgrinderjeiRecipe> Meatgrinderjei_Type = IRecipeType.create(MeatgrinderjeiRecipeCategory.UID, MeatgrinderjeiRecipe.class);
	public static IRecipeType<PestleandmortarrecipetypeRecipe> Pestleandmortarrecipetype_Type = IRecipeType.create(PestleandmortarrecipetypeRecipeCategory.UID, PestleandmortarrecipetypeRecipe.class);

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
		registration.addCraftingStations(Taxidermy_Type, VanillaTypes.ITEM_STACK, List.of(new ItemStack(ButcheryModBlocks.TAXIDERMY_TABLE.get().asItem())));
		registration.addCraftingStations(Meatgrinderjei_Type, VanillaTypes.ITEM_STACK, List.of(new ItemStack(ButcheryModBlocks.MEAT_GRINDER.get().asItem())));
		registration.addCraftingStations(Pestleandmortarrecipetype_Type, VanillaTypes.ITEM_STACK, List.of(new ItemStack(ButcheryModBlocks.PESTLE_AND_MORTAR.get().asItem())));
	}
}