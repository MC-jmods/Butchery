package net.mcreator.butchery.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class BloodybutchersapronItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(3, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("butchery:bloody_butchers_apron_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("butchery:bloody_butchers_apron")));

	private BloodybutchersapronItem(Item.Properties properties) {
		super(properties);
	}

	public static class Chestplate extends BloodybutchersapronItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}
}