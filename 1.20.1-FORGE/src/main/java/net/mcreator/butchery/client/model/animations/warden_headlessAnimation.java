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
public class warden_headlessAnimation {
	public static final AnimationDefinition headless = AnimationDefinition.Builder.withLength(0.0F)
			.addAnimation("bone2", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0.0F, KeyframeAnimations.scaleVec(-0.1F, 0.0F, 0.2F), AnimationChannel.Interpolations.LINEAR))).build();
}