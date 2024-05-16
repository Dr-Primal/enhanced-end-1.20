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

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EEBlocks.KIMBERLITE)
                .add(EEBlocks.KIMBERLITE_STAIRS)
                .add(EEBlocks.KIMBERLITE_SLAB)
                .add(EEBlocks.KIMBERLITE_BUTTON)
                .add(EEBlocks.KIMBERLITE_PRESSURE_PLATE)
                .add(EEBlocks.POLISHED_KIMBERLITE)
                .add(EEBlocks.POLISHED_KIMBERLITE_STAIRS)
                .add(EEBlocks.POLISHED_KIMBERLITE_SLAB)
                .add(EEBlocks.POLISHED_KIMBERLITE_WALL)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICKS)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL)
                .add(EEBlocks.POLISHED_KIMBERLITE_PILLAR)
                .add(EEBlocks.LARISTONE)
                .add(EEBlocks.LARISTONE_STAIRS)
                .add(EEBlocks.LARISTONE_SLAB)
                .add(EEBlocks.LARISTONE_WALL)
                .add(EEBlocks.LARISTONE_BUTTON)
                .add(EEBlocks.LARISTONE_PRESSURE_PLATE)
                .add(EEBlocks.LARISTONE_BRICKS)
                .add(EEBlocks.LARISTONE_BRICK_STAIRS)
                .add(EEBlocks.LARISTONE_BRICK_SLAB)
                .add(EEBlocks.LARISTONE_BRICK_WALL)
                .add(EEBlocks.SILTSTONE)
                .add(EEBlocks.SILTSTONE_STAIRS)
                .add(EEBlocks.SILTSTONE_SLAB)
                .add(EEBlocks.SILTSTONE_BUTTON)
                .add(EEBlocks.SILTSTONE_PRESSURE_PLATE)
                .add(EEBlocks.COBBLED_SILTSTONE)
                .add(EEBlocks.COBBLED_SILTSTONE_STAIRS)
                .add(EEBlocks.COBBLED_SILTSTONE_SLAB)
                .add(EEBlocks.COBBLED_SILTSTONE_WALL)
                .add(EEBlocks.SILTSTONE_BRICKS)
                .add(EEBlocks.SILTSTONE_BRICK_STAIRS)
                .add(EEBlocks.SILTSTONE_BRICK_SLAB)
                .add(EEBlocks.SILTSTONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(EEBlocks.KIMBERLITE_STAIRS)
                .add(EEBlocks.POLISHED_KIMBERLITE_STAIRS)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS)
                .add(EEBlocks.LARISTONE_STAIRS)
                .add(EEBlocks.LARISTONE_BRICK_STAIRS)
                .add(EEBlocks.SILTSTONE_STAIRS)
                .add(EEBlocks.COBBLED_SILTSTONE_STAIRS)
                .add(EEBlocks.SILTSTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(EEBlocks.KIMBERLITE_SLAB)
                .add(EEBlocks.POLISHED_KIMBERLITE_SLAB)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB)
                .add(EEBlocks.LARISTONE_SLAB)
                .add(EEBlocks.LARISTONE_BRICK_SLAB)
                .add(EEBlocks.SILTSTONE_SLAB)
                .add(EEBlocks.COBBLED_SILTSTONE_SLAB)
                .add(EEBlocks.SILTSTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EEBlocks.POLISHED_KIMBERLITE_WALL)
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL)
                .add(EEBlocks.LARISTONE_WALL)
                .add(EEBlocks.LARISTONE_BRICK_WALL)
                .add(EEBlocks.COBBLED_SILTSTONE_WALL)
                .add(EEBlocks.SILTSTONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(EEBlocks.KIMBERLITE_BUTTON)
                .add(EEBlocks.LARISTONE_BUTTON)
                .add(EEBlocks.SILTSTONE_BUTTON);

        getOrCreateTagBuilder(BlockTags.STONE_PRESSURE_PLATES)
                .add(EEBlocks.KIMBERLITE_PRESSURE_PLATE)
                .add(EEBlocks.LARISTONE_PRESSURE_PLATE)
                .add(EEBlocks.SILTSTONE_PRESSURE_PLATE);
    }
}
