package net.mcreator.butchery.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.butchery.jei_recipes.TaxidermyRecipe;
import net.mcreator.butchery.init.ButcheryModRecipeTypes;

import java.util.stream.Collectors;
import java.util.List;

public class TaxidermytableOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack slotitem = ItemStack.EMPTY;
		double slot = 0;
		slotitem = (new Object() {
			public ItemStack getResult() {
				List<TaxidermyRecipe> recipes = null;
				if (world instanceof ServerLevel _lvl) {
					recipes = _lvl.recipeAccess().recipeMap().byType(TaxidermyRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
				} else {
					recipes = ButcheryModRecipeTypes.recipes.byType(TaxidermyRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
				}
				for (TaxidermyRecipe recipe : recipes) {
					List<Ingredient> ingredients = recipe.getIngredients();
					if (!ingredients.get(0).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy())))
						continue;
					if (!ingredients.get(1).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy())))
						continue;
					if (!ingredients.get(2).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy())))
						continue;
					return recipe.getResultItems().get(0).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getResult()).copy();
		if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
			ItemStack _setstack = slotitem.copy();
			_setstack.setCount(slotitem.getCount());
			_itemHandlerModifiable.setStackInSlot(3, _setstack);
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}