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
public class Modeldragon_armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modeldragon_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart LeftPlate;
	public final ModelPart RightPlate;
	public final ModelPart LeftLegging;
	public final ModelPart RightLegging;
	public final ModelPart LeftBoot;
	public final ModelPart RightBoot;

	public Modeldragon_armor(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.RightPlate = root.getChild("RightPlate");
		this.LeftLegging = root.getChild("LeftLegging");
		this.RightLegging = root.getChild("RightLegging");
		this.LeftBoot = root.getChild("LeftBoot");
		this.RightBoot = root.getChild("RightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition CenterFrontSpike_r1 = Helmet.addOrReplaceChild("CenterFrontSpike_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.25F, -1.8F, 0.0F, -1.5708F, 0.0F));
		PartDefinition CenterBackSpike_r1 = Helmet.addOrReplaceChild("CenterBackSpike_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.25F, 3.2F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftHeadSpike_r1 = Helmet.addOrReplaceChild("LeftHeadSpike_r1", CubeListBuilder.create().texOffs(43, 52).addBox(-3.5F, -3.5F, 0.0F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, -8.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightHeadSpike_r1 = Helmet.addOrReplaceChild("RightHeadSpike_r1", CubeListBuilder.create().texOffs(43, 52).mirror().addBox(-3.5F, -3.5F, 0.0F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.2F, -8.5F, 0.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(16, 38).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftSpikeEight_r1 = LeftPlate.addOrReplaceChild("LeftSpikeEight_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 3.2F, 1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftSpikeSix_r1 = LeftPlate.addOrReplaceChild("LeftSpikeSix_r1", CubeListBuilder.create().texOffs(47, 37).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.2F, 3.2F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftSpikeFive_r1 = LeftPlate.addOrReplaceChild("LeftSpikeFive_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.2F, 5.2F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftSpikeFour_r1 = LeftPlate.addOrReplaceChild("LeftSpikeFour_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -3.2F, 3.0F, 0.0F, 2.3998F, 0.0F));
		PartDefinition LeftSpikeThree_r1 = LeftPlate.addOrReplaceChild("LeftSpikeThree_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.2F, -4.175F, 0.0F, -1.5752F, 0.0F));
		PartDefinition LeftSpikeTwo_r1 = LeftPlate.addOrReplaceChild("LeftSpikeTwo_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -2.2F, -3.075F, 0.0F, -2.3562F, 0.0F));
		PartDefinition LeftSpikeOne_r1 = LeftPlate.addOrReplaceChild("LeftSpikeOne_r1", CubeListBuilder.create().texOffs(48, 40).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, -2.2F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightSpikeEight_r1 = RightPlate.addOrReplaceChild("RightSpikeEight_r1", CubeListBuilder.create().texOffs(47, 37).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.2F, 3.2F, 0.0F, 1.5708F, 0.0F));
		PartDefinition RightSpikeSeven_r1 = RightPlate.addOrReplaceChild("RightSpikeSeven_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.2F, 3.2F, 1.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition RightSpikeFive_r1 = RightPlate.addOrReplaceChild("RightSpikeFive_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -3.2F, 3.2F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightSpikeFour_r1 = RightPlate.addOrReplaceChild("RightSpikeFour_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1F, -3.2F, 3.0F, 0.0F, -2.3998F, 0.0F));
		PartDefinition RightSpikeThree_r1 = RightPlate.addOrReplaceChild("RightSpikeThree_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -0.2F, -4.175F, 0.0F, 1.5752F, 0.0F));
		PartDefinition RightSpikeTwo_r1 = RightPlate.addOrReplaceChild("RightSpikeTwo_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1F, -2.2F, -3.075F, 0.0F, 2.3562F, 0.0F));
		PartDefinition RightSpikeOne_r1 = RightPlate.addOrReplaceChild("RightSpikeOne_r1", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2F, -2.2F, 0.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}