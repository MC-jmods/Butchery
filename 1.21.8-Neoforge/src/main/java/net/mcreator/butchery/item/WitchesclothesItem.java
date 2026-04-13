package net.mcreator.butchery.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class WitchesclothesItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(3, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 2, ArmorType.CHESTPLATE, 3, ArmorType.HELMET, 1, ArmorType.BODY, 3), 15,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_leather")), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:witches_clothes_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:witches_clothes")));

	private WitchesclothesItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends WitchesclothesItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends WitchesclothesItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}
}