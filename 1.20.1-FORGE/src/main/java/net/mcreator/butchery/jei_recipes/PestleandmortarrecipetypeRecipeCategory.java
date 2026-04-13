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

public class PestleandmortarrecipetypeRecipeCategory implements IRecipeCategory<PestleandmortarrecipetypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("butchery", "pestleandmortarrecipetype");
	public final static ResourceLocation TEXTURE = new ResourceLocation("butchery", "textures/screens/jei_pestleandmortar_copy.png");
	private final IDrawable background;
	private final IDrawable icon;

	public PestleandmortarrecipetypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 95, 55);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ButcheryModBlocks.PESTLE_AND_MORTAR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<PestleandmortarrecipetypeRecipe> getRecipeType() {
		return ButcheryModJeiPlugin.Pestleandmortarrecipetype_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Pestle & Mortar");
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
	public void setRecipe(IRecipeLayoutBuilder builder, PestleandmortarrecipetypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 5, 17).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 77, 17).addItemStack(recipe.getResultItem(null));
	}
}