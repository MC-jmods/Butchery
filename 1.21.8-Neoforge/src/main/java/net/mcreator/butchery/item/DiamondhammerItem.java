package net.mcreator.butchery.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DiamondhammerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1561, 8f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:diamond_hammer_repair_items")));

	public DiamondhammerItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 6f, -2.8f).setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}
}