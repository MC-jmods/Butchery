package net.mcreator.butchery.procedures;

import net.mcreator.butchery.configuration.ButcheryconfigConfiguration;

public class SaltdiscgenerationconditionProcedure {
	public static boolean execute() {
		if (ButcheryconfigConfiguration.SALT_GENERATION.get() == true) {
			return true;
		}
		return false;
	}
}