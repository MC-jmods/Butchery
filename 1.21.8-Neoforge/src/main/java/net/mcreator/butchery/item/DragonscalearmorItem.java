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

public abstract class DragonscalearmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(40, Map.of(ArmorType.BOOTS, 4, ArmorType.LEGGINGS, 6, ArmorType.CHESTPLATE, 9, ArmorType.HELMET, 4, ArmorType.BODY, 9), 18,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")), 3.5f, 0.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:dragon_scale_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:dragon_scale_armor")));

	private DragonscalearmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends DragonscalearmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends DragonscalearmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends DragonscalearmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends DragonscalearmorItem {
		public Boots(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}