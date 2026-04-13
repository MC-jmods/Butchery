package net.mcreator.butchery.procedures;

import net.minecraft.world.item.ItemStack;

public class SpongepropertyvalueproviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 1) {
			return 1;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 2) {
			return 2;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 3) {
			return 3;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 4) {
			return 4;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 5) {
			return 5;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 6) {
			return 6;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 7) {
			return 7;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 8) {
			return 8;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 9) {
			return 9;
		} else if (itemstack.getOrCreateTag().getDouble("spongeWetness") == 10) {
			return 10;
		}
		return 0;
	}
}