package net.mcreator.butchery.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BonehacksawItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:bone_hacksaw_repair_items")));

	public BonehacksawItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -3f, properties.setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}