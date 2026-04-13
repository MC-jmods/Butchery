package net.mcreator.butchery.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class RagpropertyvalueproviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) == 1) {
			return 1;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) == 2) {
			return 2;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) == 3) {
			return 3;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) == 4) {
			return 4;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("ragWetness", 0) == 5) {
			return 5;
		}
		return 0;
	}
}