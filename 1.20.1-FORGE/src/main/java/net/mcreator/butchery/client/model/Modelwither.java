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
public class Modelwither<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelwither"), "main");
	public final ModelPart bone;
	public final ModelPart head1;
	public final ModelPart head2;
	public final ModelPart head3;
	public final ModelPart body1;
	public final ModelPart body2;
	public final ModelPart body3;

	public Modelwither(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head1 = this.bone.getChild("head1");
		this.head2 = this.bone.getChild("head2");
		this.head3 = this.bone.getChild("head3");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.bone.getChild("body2");
		this.body3 = this.bone.getChild("body3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(26.0F, 20.0F, -1.5F, 0.0F, 1.5708F, -1.4835F));
		PartDefinition head1 = bone.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition head2 = bone.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(-18.0F, -42.0F, -2.0F));
		PartDefinition head2_r1 = head2.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition head3 = bone.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(18.0F, -42.0F, -2.0F));
		PartDefinition head3_r1 = head3.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(64, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 32).addBox(-20.0F, -2.6514F, -6.9848F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -37.2F, 2.0F));
		PartDefinition body2 = bone.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(0, 44).addBox(-3.0F, -9.6514F, -6.9848F, 6.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 44).addBox(-11.0F, 3.3486F, -5.9848F, 22.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -24.2F, 2.0F));
		PartDefinition body2_r1 = body2.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(48, 44).addBox(-11.0F, -2.0F, -2.0F, 22.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3486F, -3.9848F, 0.0F, -0.0873F, 0.0F));
		PartDefinition body2_r2 = body2.addOrReplaceChild("body2_r2", CubeListBuilder.create().texOffs(48, 44).addBox(-11.0F, -2.0F, -2.0F, 22.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6514F, -3.9848F, 0.0F, 0.0873F, 0.0F));
		PartDefinition body3 = bone.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(24, 44).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.8514F, -1.9848F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}