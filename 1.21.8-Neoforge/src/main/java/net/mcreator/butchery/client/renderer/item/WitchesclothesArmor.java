package net.mcreator.butchery.client.renderer.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.client.model.Modelwitch_disguise;

import java.util.Map;
import java.util.Collections;

@EventBusSubscriber(Dist.CLIENT)
public class WitchesclothesArmor {
	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
							new ModelPart(Collections.emptyList(),
									Map.of("head", new Modelwitch_disguise(Minecraft.getInstance().getEntityModels().bakeLayer(Modelwitch_disguise.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
							"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("butchery:textures/entities/witch_clothes.png");
			}
		}, ButcheryModItems.WITCHES_CLOTHES_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					Modelwitch_disguise model = new Modelwitch_disguise(Minecraft.getInstance().getEntityModels().bakeLayer(Modelwitch_disguise.LAYER_LOCATION));
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body", model.Body, "left_arm", model.LeftArm, "right_arm", model.RightArm, "head", new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("butchery:textures/entities/witch_clothes.png");
			}
		}, ButcheryModItems.WITCHES_CLOTHES_CHESTPLATE.get());
	}
}