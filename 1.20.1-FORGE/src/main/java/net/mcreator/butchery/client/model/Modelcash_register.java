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
public class Modelcash_register<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("butchery", "modelcash_register"), "main");
	public final ModelPart bb_main;
	public final ModelPart bone12;
	public final ModelPart bone11;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone5;
	public final ModelPart bone3;
	public final ModelPart bone13;
	public final ModelPart bone4;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone10;

	public Modelcash_register(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
		this.bone12 = root.getChild("bone12");
		this.bone11 = root.getChild("bone11");
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone5 = this.bone2.getChild("bone5");
		this.bone3 = this.bone.getChild("bone3");
		this.bone13 = this.bone3.getChild("bone13");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone6 = this.bone.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone6.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bb_main_r1 = bb_main.addOrReplaceChild("bb_main_r1",
				CubeListBuilder.create().texOffs(1, 35).addBox(-6.0F, -5.0F, -4.7503F, 12.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 30).addBox(-4.0F, -4.0F, -3.7502F, 8.0F, 3.0F, 0.001F, new CubeDeformation(0.0F)).texOffs(1, 28)
						.addBox(-5.0F, -4.0F, -4.7503F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 28).addBox(4.0F, -4.0F, -4.7503F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-6.0F, -1.0F, -4.7503F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-6.0F, 1.0F, -4.7503F, 12.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 15)
						.addBox(-6.5F, 2.999F, 2.2498F, 13.0F, 0.001F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 3.0F, -4.7503F, 12.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.2502F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.5F, 23.5F, -0.3F));
		PartDefinition bone12_r1 = bone12.addOrReplaceChild("bone12_r1", CubeListBuilder.create().texOffs(0, 40).addBox(-5.5F, 3.5F, -1.0503F, 11.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -5.5F, 0.5502F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(1.5F, 18.0F, -2.5F));
		PartDefinition bone11_r1 = bone11.addOrReplaceChild("bone11_r1", CubeListBuilder.create().texOffs(3, 5).addBox(1.0F, -1.0F, -2.2502F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 2.7502F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 20.0F, 4.0F));
		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(1.999F, 1.0F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(1.999F, 2.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(3, 2).addBox(-1.001F, 1.5F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(3.999F, 1.0F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(3.999F, 2.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(3, 2).addBox(-1.001F, 3.5F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone5 = bone2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition bone5_r1 = bone5.addOrReplaceChild("bone5_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(-4.001F, 1.0F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(-4.001F, 2.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone5_r2 = bone5.addOrReplaceChild("bone5_r2", CubeListBuilder.create().texOffs(3, 2).addBox(-1.001F, -4.5F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 0.0F));
		PartDefinition bone13 = bone3.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, -2.0F));
		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1",
				CubeListBuilder.create().texOffs(4, 1).addBox(-2.001F, 2.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 1).addBox(-2.001F, 1.0F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -3.0F, -1.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone13_r2 = bone13.addOrReplaceChild("bone13_r2", CubeListBuilder.create().texOffs(3, 2).addBox(-1.001F, -2.5F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -3.0F, -1.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(-0.001F, 1.0F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(-0.001F, 2.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone4_r2 = bone4.addOrReplaceChild("bone4_r2", CubeListBuilder.create().texOffs(3, 2).addBox(-1.001F, -0.5F, 3.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -3.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -1.0F));
		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(1.999F, -1.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(1.999F, 0.0F, 1.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.999F, 1.5F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition bone7_r1 = bone7.addOrReplaceChild("bone7_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(3.999F, -1.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(3.999F, 0.0F, 1.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone7_r2 = bone7.addOrReplaceChild("bone7_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.999F, 3.5F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(-4.001F, -1.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(-4.001F, 0.0F, 1.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone8_r2 = bone8.addOrReplaceChild("bone8_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.999F, -4.5F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 0.0F));
		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(-2.001F, -1.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(-2.001F, 0.0F, 1.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone9_r2 = bone9.addOrReplaceChild("bone9_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.999F, -2.5F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, -1.5708F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition bone10_r1 = bone10.addOrReplaceChild("bone10_r1",
				CubeListBuilder.create().texOffs(3, 1).addBox(-0.001F, -1.0F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(-0.001F, 0.0F, 1.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bone10_r2 = bone10.addOrReplaceChild("bone10_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.999F, -0.5F, 2.2498F, 0.001F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -2.7498F, -3.1416F, 0.0F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}