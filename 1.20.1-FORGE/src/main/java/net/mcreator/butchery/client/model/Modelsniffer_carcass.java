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

// Made with Blockbench 5.0.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsniffer_carcass<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelsniffer_carcass"), "main");
	public final ModelPart bone9;
	public final ModelPart head;
	public final ModelPart lower_beak;
	public final ModelPart nose;
	public final ModelPart left_ear;
	public final ModelPart right_ear;
	public final ModelPart body;
	public final ModelPart bone4;
	public final ModelPart bone2;
	public final ModelPart bone8;
	public final ModelPart bone7;
	public final ModelPart bone3;
	public final ModelPart bone;
	public final ModelPart bone5;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart middle_left_leg;
	public final ModelPart middle_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;
	public final ModelPart bone6;
	public final ModelPart front_left_leg2;
	public final ModelPart front_right_leg2;
	public final ModelPart middle_left_leg2;
	public final ModelPart middle_right_leg2;
	public final ModelPart back_left_leg2;
	public final ModelPart back_right_leg2;

	public Modelsniffer_carcass(ModelPart root) {
		this.bone9 = root.getChild("bone9");
		this.head = this.bone9.getChild("head");
		this.lower_beak = this.head.getChild("lower_beak");
		this.nose = this.head.getChild("nose");
		this.left_ear = this.head.getChild("left_ear");
		this.right_ear = this.head.getChild("right_ear");
		this.body = this.bone9.getChild("body");
		this.bone4 = this.body.getChild("bone4");
		this.bone2 = this.body.getChild("bone2");
		this.bone8 = this.bone2.getChild("bone8");
		this.bone7 = this.bone2.getChild("bone7");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone = this.body.getChild("bone");
		this.bone5 = this.bone9.getChild("bone5");
		this.front_left_leg = this.bone5.getChild("front_left_leg");
		this.front_right_leg = this.bone5.getChild("front_right_leg");
		this.middle_left_leg = this.bone5.getChild("middle_left_leg");
		this.middle_right_leg = this.bone5.getChild("middle_right_leg");
		this.back_left_leg = this.bone5.getChild("back_left_leg");
		this.back_right_leg = this.bone5.getChild("back_right_leg");
		this.bone6 = this.bone9.getChild("bone6");
		this.front_left_leg2 = this.bone6.getChild("front_left_leg2");
		this.front_right_leg2 = this.bone6.getChild("front_right_leg2");
		this.middle_left_leg2 = this.bone6.getChild("middle_left_leg2");
		this.middle_right_leg2 = this.bone6.getChild("middle_right_leg2");
		this.back_left_leg2 = this.bone6.getChild("back_left_leg2");
		this.back_right_leg2 = this.bone6.getChild("back_right_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 14.125F, -1.875F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = bone9.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(8, 4).addBox(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(8, 15).addBox(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.625F, -14.625F));
		PartDefinition lower_beak = head.addOrReplaceChild("lower_beak", CubeListBuilder.create().texOffs(10, 57).addBox(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, -12.5F));
		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(10, 45).addBox(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, -11.5F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(2, 0).addBox(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(6.51F, -7.5F, -4.5F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.51F, -7.5F, -4.5F));
		PartDefinition body = bone9.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -9.125F, 4.875F));
		PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(62, 68).addBox(-12.5F, -17.5F, -20.0F, 25.0F, 29.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
				.addBox(-12.5F, -17.5F, -20.0F, 25.0F, 24.0F, 40.0F, new CubeDeformation(0.5F)).texOffs(87, 68).addBox(-12.5F, 8.5F, -20.0F, 25.0F, 0.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, 0.0F));
		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(78, 326).addBox(-9.5F, -33.0F, -19.0F, 19.0F, 20.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition bone8 = bone2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 295).addBox(-12.5F, -32.0F, 8.0F, 24.0F, 25.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -1.5F, 0.5F));
		PartDefinition bone7 = bone2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 256).addBox(-12.0F, -12.5F, -7.0F, 24.0F, 25.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, -12.5F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(76, 256).addBox(-12.0F, -12.5F, -7.0F, 24.0F, 25.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, 1.5F));
		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition bone5 = bone9.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 5.875F, 4.875F));
		PartDefinition front_left_leg = bone5.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(0, 87).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, -15.0F, -1.5708F, -0.7854F, 0.0F));
		PartDefinition front_right_leg = bone5.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(32, 87).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, -15.0F, -1.5708F, 0.6545F, 0.0F));
		PartDefinition middle_left_leg = bone5.addOrReplaceChild("middle_left_leg", CubeListBuilder.create().texOffs(0, 105).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, -1.5708F, -0.6981F, 0.0F));
		PartDefinition middle_right_leg = bone5.addOrReplaceChild("middle_right_leg", CubeListBuilder.create().texOffs(32, 105).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -1.5708F, 0.4363F, 0.0F));
		PartDefinition back_left_leg = bone5.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 123).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, 15.0F, -1.5708F, -0.9599F, 0.0F));
		PartDefinition back_right_leg = bone5.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(32, 123).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 15.0F, -1.5708F, 0.9599F, 0.0F));
		PartDefinition bone6 = bone9.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 5.875F, 4.875F));
		PartDefinition front_left_leg2 = bone6.addOrReplaceChild("front_left_leg2", CubeListBuilder.create().texOffs(0, 199).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, -15.0F, -1.5708F, -0.7854F, 0.0F));
		PartDefinition front_right_leg2 = bone6.addOrReplaceChild("front_right_leg2", CubeListBuilder.create().texOffs(32, 199).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, -15.0F, -1.5708F, 0.6545F, 0.0F));
		PartDefinition middle_left_leg2 = bone6.addOrReplaceChild("middle_left_leg2", CubeListBuilder.create().texOffs(0, 217).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, -1.5708F, -0.6981F, 0.0F));
		PartDefinition middle_right_leg2 = bone6.addOrReplaceChild("middle_right_leg2", CubeListBuilder.create().texOffs(32, 217).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -1.5708F, 0.4363F, 0.0F));
		PartDefinition back_left_leg2 = bone6.addOrReplaceChild("back_left_leg2", CubeListBuilder.create().texOffs(0, 235).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.0F, 15.0F, -1.5708F, -0.9599F, 0.0F));
		PartDefinition back_right_leg2 = bone6.addOrReplaceChild("back_right_leg2", CubeListBuilder.create().texOffs(32, 235).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 15.0F, -1.5708F, 0.9599F, 0.0F));
		return LayerDefinition.create(meshdefinition, 192, 384);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}