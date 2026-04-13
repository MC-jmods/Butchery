package net.mcreator.butchery.procedures;

import net.minecraft.world.item.ItemStack;

public class RagpropertyvalueproviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("ragWetness") == 1) {
			return 1;
		} else if (itemstack.getOrCreateTag().getDouble("ragWetness") == 2) {
			return 2;
		} else if (itemstack.getOrCreateTag().getDouble("ragWetness") == 3) {
			return 3;
		} else if (itemstack.getOrCreateTag().getDouble("ragWetness") == 4) {
			return 4;
		} else if (itemstack.getOrCreateTag().getDouble("ragWetness") == 5) {
			return 5;
		}
		return 0;
	}
}