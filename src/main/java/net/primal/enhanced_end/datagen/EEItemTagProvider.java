package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.util.EETags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EEItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public EEItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(EEBlocks.MIDNIGHT_PLANKS.asItem())
                .add(EEBlocks.CORLITE_PLANKS.asItem());


        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(EEBlocks.MIDNIGHT_SLAB.asItem())
                .add(EEBlocks.CORLITE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(EEBlocks.MIDNIGHT_STAIRS.asItem())
                .add(EEBlocks.CORLITE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(EEBlocks.MIDNIGHT_FENCE.asItem())
                .add(EEBlocks.CORLITE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(EEBlocks.MIDNIGHT_FENCE_GATE.asItem())
                .add(EEBlocks.CORLITE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(EEBlocks.MIDNIGHT_BUTTON.asItem())
                .add(EEBlocks.CORLITE_BUTTON.asItem());


        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(EEBlocks.MIDNIGHT_PRESSURE_PLATE.asItem())
                .add(EEBlocks.CORLITE_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(EEBlocks.MIDNIGHT_DOOR.asItem())
                .add(EEBlocks.CORLITE_DOOR.asItem());


        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(EEBlocks.MIDNIGHT_TRAPDOOR.asItem())
                .add(EEBlocks.CORLITE_TRAPDOOR.asItem());


        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(EEBlocks.STANDING_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.WALL_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.STANDING_CORLITE_SIGN.asItem())
                .add(EEBlocks.WALL_CORLITE_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(EEBlocks.HANGING_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.HANGING_CORLITE_SIGN.asItem());

        getOrCreateTagBuilder(EETags.Items.MIDNIGHT_STEMS)
                .add(EEBlocks.MIDNIGHT_STEM.asItem())
                .add(EEBlocks.MIDNIGHT_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE.asItem());

        getOrCreateTagBuilder(EETags.Items.CORLITE_STEMS)
                .add(EEBlocks.CORLITE_STEM.asItem())
                .add(EEBlocks.CORLITE_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_STEM.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_HYPHAE.asItem());

        getOrCreateTagBuilder(ItemTags.COMPLETES_FIND_TREE_TUTORIAL)
                .add(EEBlocks.MIDNIGHT_STEM.asItem())
                .add(EEBlocks.MIDNIGHT_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE.asItem())
                .add(EEBlocks.CORLITE_STEM.asItem())
                .add(EEBlocks.CORLITE_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_STEM.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_HYPHAE.asItem());
    }
}
