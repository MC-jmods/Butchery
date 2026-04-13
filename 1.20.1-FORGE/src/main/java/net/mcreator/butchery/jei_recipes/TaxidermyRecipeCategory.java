package net.mcreator.butchery.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.butchery.init.ButcheryModJeiPlugin;
import net.mcreator.butchery.init.ButcheryModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class TaxidermyRecipeCategory implements IRecipeCategory<TaxidermyRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("butchery", "taxidermy");
	public final static ResourceLocation TEXTURE = new ResourceLocation("butchery", "textures/screens/taxidermy_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public TaxidermyRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 165);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ButcheryModBlocks.TAXIDERMY_TABLE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<TaxidermyRecipe> getRecipeType() {
		return ButcheryModJeiPlugin.Taxidermy_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Taxidermy");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, TaxidermyRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 44, 25).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 13).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 116, 25).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 56).addItemStack(recipe.getResultItem(null));
	}
}