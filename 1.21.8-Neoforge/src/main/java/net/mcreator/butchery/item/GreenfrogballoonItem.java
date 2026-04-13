package net.mcreator.butchery.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.butchery.procedures.SlowfallingballoonProcedure;

import javax.annotation.Nullable;

public class GreenfrogballoonItem extends Item {
	public GreenfrogballoonItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		if (equipmentSlot == EquipmentSlot.MAINHAND)
			SlowfallingballoonProcedure.execute(entity);
	}
}