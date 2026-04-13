package net.mcreator.butchery.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CopperskinningknifeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 125, 6f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:copper_skinning_knife_repair_items")));

	public CopperskinningknifeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3.5f, -2.2f).setNoCombineRepair());
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