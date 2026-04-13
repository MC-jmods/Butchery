package net.mcreator.butchery.procedures;

import net.minecraft.world.item.ItemStack;

public class RawsilverfishchunksPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getCount() > 1) {
			return 1;
		}
		return 0;
	}
}