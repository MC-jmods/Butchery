package net.mcreator.butchery.procedures;

import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

public class SulfuroregenerationconditionProcedure {
	public static boolean execute() {
		if (ButcheryconfigConfiguration.SULFUR_ORE.get() == true) {
			return true;
		}
		return false;
	}
}