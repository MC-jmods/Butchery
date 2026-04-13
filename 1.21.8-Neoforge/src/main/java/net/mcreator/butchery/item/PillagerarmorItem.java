package net.mcreator.butchery.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.butchery.procedures.WearingpillagerdisguiseProcedure;

import javax.annotation.Nullable;

import java.util.Map;

public abstract class PillagerarmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(5, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 3, ArmorType.CHESTPLATE, 4, ArmorType.HELMET, 1, ArmorType.BODY, 4), 13,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_leather")), 0.4f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:pillager_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:pillager_armor")));

	private PillagerarmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends PillagerarmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				WearingpillagerdisguiseProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends PillagerarmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends PillagerarmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends PillagerarmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}