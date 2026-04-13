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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelravager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelravager"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart horns;
	public final ModelPart left_horn;
	public final ModelPart jaw;
	public final ModelPart body;
	public final ModelPart rotation;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart neck;

	public Modelravager(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.horns = this.head.getChild("horns");
		this.left_horn = this.horns.getChild("left_horn");
		this.jaw = this.head.getChild("jaw");
		this.body = this.bone.getChild("body");
		this.rotation = this.body.getChild("rotation");
		this.leg1 = this.bone.getChild("leg1");
		this.leg2 = this.bone.getChild("leg2");
		this.leg3 = this.bone.getChild("leg3");
		this.leg4 = this.bone.getChild("leg4");
		this.neck = this.bone.getChild("neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4732F, 14.8716F, 0.0541F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.3333F, -12.6667F, -3.6667F, 16.0F, 20.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.3333F, 1.3333F, -7.6667F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5935F, 0.7951F, -16.8874F));
		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create().texOffs(74, 55).addBox(-5.0F, -14.5F, -0.134F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3333F, -4.6667F, 1.3333F, 1.0472F, 0.0F, 0.0F));
		PartDefinition left_horn = horns.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(8.0F, -41.5F, -19.134F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 27.0F, 19.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 36).addBox(-8.0F, -2.5F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6667F, 7.8333F, 4.3333F));
		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0732F, 0.1284F, 6.9459F));
		PartDefinition rotation = body.addOrReplaceChild("rotation",
				CubeListBuilder.create().texOffs(0, 55).addBox(-7.0F, -10.0F, -9.0F, 14.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 91).addBox(-6.0F, 6.0F, -9.0F, 12.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition leg1 = bone.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-10.4929F, -0.9479F, 15.8525F));
		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, -8.5F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.566F, -4.4237F, 8.5934F, -1.0744F, 0.2136F, 0.1525F));
		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(11.3809F, -1.1261F, 15.3605F));
		PartDefinition leg2_r1 = leg2.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-4.0F, -7.5F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3078F, -5.2454F, 9.0854F, -1.0264F, -0.2635F, -0.1564F));
		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(-10.2466F, -2.3131F, -5.9078F));
		PartDefinition leg3_r1 = leg3.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-12.0F, -9.5F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.3198F, -2.0585F, 5.8537F, -0.9093F, 0.147F, 0.3563F));
		PartDefinition leg4 = bone.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(10.7326F, -2.2932F, -5.2557F));
		PartDefinition leg4_r1 = leg4.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(4.0F, -9.5F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.6594F, -2.0783F, 5.2016F, -0.8171F, -0.1603F, -0.4105F));
		PartDefinition neck = bone.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(68, 73).addBox(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0732F, -2.8716F, 2.4459F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}