package net.mcreator.butchery.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelelder_guardian extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelelder_guardian"), "main");
	public final ModelPart bone;
	public final ModelPart body;
	public final ModelPart body_flipped;
	public final ModelPart body_sub_1;
	public final ModelPart bone2;
	public final ModelPart eye;
	public final ModelPart tail1;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart spine1;
	public final ModelPart spine1_rotation;
	public final ModelPart spine2;
	public final ModelPart spine2_rotation;
	public final ModelPart spine3;
	public final ModelPart spine3_rotation;
	public final ModelPart spine4;
	public final ModelPart spine4_rotation;
	public final ModelPart spine5;
	public final ModelPart spine5_rotation;
	public final ModelPart spine6;
	public final ModelPart spine6_rotation;
	public final ModelPart spine7;
	public final ModelPart spine7_rotation;
	public final ModelPart spine8;
	public final ModelPart spine8_rotation;
	public final ModelPart spine9;
	public final ModelPart spine9_rotation;
	public final ModelPart spine10;
	public final ModelPart spine10_rotation;
	public final ModelPart spine11;
	public final ModelPart spine11_rotation;
	public final ModelPart spine12;
	public final ModelPart spine12_rotation;

	public Modelelder_guardian(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.body_flipped = this.body.getChild("body_flipped");
		this.body_sub_1 = this.body_flipped.getChild("body_sub_1");
		this.bone2 = this.bone.getChild("bone2");
		this.eye = this.bone.getChild("eye");
		this.tail1 = this.bone.getChild("tail1");
		this.tail2 = this.bone.getChild("tail2");
		this.tail3 = this.bone.getChild("tail3");
		this.spine1 = this.bone.getChild("spine1");
		this.spine1_rotation = this.spine1.getChild("spine1_rotation");
		this.spine2 = this.bone.getChild("spine2");
		this.spine2_rotation = this.spine2.getChild("spine2_rotation");
		this.spine3 = this.bone.getChild("spine3");
		this.spine3_rotation = this.spine3.getChild("spine3_rotation");
		this.spine4 = this.bone.getChild("spine4");
		this.spine4_rotation = this.spine4.getChild("spine4_rotation");
		this.spine5 = this.bone.getChild("spine5");
		this.spine5_rotation = this.spine5.getChild("spine5_rotation");
		this.spine6 = this.bone.getChild("spine6");
		this.spine6_rotation = this.spine6.getChild("spine6_rotation");
		this.spine7 = this.bone.getChild("spine7");
		this.spine7_rotation = this.spine7.getChild("spine7_rotation");
		this.spine8 = this.bone.getChild("spine8");
		this.spine8_rotation = this.spine8.getChild("spine8_rotation");
		this.spine9 = this.bone.getChild("spine9");
		this.spine9_rotation = this.spine9.getChild("spine9_rotation");
		this.spine10 = this.bone.getChild("spine10");
		this.spine10_rotation = this.spine10.getChild("spine10_rotation");
		this.spine11 = this.bone.getChild("spine11");
		this.spine11_rotation = this.spine11.getChild("spine11_rotation");
		this.spine12 = this.bone.getChild("spine12");
		this.spine12_rotation = this.spine12.getChild("spine12_rotation");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-12.75F, -18.0F, -24.0F, 36.0F, 36.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(48, 120)
				.addBox(-12.75F, -24.0F, -18.0F, 36.0F, 6.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 84).addBox(-18.75F, -18.0F, -18.0F, 6.0F, 36.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.25F, -24.0F, 0.0F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(48, 120).addBox(-18.0F, -3.0F, -18.0F, 36.0F, 6.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.25F, 21.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_flipped = body.addOrReplaceChild("body_flipped", CubeListBuilder.create(), PartPose.offset(5.25F, 24.0F, 0.0F));
		PartDefinition body_sub_1 = body_flipped.addOrReplaceChild("body_sub_1", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(18.0F, -42.0F, -18.0F, 6.0F, 36.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(54, 126).addBox(-9.0F, -27.0F, -24.0F, 18.0F, 9.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition eye = bone.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.5F, -23.25F));
		PartDefinition tail1 = bone.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(120, 0).addBox(-6.0F, -6.0F, -12.0F, 12.0F, 12.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 33.0F));
		PartDefinition tail2 = bone.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 162).addBox(-4.5F, -4.5F, -10.5F, 9.0F, 9.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 52.5F));
		PartDefinition tail3 = bone.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(123, 96).addBox(-3.75F, -3.0F, -15.75F, 6.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(75, 57).addBox(-0.75F, -13.5F, -6.75F, 0.0F, 27.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.75F, -24.0F, 75.75F));
		PartDefinition tail3_r1 = tail3.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(75, 57).addBox(0.0F, -13.5F, -13.5F, 0.0F, 27.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 6.75F, 0.0F, 0.0F, -3.1416F));
		PartDefinition spine1 = bone.addOrReplaceChild("spine1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine1_rotation = spine1.addOrReplaceChild("spine1_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -45.0F, 21.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition spine2 = bone.addOrReplaceChild("spine2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine2_rotation = spine2.addOrReplaceChild("spine2_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -45.0F, -21.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition spine3 = bone.addOrReplaceChild("spine3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine3_rotation = spine3.addOrReplaceChild("spine3_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition spine4 = bone.addOrReplaceChild("spine4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine4_rotation = spine4.addOrReplaceChild("spine4_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -45.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition spine5 = bone.addOrReplaceChild("spine5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine5_rotation = spine5.addOrReplaceChild("spine5_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -24.0F, -21.0F, 1.5708F, 0.7854F, 0.0F));
		PartDefinition spine6 = bone.addOrReplaceChild("spine6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine6_rotation = spine6.addOrReplaceChild("spine6_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -24.0F, -21.0F, 1.5708F, -0.7854F, 0.0F));
		PartDefinition spine7 = bone.addOrReplaceChild("spine7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine7_rotation = spine7.addOrReplaceChild("spine7_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -24.0F, 21.0F, -1.5708F, 0.7854F, 0.0F));
		PartDefinition spine8 = bone.addOrReplaceChild("spine8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine8_rotation = spine8.addOrReplaceChild("spine8_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -24.0F, 21.0F, -1.5708F, -0.7854F, 0.0F));
		PartDefinition spine9 = bone.addOrReplaceChild("spine9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine9_rotation = spine9.addOrReplaceChild("spine9_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition spine10 = bone.addOrReplaceChild("spine10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine10_rotation = spine10.addOrReplaceChild("spine10_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -21.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition spine11 = bone.addOrReplaceChild("spine11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine11_rotation = spine11.addOrReplaceChild("spine11_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -3.0F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition spine12 = bone.addOrReplaceChild("spine12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine12_rotation = spine12.addOrReplaceChild("spine12_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 27.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.3562F));
		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}