package net.primal.enhanced_end;

import net.fabricmc.api.ModInitializer;

import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItemGroups;
import net.primal.enhanced_end.item.EEItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancedEnd implements ModInitializer {
	public static final String MOD_ID = "enhanced_end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EEItems.registerEEItems();
		EEBlocks.registerEEBlocks();
		EEItemGroups.registerItemGroups();
		//EERegistries.eeRegistry();
		//EEFluids.register();
		//EEWorldGen.generateWorldGen();
		//EEConfiguredFeatures.registerConfiguredFeatures();
		//EEEnchantments.registerEEEnchantments();
		//EELootTableModifier.modifyLootTables();

		LOGGER.info("Initializing Enhanced End!");
	}
}