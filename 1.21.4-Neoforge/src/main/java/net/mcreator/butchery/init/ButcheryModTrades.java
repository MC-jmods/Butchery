/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.butchery.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class ButcheryModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ButcheryModItems.SPONGE.get()), new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ButcheryModItems.IRON_CLEAVER.get()), new ItemStack(Items.EMERALD, 4), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ButcheryModItems.IRON_SKINNING_KNIFE.get()), new ItemStack(Items.EMERALD, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ButcheryModBlocks.BLOOD_GRATE.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(ButcheryModBlocks.BASIN.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ButcheryModBlocks.HOOK.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(ButcheryModItems.RAW_TBONE_STEAK.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(ButcheryModItems.RAW_SALMON.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(ButcheryModItems.HEART.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ButcheryModItems.COOKED_LEG_OF_LAMB.get()), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ButcheryModItems.COOKED_MULE_STEAK.get()), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ButcheryModItems.COW_SKIN.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ButcheryModItems.OCELOT_SKIN.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ButcheryModItems.CREEPER_SKIN.get()), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ButcheryModItems.DIAMOND_HAMMER.get()), new ItemStack(Items.EMERALD, 26), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ButcheryModItems.WISHBONE.get()), new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ButcheryModItems.BOTTLE_OF_SULFURIC_ACID.get()), new ItemStack(Items.EMERALD, 4), 10, 5, 0.05f));
		}
	}
}