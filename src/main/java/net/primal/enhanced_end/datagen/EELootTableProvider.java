package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.primal.enhanced_end.block.EEBlocks;

public class EELootTableProvider extends FabricBlockLootTableProvider {
    public EELootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(EEBlocks.MIDNIGHT_STEM);
        addDrop(EEBlocks.MIDNIGHT_HYPHAE);
        addDrop(EEBlocks.STRIPPED_MIDNIGHT_STEM);
        addDrop(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE);
        addDrop(EEBlocks.MIDNIGHT_PLANKS);
        addDrop(EEBlocks.MIDNIGHT_STAIRS);
        addDrop(EEBlocks.MIDNIGHT_BUTTON);
        addDrop(EEBlocks.MIDNIGHT_PRESSURE_PLATE);
        addDrop(EEBlocks.MIDNIGHT_FENCE);
        addDrop(EEBlocks.MIDNIGHT_FENCE_GATE);
        addDrop(EEBlocks.MIDNIGHT_TRAPDOOR);
        addDrop(EEBlocks.STANDING_MIDNIGHT_SIGN);
        addDrop(EEBlocks.WALL_MIDNIGHT_SIGN);
        addDrop(EEBlocks.HANGING_MIDNIGHT_SIGN);
        addDrop(EEBlocks.WALL_HANGING_MIDNIGHT_SIGN);
        addDrop(EEBlocks.MIDNIGHT_DOOR, doorDrops(EEBlocks.MIDNIGHT_DOOR));
        addDrop(EEBlocks.MIDNIGHT_SLAB, slabDrops(EEBlocks.MIDNIGHT_SLAB));

        addDrop(EEBlocks.CORLITE_STEM);
        addDrop(EEBlocks.CORLITE_HYPHAE);
        addDrop(EEBlocks.STRIPPED_CORLITE_STEM);
        addDrop(EEBlocks.STRIPPED_CORLITE_HYPHAE);
        addDrop(EEBlocks.CORLITE_PLANKS);
        addDrop(EEBlocks.CORLITE_STAIRS);
        addDrop(EEBlocks.CORLITE_BUTTON);
        addDrop(EEBlocks.CORLITE_PRESSURE_PLATE);
        addDrop(EEBlocks.CORLITE_FENCE);
        addDrop(EEBlocks.CORLITE_FENCE_GATE);
        addDrop(EEBlocks.CORLITE_TRAPDOOR);
        addDrop(EEBlocks.STANDING_CORLITE_SIGN);
        addDrop(EEBlocks.WALL_CORLITE_SIGN);
        addDrop(EEBlocks.HANGING_CORLITE_SIGN);
        addDrop(EEBlocks.WALL_HANGING_CORLITE_SIGN);
        addDrop(EEBlocks.CORLITE_DOOR, doorDrops(EEBlocks.CORLITE_DOOR));
        addDrop(EEBlocks.CORLITE_SLAB, slabDrops(EEBlocks.CORLITE_SLAB));

        addDrop(EEBlocks.KIMBERLITE);
        addDrop(EEBlocks.KIMBERLITE_STAIRS);
        addDrop(EEBlocks.KIMBERLITE_BUTTON);
        addDrop(EEBlocks.KIMBERLITE_PRESSURE_PLATE);
        addDrop(EEBlocks.POLISHED_KIMBERLITE);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_STAIRS);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_WALL);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_BRICKS);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL);
        addDrop(EEBlocks.POLISHED_KIMBERLITE_PILLAR);
        addDrop(EEBlocks.KIMBERLITE_SLAB, slabDrops(EEBlocks.KIMBERLITE_SLAB));
        addDrop(EEBlocks.POLISHED_KIMBERLITE_SLAB, slabDrops(EEBlocks.POLISHED_KIMBERLITE_SLAB));
        addDrop(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB, slabDrops(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB));

        addDrop(EEBlocks.LARISTONE);
        addDrop(EEBlocks.LARISTONE_STAIRS);
        addDrop(EEBlocks.LARISTONE_WALL);
        addDrop(EEBlocks.LARISTONE_BUTTON);
        addDrop(EEBlocks.LARISTONE_PRESSURE_PLATE);
        addDrop(EEBlocks.LARISTONE_BRICKS);
        addDrop(EEBlocks.LARISTONE_BRICK_STAIRS);
        addDrop(EEBlocks.LARISTONE_BRICK_WALL);
        addDrop(EEBlocks.LARISTONE_SLAB, slabDrops(EEBlocks.LARISTONE_SLAB));
        addDrop(EEBlocks.LARISTONE_BRICK_SLAB, slabDrops(EEBlocks.LARISTONE_BRICK_SLAB));
    }
}
