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
public class Modelshell_boat extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelshell_boat"), "main");
	public final ModelPart group;
	public final ModelPart group2;
	public final ModelPart leg4;
	public final ModelPart leg3;
	public final ModelPart leg2;
	public final ModelPart leg1;
	public final ModelPart body2;
	public final ModelPart body2_rotation;
	public final ModelPart body;
	public final ModelPart body_rotation;
	public final ModelPart group3;
	public final ModelPart shell;
	public final ModelPart head;
	public final ModelPart bb_main;

	public Modelshell_boat(ModelPart root) {
		super(root);
		this.group = root.getChild("group");
		this.group2 = this.group.getChild("group2");
		this.leg4 = this.group2.getChild("leg4");
		this.leg3 = this.group2.getChild("leg3");
		this.leg2 = this.group2.getChild("leg2");
		this.leg1 = this.group2.getChild("leg1");
		this.body2 = this.group2.getChild("body2");
		this.body2_rotation = this.body2.getChild("body2_rotation");
		this.body = this.group2.getChild("body");
		this.body_rotation = this.body.getChild("body_rotation");
		this.group3 = this.body_rotation.getChild("group3");
		this.shell = this.body_rotation.getChild("shell");
		this.head = this.group.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 13.2F, 0.4F, 1.5708F, 0.0F, 0.0F));
		PartDefinition group2 = group.addOrReplaceChild("group2", CubeListBuilder.create(), PartPose.offset(-8.0F, -8.0F, 8.0F));
		PartDefinition leg4 = group2.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(5.0F, 5.0F, -4.0F));
		PartDefinition leg3 = group2.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-5.0F, 5.0F, -4.0F));
		PartDefinition leg2 = group2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(3.5F, 6.0F, 11.0F));
		PartDefinition leg1 = group2.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-3.5F, 6.0F, 11.0F));
		PartDefinition body2 = group2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -10.0F));
		PartDefinition body2_rotation = body2.addOrReplaceChild("body2_rotation", CubeListBuilder.create().texOffs(64, 2).addBox(5.4507F, 0.6716F, -5.8998F, 9.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = group2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -10.0F));
		PartDefinition body_rotation = body.addOrReplaceChild("body_rotation",
				CubeListBuilder.create().texOffs(88, 0).addBox(0.4508F, 2.6716F, -2.8998F, 3.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(71, 23).addBox(0.4508F, 16.6716F, -2.8998F, 19.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 37)
						.addBox(0.4508F, -0.3284F, -2.8998F, 19.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 1).addBox(4.4507F, 0.6716F, -4.8998F, 11.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
						.addBox(3.4507F, 0.6716F, -2.8998F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 2).addBox(15.4507F, 0.6716F, -2.8998F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_rotation_r1 = body_rotation.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(110, 0).addBox(-1.5F, -7.0F, -3.0F, 3.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.9507F, 9.6716F, 0.1002F, 0.0F, 0.0F, -3.1416F));
		PartDefinition group3 = body_rotation.addOrReplaceChild("group3", CubeListBuilder.create(), PartPose.offset(-1.5169F, 8.4216F, 10.8671F));
		PartDefinition shell = body_rotation.addOrReplaceChild("shell", CubeListBuilder.create(), PartPose.offset(-1.5169F, 8.4216F, 10.8671F));
		PartDefinition head = group.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-8.0F, -5.0F, -2.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_rotation_r2 = bb_main.addOrReplaceChild("body_rotation_r2", CubeListBuilder.create().texOffs(64, 32).addBox(-6.5F, -1.0F, -7.5F, 14.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4492F, -8.0784F, -3.4748F, 0.0F, 3.1416F, 0.0F));
		PartDefinition body_rotation_r3 = bb_main.addOrReplaceChild("body_rotation_r3", CubeListBuilder.create().texOffs(60, 48).addBox(-6.75F, -1.5F, -6.5F, 17.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3492F, -6.5784F, -1.5748F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}