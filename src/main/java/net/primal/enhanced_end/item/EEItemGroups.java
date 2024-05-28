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
                        .icon(() -> new ItemStack(EEBlocks.ENDIMINTIUM_BLOCK)).entries((displayContext, entries) -> {
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

                            entries.add(EEBlocks.SILTSTONE);
                            entries.add(EEBlocks.SILTSTONE_STAIRS);
                            entries.add(EEBlocks.SILTSTONE_SLAB);
                            entries.add(EEBlocks.SILTSTONE_BUTTON);
                            entries.add(EEBlocks.SILTSTONE_PRESSURE_PLATE);

                            entries.add(EEBlocks.COBBLED_SILTSTONE);
                            entries.add(EEBlocks.COBBLED_SILTSTONE_STAIRS);
                            entries.add(EEBlocks.COBBLED_SILTSTONE_SLAB);
                            entries.add(EEBlocks.COBBLED_SILTSTONE_WALL);

                            entries.add(EEBlocks.SILTSTONE_BRICKS);
                            entries.add(EEBlocks.SILTSTONE_BRICK_STAIRS);
                            entries.add(EEBlocks.SILTSTONE_BRICK_SLAB);
                            entries.add(EEBlocks.SILTSTONE_BRICK_WALL);

                            entries.add(EEBlocks.END_TANZANITE_ORE);
                            entries.add(EEBlocks.END_CLITANIUM_ORE);
                            entries.add(EEBlocks.TANZANITE_BLOCK);
                            entries.add(EEBlocks.CLITANIUM_BLOCK);
                            entries.add(EEBlocks.ENDIMINTIUM_BLOCK);

                            entries.add(EEBlocks.REINFORCED_OBSIDIAN);


                            entries.add(EEBlocks.MIDNIGHT_NYLIUM);
                            entries.add(EEBlocks.CORLITE_NYLIUM);
                            entries.add(EEBlocks.ENDIUM_SOIL);

                            entries.add(EEBlocks.MIDNIGHT_MUSHROOM_CAP);
                            entries.add(EEBlocks.CORLITE_MUSHROOM_CAP);
                            entries.add(EEBlocks.ENDIUM_MUSHROOM_CAP);

                        }).build());

        public static final ItemGroup OUTER_WORLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(EnhancedEnd.MOD_ID, "enhanced_end_items"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enhanced_end_items"))
                        .icon(() -> new ItemStack(EEItems.ENDIMINTIUM_INGOT)).entries((displayContext, entries) -> {
                            entries.add(EEItems.REINFORCED_OBSIDIAN_SHARD);
                            entries.add(EEItems.SHADOW_SHARD);
                            entries.add(EEItems.SENTRY_DISK);
                            entries.add(EEItems.ENHANCED_PEARL);
                            entries.add(EEItems.CLITANIUM);
                            entries.add(EEItems.CLITANIUM_SWORD);
                            entries.add(EEItems.CLITANIUM_PICKAXE);
                            entries.add(EEItems.CLITANIUM_AXE);
                            entries.add(EEItems.CLITANIUM_SHOVEL);
                            entries.add(EEItems.CLITANIUM_HOE);
                            entries.add(EEItems.CLITANIUM_HELMET);
                            entries.add(EEItems.CLITANIUM_CHESTPLATE);
                            entries.add(EEItems.CLITANIUM_LEGGINGS);
                            entries.add(EEItems.CLITANIUM_BOOTS);

                            entries.add(EEItems.ENDIMINTIUM_SCRAP);
                            entries.add(EEItems.ENDIMINTIUM_INGOT);
                            entries.add(EEItems.ENDIMINTIUM_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(EEItems.ENDIMINTIUM_SWORD);
                            entries.add(EEItems.ENDIMINTIUM_PICKAXE);
                            entries.add(EEItems.ENDIMINTIUM_AXE);
                            entries.add(EEItems.ENDIMINTIUM_SHOVEL);
                            entries.add(EEItems.ENDIMINTIUM_HOE);
                            entries.add(EEItems.ENDIMINTIUM_HELMET);
                            entries.add(EEItems.ENDIMINTIUM_CHESTPLATE);
                            entries.add(EEItems.ENDIMINTIUM_LEGGINGS);
                            entries.add(EEItems.ENDIMINTIUM_BOOTS);

                            entries.add(EEItems.DIAMOND_FRAGMENT);
                            entries.add(EEItems.TANZANITE);
                            entries.add(EEItems.RAW_TANZANITE);

                            entries.add(EEItems.TANZANITE_BEETROOT);
                            entries.add(EEItems.GOLDEN_BEETROOT);
                            entries.add(EEItems.ENHANCED_BEETROOT);
                            entries.add(EEItems.ENCHANTED_ENHANCED_BEETROOT);
                            entries.add(EEItems.CORRUPTED_BEETROOT);
                            entries.add(EEItems.RAW_ENDER_BULL);
                            entries.add(EEItems.COOKED_ENDER_BULL);
                        }).build());


        public static void registerItemGroups() {
            EnhancedEnd.LOGGER.info("Registering Item Groups for " + EnhancedEnd.MOD_ID);
        }
    }
