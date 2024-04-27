package net.primal.enhanced_end;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancedEnd implements ModInitializer {
	public static final String MOD_ID = "enhanced_end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing Enhanced End!");
	}
}