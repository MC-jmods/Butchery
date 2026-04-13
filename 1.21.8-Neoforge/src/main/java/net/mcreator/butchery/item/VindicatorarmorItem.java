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

public abstract class VindicatorarmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(13, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 13,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_leather")), 0.6f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:vindicatorarmor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:vindicatorarmor")));

	private VindicatorarmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends VindicatorarmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends VindicatorarmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends VindicatorarmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends VindicatorarmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}