package net.primal.enhanced_end.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;
import net.primal.enhanced_end.block.EEBlocks;

public class EEItemGroups {
        public static final ItemGroup OUTER_WORLD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(EnhancedEnd.MOD_ID, "enhanced_end_blocks"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enhanced_end_blocks"))
                        .icon(() -> new ItemStack(EEBlocks.MIDNIGHT_STEM)).entries((displayContext, entries) -> {
                            entries.add(EEBlocks.MIDNIGHT_STEM);
                            entries.add(EEBlocks.MIDNIGHT_HYPHAE);
                            entries.add(EEBlocks.STRIPPED_MIDNIGHT_STEM);
                            entries.add(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE);
                            entries.add(EEBlocks.MIDNIGHT_PLANKS);
                            entries.add(EEBlocks.MIDNIGHT_STAIRS);
                            entries.add(EEBlocks.MIDNIGHT_SLAB);
                            entries.add(EEBlocks.MIDNIGHT_BUTTON);
                            entries.add(EEBlocks.MIDNIGHT_PRESSURE_PLATE);
                            entries.add(EEBlocks.MIDNIGHT_FENCE);
                            entries.add(EEBlocks.MIDNIGHT_FENCE_GATE);
                            entries.add(EEBlocks.MIDNIGHT_DOOR);
                            entries.add(EEBlocks.MIDNIGHT_TRAPDOOR);
                            entries.add(EEItems.MIDNIGHT_SIGN);
                            entries.add(EEItems.HANGING_MIDNIGHT_SIGN);

                            entries.add(EEBlocks.CORLITE_STEM);
                            entries.add(EEBlocks.CORLITE_HYPHAE);
                            entries.add(EEBlocks.STRIPPED_CORLITE_STEM);
                            entries.add(EEBlocks.STRIPPED_CORLITE_HYPHAE);
                            entries.add(EEBlocks.CORLITE_PLANKS);
                            entries.add(EEBlocks.CORLITE_STAIRS);
                            entries.add(EEBlocks.CORLITE_SLAB);
                            entries.add(EEBlocks.CORLITE_BUTTON);
                            entries.add(EEBlocks.CORLITE_PRESSURE_PLATE);
                            entries.add(EEBlocks.CORLITE_FENCE);
                            entries.add(EEBlocks.CORLITE_FENCE_GATE);
                            entries.add(EEBlocks.CORLITE_DOOR);
                            entries.add(EEBlocks.CORLITE_TRAPDOOR);
                            entries.add(EEItems.CORLITE_SIGN);
                            entries.add(EEItems.HANGING_CORLITE_SIGN);

                            entries.add(EEBlocks.KIMBERLITE);
                            entries.add(EEBlocks.KIMBERLITE_STAIRS);
                            entries.add(EEBlocks.KIMBERLITE_SLAB);
                            entries.add(EEBlocks.KIMBERLITE_BUTTON);
                            entries.add(EEBlocks.KIMBERLITE_PRESSURE_PLATE);

                            entries.add(EEBlocks.POLISHED_KIMBERLITE);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_STAIRS);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_SLAB);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_WALL);

                            entries.add(EEBlocks.POLISHED_KIMBERLITE_BRICKS);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL);
                            entries.add(EEBlocks.POLISHED_KIMBERLITE_PILLAR);

                            entries.add(EEBlocks.LARISTONE);
                            entries.add(EEBlocks.LARISTONE_STAIRS);
                            entries.add(EEBlocks.LARISTONE_SLAB);
                            entries.add(EEBlocks.LARISTONE_WALL);
                            entries.add(EEBlocks.LARISTONE_BUTTON);
                            entries.add(EEBlocks.LARISTONE_PRESSURE_PLATE);

                            entries.add(EEBlocks.LARISTONE_BRICKS);
                            entries.add(EEBlocks.LARISTONE_BRICK_STAIRS);
                            entries.add(EEBlocks.LARISTONE_BRICK_SLAB);
                            entries.add(EEBlocks.LARISTONE_BRICK_WALL);
                        }).build());

        public static final ItemGroup OUTER_WORLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(EnhancedEnd.MOD_ID, "enhanced_end_items"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enhanced_end_items"))
                        .icon(() -> new ItemStack(EEItems.MIDNIGHT_SIGN)).entries((displayContext, entries) -> {
                        //entries.add();
                        }).build());


        public static void registerItemGroups() {
            EnhancedEnd.LOGGER.info("Registering Item Groups for " + EnhancedEnd.MOD_ID);
        }
    }
