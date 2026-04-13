package net.mcreator.butchery.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.butchery.init.ButcheryModItems;
import net.mcreator.butchery.init.ButcheryModFluids;
import net.mcreator.butchery.init.ButcheryModFluidTypes;
import net.mcreator.butchery.init.ButcheryModBlocks;

public abstract class InfectedBloodFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ButcheryModFluidTypes.INFECTED_BLOOD_TYPE.get(), () -> ButcheryModFluids.INFECTED_BLOOD.get(),
			() -> ButcheryModFluids.FLOWING_INFECTED_BLOOD.get()).explosionResistance(10f).bucket(() -> ButcheryModItems.INFECTED_BLOOD_BUCKET.get()).block(() -> (LiquidBlock) ButcheryModBlocks.INFECTED_BLOOD.get());

	private InfectedBloodFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends InfectedBloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends InfectedBloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}