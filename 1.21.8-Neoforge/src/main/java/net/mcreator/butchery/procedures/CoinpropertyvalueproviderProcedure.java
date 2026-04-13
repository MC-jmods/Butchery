package net.mcreator.butchery.procedures;

import net.minecraft.world.item.ItemStack;

public class CoinpropertyvalueproviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getCount() == 1) {
			return 1;
		} else if (itemstack.getCount() == 2) {
			return 2;
		} else if (itemstack.getCount() == 3) {
			return 3;
		} else if (itemstack.getCount() == 4) {
			return 4;
		} else if (itemstack.getCount() == 5) {
			return 5;
		} else if (itemstack.getCount() >= 6) {
			return 6;
		}
		return 0;
	}
}