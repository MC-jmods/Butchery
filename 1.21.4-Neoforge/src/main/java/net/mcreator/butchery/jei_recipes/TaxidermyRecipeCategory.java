package net.mcreator.butchery.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.butchery.init.ButcheryModJeiPlugin;
import net.mcreator.butchery.init.ButcheryModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class TaxidermyRecipeCategory implements IRecipeCategory<TaxidermyRecipe> {
	public final static ResourceLocation UID = ResourceLocation.parse("butchery:taxidermy");
	public final static ResourceLocation TEXTURE = ResourceLocation.parse("butchery:textures/screens/taxidermy_gui.png");
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
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public void draw(TaxidermyRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, TaxidermyRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 44, 25).add(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 13).add(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 116, 25).add(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 56).add(recipe.getResultItem(null));
	}
}