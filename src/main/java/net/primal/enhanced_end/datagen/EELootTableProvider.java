package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItems;

public class EELootTableProvider extends FabricBlockLootTableProvider {
    public EELootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public LootTable.Builder tanzaniteLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop,
                ((LeafEntry.Builder<?>) ItemEntry.builder(item)
                        .apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider
                                        .create(2.0f, 3.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
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

        addDrop(EEBlocks.SILTSTONE, (Block block) -> this.drops(block, EEBlocks.COBBLED_SILTSTONE));
        addDrop(EEBlocks.SILTSTONE_STAIRS);
        addDrop(EEBlocks.SILTSTONE_BUTTON);
        addDrop(EEBlocks.SILTSTONE_PRESSURE_PLATE);
        addDrop(EEBlocks.COBBLED_SILTSTONE);
        addDrop(EEBlocks.COBBLED_SILTSTONE_STAIRS);
        addDrop(EEBlocks.COBBLED_SILTSTONE_WALL);
        addDrop(EEBlocks.SILTSTONE_BRICKS);
        addDrop(EEBlocks.SILTSTONE_BRICK_STAIRS);
        addDrop(EEBlocks.SILTSTONE_BRICK_WALL);
        addDrop(EEBlocks.SILTSTONE_SLAB, slabDrops(EEBlocks.SILTSTONE_SLAB));
        addDrop(EEBlocks.COBBLED_SILTSTONE_SLAB, slabDrops(EEBlocks.COBBLED_SILTSTONE_SLAB));
        addDrop(EEBlocks.SILTSTONE_BRICK_SLAB, slabDrops(EEBlocks.SILTSTONE_BRICK_SLAB));

        addDrop(EEBlocks.MIDNIGHT_NYLIUM, (Block block) -> this.drops(block, Blocks.END_STONE));
        addDrop(EEBlocks.CORLITE_NYLIUM, (Block block) -> this.drops(block, Blocks.END_STONE));
        addDrop(EEBlocks.ENDIUM_SOIL);

        addDrop(EEBlocks.MIDNIGHT_MUSHROOM_CAP, leavesDrops(EEBlocks.MIDNIGHT_MUSHROOM_CAP, EEBlocks.MIDNIGHT_PLANKS, 0.0025f));
        addDrop(EEBlocks.CORLITE_MUSHROOM_CAP, leavesDrops(EEBlocks.CORLITE_MUSHROOM_CAP, EEBlocks.CORLITE_PLANKS, 0.0025f));//Change to Corlite Mushroom TODO;
        addDrop(EEBlocks.ENDIUM_MUSHROOM_CAP, leavesDrops(EEBlocks.ENDIUM_MUSHROOM_CAP, EEBlocks.ENDIUM_SOIL, 0.0025f));//Change to Corlite Mushroom TODO;

        addDrop(EEBlocks.END_TANZANITE_ORE, tanzaniteLikeOreDrops(EEBlocks.END_TANZANITE_ORE, EEItems.RAW_TANZANITE));
        addDrop(EEBlocks.END_CLITANIUM_ORE, oreDrops(EEBlocks.END_CLITANIUM_ORE, EEItems.CLITANIUM));

        addDrop(EEBlocks.RAW_TANZANITE_BLOCK);
        addDrop(EEBlocks.TANZANITE_BLOCK);
        addDrop(EEBlocks.CLITANIUM_BLOCK);
        addDrop(EEBlocks.ENDIMINTIUM_BLOCK);

        addDrop(EEBlocks.REINFORCED_OBSIDIAN);
    }
}
