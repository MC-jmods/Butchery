package net.mcreator.butchery.procedures;

import net.minecraft.world.item.ItemStack;

public class MagmachunksPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getCount() > 1) {
			return 1;
		}
		return 0;
	}
}