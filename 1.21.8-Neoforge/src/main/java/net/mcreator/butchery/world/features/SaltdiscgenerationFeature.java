package net.mcreator.butchery.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DiskFeature;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.butchery.procedures.SaltdiscgenerationconditionProcedure;

public class SaltdiscgenerationFeature extends DiskFeature {
	public SaltdiscgenerationFeature() {
		super(DiskConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<DiskConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SaltdiscgenerationconditionProcedure.execute())
			return false;
		return super.place(context);
	}
}