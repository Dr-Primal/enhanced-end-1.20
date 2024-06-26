package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.util.EETags;

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
                .add(EEBlocks.SILTSTONE_BRICK_WALL)
                .add(EEBlocks.MIDNIGHT_NYLIUM)
                .add(EEBlocks.CORLITE_NYLIUM)
                .add(EEBlocks.END_TANZANITE_ORE)
                .add(EEBlocks.END_CLITANIUM_ORE)
                .add(EEBlocks.RAW_TANZANITE_BLOCK)
                .add(EEBlocks.TANZANITE_BLOCK)
                .add(EEBlocks.CLITANIUM_BLOCK)
                .add(EEBlocks.ENDIMINTIUM_BLOCK)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.SNAPS_GOAT_HORN)
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
                .add(EEBlocks.SILTSTONE_BRICK_WALL)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(EEBlocks.CLITANIUM_BLOCK)
                .add(EEBlocks.ENDIMINTIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_END)
                .add(Blocks.OBSIDIAN)
                .add(Blocks.BEDROCK)
                .add(Blocks.END_STONE)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .add(EEBlocks.REINFORCED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(EEBlocks.ENDIMINTIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(EEBlocks.MIDNIGHT_MUSHROOM_CAP)
                .add(EEBlocks.CORLITE_MUSHROOM_CAP)
                .add(EEBlocks.ENDIUM_MUSHROOM_CAP);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(EEBlocks.ENDIUM_SOIL);

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

        getOrCreateTagBuilder(BlockTags.NYLIUM)
                .add(EEBlocks.MIDNIGHT_NYLIUM)
                .add(EEBlocks.CORLITE_NYLIUM);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(EEBlocks.MIDNIGHT_MUSHROOM_CAP)
                .add(EEBlocks.CORLITE_MUSHROOM_CAP);

        getOrCreateTagBuilder(BlockTags.SMELTS_TO_GLASS)
                .add(EEBlocks.ENDIUM_SOIL);

        getOrCreateTagBuilder(EETags.Blocks.DRAGON_FIRE_BASE_BLOCKS)
                .add(Blocks.END_STONE)
                .add(Blocks.END_STONE_BRICKS)
                .add(Blocks.END_STONE_BRICK_SLAB)
                .add(Blocks.END_STONE_BRICK_STAIRS)
                .add(Blocks.END_STONE_BRICK_WALL)
                .add(Blocks.BEDROCK);

        getOrCreateTagBuilder(BlockTags.FIRE)
                .add(EEBlocks.DRAGON_FIRE);
    }
}
