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
public class Modelender_dragon_cut_2 extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelender_dragon_cut_2"), "main");
	public final ModelPart bone;
	public final ModelPart body;
	public final ModelPart tail1;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart tail4;
	public final ModelPart tail5;
	public final ModelPart tail6;
	public final ModelPart tail7;
	public final ModelPart tail8;
	public final ModelPart tail9;
	public final ModelPart tail10;
	public final ModelPart tail11;
	public final ModelPart tail12;
	public final ModelPart back_left_leg;
	public final ModelPart back_left_shin;
	public final ModelPart back_left_foot;
	public final ModelPart back_right_leg;
	public final ModelPart back_right_shin;
	public final ModelPart back_right_foot;
	public final ModelPart front_left_leg;
	public final ModelPart front_left_shin;
	public final ModelPart front_left_foot;
	public final ModelPart front_right_leg;
	public final ModelPart front_right_shin;
	public final ModelPart front_right_foot;
	public final ModelPart left_wing;
	public final ModelPart left_wing_tip;
	public final ModelPart right_wing;
	public final ModelPart right_wing_tip;
	public final ModelPart neck1;
	public final ModelPart neck2;
	public final ModelPart neck3;
	public final ModelPart neck4;
	public final ModelPart neck5;

	public Modelender_dragon_cut_2(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.tail1 = this.body.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_left_shin = this.back_left_leg.getChild("back_left_shin");
		this.back_left_foot = this.back_left_shin.getChild("back_left_foot");
		this.back_right_leg = this.body.getChild("back_right_leg");
		this.back_right_shin = this.back_right_leg.getChild("back_right_shin");
		this.back_right_foot = this.back_right_shin.getChild("back_right_foot");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_left_shin = this.front_left_leg.getChild("front_left_shin");
		this.front_left_foot = this.front_left_shin.getChild("front_left_foot");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.front_right_shin = this.front_right_leg.getChild("front_right_shin");
		this.front_right_foot = this.front_right_shin.getChild("front_right_foot");
		this.left_wing = this.body.getChild("left_wing");
		this.left_wing_tip = this.left_wing.getChild("left_wing_tip");
		this.right_wing = this.body.getChild("right_wing");
		this.right_wing_tip = this.right_wing.getChild("right_wing_tip");
		this.neck1 = this.body.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body = bone
				.addOrReplaceChild(
						"body", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(220, 53).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
								.texOffs(220, 53).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(220, 53).addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -24.0F, -16.0F));
		PartDefinition tail1 = body.addOrReplaceChild("tail1",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 52.0F, -3.0107F, 0.0F, 3.1416F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 3.0543F, 0.0F, 3.1416F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition tail4 = tail3.addOrReplaceChild("tail4",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition tail5 = tail4.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition tail6 = tail5.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -2.9671F, 0.0F, 3.1416F));
		PartDefinition tail7 = tail6.addOrReplaceChild("tail7",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 3.054F, -0.0869F, -3.134F));
		PartDefinition tail8 = tail7.addOrReplaceChild("tail8",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -2.9671F, 0.0F));
		PartDefinition tail9 = tail8.addOrReplaceChild("tail9",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.0F, -2.8798F, 0.0F));
		PartDefinition tail10 = tail9.addOrReplaceChild("tail10",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -2.8798F, 0.0F));
		PartDefinition tail11 = tail10.addOrReplaceChild("tail11",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.0F, -2.8798F, 0.0F));
		PartDefinition tail12 = tail11.addOrReplaceChild("tail12",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -2.9234F, 0.0F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 16.0F, 34.0F, 1.5708F, 0.1309F, 0.0F));
		PartDefinition back_left_shin = back_left_leg.addOrReplaceChild("back_left_shin", CubeListBuilder.create().texOffs(196, 0).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.0F, -6.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition back_left_foot = back_left_shin.addOrReplaceChild("back_left_foot", CubeListBuilder.create().texOffs(112, 0).addBox(-9.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.0F, -1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, 16.0F, 34.0F, 1.5708F, -0.1745F, 0.0F));
		PartDefinition back_right_shin = back_right_leg.addOrReplaceChild("back_right_shin", CubeListBuilder.create().texOffs(196, 0).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.0F, -6.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition back_right_foot = back_right_shin.addOrReplaceChild("back_right_foot", CubeListBuilder.create().texOffs(112, 0).addBox(-9.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.0F, -1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(112, 104).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 20.0F, -6.0F, -1.5708F, -0.2182F, 0.0F));
		PartDefinition front_left_shin = front_left_leg.addOrReplaceChild("front_left_shin", CubeListBuilder.create().texOffs(226, 138).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 0.0F, -0.0873F, 0.0F, 0.1309F));
		PartDefinition front_left_foot = front_left_shin.addOrReplaceChild("front_left_foot", CubeListBuilder.create().texOffs(144, 104).addBox(-3.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 23.0F, 0.0F, 1.6581F, 0.0F, 0.0F));
		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(112, 104).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 20.0F, -6.0F, -1.5708F, 0.1745F, 0.0F));
		PartDefinition front_right_shin = front_right_leg.addOrReplaceChild("front_right_shin", CubeListBuilder.create().texOffs(226, 138).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition front_right_foot = front_right_shin.addOrReplaceChild("front_right_foot", CubeListBuilder.create().texOffs(144, 104).addBox(-4.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.6581F, 0.0F, 0.0F));
		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(0.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-56, 88).mirror()
				.addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.0F, 1.0F, -6.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition left_wing_tip = left_wing.addOrReplaceChild("left_wing_tip", CubeListBuilder.create().texOffs(112, 136).mirror().addBox(0.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-56, 144).mirror()
				.addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(56.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition right_wing = body.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(-56, 88).addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 88).addBox(-56.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 1.0F, -6.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition right_wing_tip = right_wing.addOrReplaceChild("right_wing_tip",
				CubeListBuilder.create().texOffs(-56, 144).addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 136).addBox(-56.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-56.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition neck1 = body.addOrReplaceChild("neck1",
				CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -20.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, -0.1745F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}