package net.mcreator.butchery.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class SpongepropertyvalueproviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 1) {
			return 1;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 2) {
			return 2;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 3) {
			return 3;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 4) {
			return 4;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 5) {
			return 5;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 6) {
			return 6;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 7) {
			return 7;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 8) {
			return 8;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 9) {
			return 9;
		} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("spongeWetness", 0) == 10) {
			return 10;
		}
		return 0;
	}
}