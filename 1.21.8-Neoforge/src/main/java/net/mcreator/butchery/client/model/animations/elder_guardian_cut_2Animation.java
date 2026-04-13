package net.mcreator.butchery.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.12.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class elder_guardian_cut_2Animation {
	public static final AnimationDefinition eye_removed = AnimationDefinition.Builder.withLength(2.0F).looping()
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("eye", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone2", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -3.125F), AnimationChannel.Interpolations.LINEAR))).build();
}