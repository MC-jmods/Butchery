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

public class MeatgrinderjeiRecipeCategory implements IRecipeCategory<MeatgrinderjeiRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("butchery", "meatgrinderjei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("butchery", "textures/screens/meat_grinder_gui_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public MeatgrinderjeiRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 165);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ButcheryModBlocks.MEAT_GRINDER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<MeatgrinderjeiRecipe> getRecipeType() {
		return ButcheryModJeiPlugin.Meatgrinderjei_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Meat Grinder");
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
	public void setRecipe(IRecipeLayoutBuilder builder, MeatgrinderjeiRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 20).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 114, 20).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 8, 65).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 134, 20).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 48).addItemStack(recipe.getResultItem(null));
		builder.addSlot(RecipeIngredientRole.INPUT, 134, 48).addIngredients(recipe.getIngredients().get(4));
	}
}