package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.primal.enhanced_end.block.EEBlocks;

import java.util.concurrent.CompletableFuture;

public class EEBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public EEBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(EEBlocks.MIDNIGHT_STEM)
                .add(EEBlocks.MIDNIGHT_HYPHAE)
                .add(EEBlocks.STRIPPED_MIDNIGHT_STEM)
                .add(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE)
                .add(EEBlocks.MIDNIGHT_PLANKS)
                .add(EEBlocks.MIDNIGHT_STAIRS)
                .add(EEBlocks.MIDNIGHT_SLAB)
                .add(EEBlocks.MIDNIGHT_BUTTON)
                .add(EEBlocks.MIDNIGHT_PRESSURE_PLATE)
                .add(EEBlocks.MIDNIGHT_FENCE)
                .add(EEBlocks.MIDNIGHT_FENCE_GATE)
                .add(EEBlocks.MIDNIGHT_DOOR)
                .add(EEBlocks.MIDNIGHT_TRAPDOOR)
                .add(EEBlocks.WALL_MIDNIGHT_SIGN)
                .add(EEBlocks.STANDING_MIDNIGHT_SIGN)
                .add(EEBlocks.HANGING_MIDNIGHT_SIGN)
                .add(EEBlocks.WALL_HANGING_MIDNIGHT_SIGN)

                .add(EEBlocks.CORLITE_STEM)
                .add(EEBlocks.CORLITE_HYPHAE)
                .add(EEBlocks.STRIPPED_CORLITE_STEM)
                .add(EEBlocks.STRIPPED_CORLITE_HYPHAE)
                .add(EEBlocks.CORLITE_PLANKS)
                .add(EEBlocks.CORLITE_STAIRS)
                .add(EEBlocks.CORLITE_SLAB)
                .add(EEBlocks.CORLITE_BUTTON)
                .add(EEBlocks.CORLITE_PRESSURE_PLATE)
                .add(EEBlocks.CORLITE_FENCE)
                .add(EEBlocks.CORLITE_FENCE_GATE)
                .add(EEBlocks.CORLITE_DOOR)
                .add(EEBlocks.CORLITE_TRAPDOOR)
                .add(EEBlocks.WALL_CORLITE_SIGN)
                .add(EEBlocks.STANDING_CORLITE_SIGN)
                .add(EEBlocks.HANGING_CORLITE_SIGN)
                .add(EEBlocks.WALL_HANGING_CORLITE_SIGN);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(EEBlocks.MIDNIGHT_PLANKS)
                .add(EEBlocks.CORLITE_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(EEBlocks.MIDNIGHT_STAIRS)
                .add(EEBlocks.CORLITE_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(EEBlocks.MIDNIGHT_SLAB)
                .add(EEBlocks.CORLITE_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(EEBlocks.MIDNIGHT_FENCE)
                .add(EEBlocks.CORLITE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EEBlocks.MIDNIGHT_FENCE_GATE)
                .add(EEBlocks.CORLITE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(EEBlocks.MIDNIGHT_BUTTON)
                .add(EEBlocks.CORLITE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EEBlocks.MIDNIGHT_PRESSURE_PLATE)
                .add(EEBlocks.CORLITE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(EEBlocks.MIDNIGHT_DOOR)
                .add(EEBlocks.CORLITE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(EEBlocks.MIDNIGHT_TRAPDOOR)
                .add(EEBlocks.CORLITE_TRAPDOOR);
    }
}