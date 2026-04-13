package net.mcreator.butchery.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.butchery.init.ButcheryModFluids;

public class InfectedBloodItem extends BucketItem {
	public InfectedBloodItem(Item.Properties properties) {
		super(ButcheryModFluids.INFECTED_BLOOD.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}