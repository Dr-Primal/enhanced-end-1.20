package net.primal.enhanced_end;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.primal.enhanced_end.datagen.*;

import java.util.concurrent.CompletableFuture;

public class EnhancedEndDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EEBlockTagProvider::new);
		pack.addProvider(EEItemTagProvider::new);
		pack.addProvider(EELootTableProvider::new);
		pack.addProvider(EEModelProvider::new);
		pack.addProvider(EERecipeProvider::new);
	}
}
