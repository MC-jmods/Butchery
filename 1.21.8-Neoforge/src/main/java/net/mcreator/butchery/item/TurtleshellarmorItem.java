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

public abstract class TurtleshellarmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(13, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 4, ArmorType.CHESTPLATE, 5, ArmorType.HELMET, 2, ArmorType.BODY, 5), 8,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_leather")), 0.5f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:turtle_shell_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:turtle_shell_armor")));

	private TurtleshellarmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Chestplate extends TurtleshellarmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends TurtleshellarmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends TurtleshellarmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}