package net.mcreator.butchery.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwarden_carcass<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelwarden_carcass"), "main");
	public final ModelPart bone;
	public final ModelPart right_arm;
	public final ModelPart bone2;
	public final ModelPart head;
	public final ModelPart left_tendril;
	public final ModelPart right_tendril;
	public final ModelPart torso;
	public final ModelPart left_ribcage;
	public final ModelPart right_ribcage;
	public final ModelPart left_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modelwarden_carcass(ModelPart root) {
		this.bone = root.getChild("bone");
		this.right_arm = this.bone.getChild("right_arm");
		this.bone2 = this.bone.getChild("bone2");
		this.head = this.bone2.getChild("head");
		this.left_tendril = this.bone2.getChild("left_tendril");
		this.right_tendril = this.bone2.getChild("right_tendril");
		this.torso = this.bone.getChild("torso");
		this.left_ribcage = this.bone.getChild("left_ribcage");
		this.right_ribcage = this.bone.getChild("right_ribcage");
		this.left_arm = this.bone.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(44, 50).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -14.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.2F, -1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head = bone2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_tendril = bone2.addOrReplaceChild("left_tendril", CubeListBuilder.create().texOffs(58, 0).addBox(-8.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, -9.0F, 1.0F));
		PartDefinition right_tendril = bone2.addOrReplaceChild("right_tendril", CubeListBuilder.create().texOffs(52, 32).addBox(-8.0F, -16.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, -9.0F, 1.0F));
		PartDefinition torso = bone.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-22.0F, -17.5F, -5.5F, 18.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, -3.5F, 0.5F));
		PartDefinition left_ribcage = bone.addOrReplaceChild("left_ribcage", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(-17.5F, -17.5F, 0.0F, 9.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(17.5F, -3.5F, -5.1F));
		PartDefinition right_ribcage = bone.addOrReplaceChild("right_ribcage", CubeListBuilder.create().texOffs(90, 11).addBox(-17.5F, -17.5F, 0.0F, 9.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.5F, -3.5F, -5.1F));
		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -14.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(6.0F, 18.0F, 1.0F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(76, 76).addBox(3.1F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 3.0F, 0.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-6.0F, 18.0F, 1.0F));
		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(76, 48).addBox(-9.1F, -2.5F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 3.0F, 0.5F, -1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}