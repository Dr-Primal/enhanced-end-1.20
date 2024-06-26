package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItems;
import net.primal.enhanced_end.util.EETags;

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


        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(EEBlocks.KIMBERLITE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(EEBlocks.KIMBERLITE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS)
                .add(EEBlocks.KIMBERLITE_BUTTON.asItem())
                .add(EEBlocks.LARISTONE_BUTTON.asItem())
                .add(EEBlocks.SILTSTONE_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(EEBlocks.KIMBERLITE_STAIRS.asItem())
                .add(EEBlocks.POLISHED_KIMBERLITE_STAIRS.asItem())
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS.asItem())
                .add(EEBlocks.LARISTONE_STAIRS.asItem())
                .add(EEBlocks.LARISTONE_BRICK_STAIRS.asItem())
                .add(EEBlocks.SILTSTONE_STAIRS.asItem())
                .add(EEBlocks.COBBLED_SILTSTONE_STAIRS.asItem())
                .add(EEBlocks.SILTSTONE_BRICK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(EEBlocks.KIMBERLITE_SLAB.asItem())
                .add(EEBlocks.POLISHED_KIMBERLITE_SLAB.asItem())
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB.asItem())
                .add(EEBlocks.LARISTONE_SLAB.asItem())
                .add(EEBlocks.LARISTONE_BRICK_SLAB.asItem())
                .add(EEBlocks.SILTSTONE_SLAB.asItem())
                .add(EEBlocks.COBBLED_SILTSTONE_SLAB.asItem())
                .add(EEBlocks.SILTSTONE_BRICK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(EEBlocks.POLISHED_KIMBERLITE_WALL.asItem())
                .add(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL.asItem())
                .add(EEBlocks.LARISTONE_WALL.asItem())
                .add(EEBlocks.LARISTONE_BRICK_WALL.asItem())
                .add(EEBlocks.COBBLED_SILTSTONE_WALL.asItem())
                .add(EEBlocks.SILTSTONE_BRICK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(EEItems.CLITANIUM_HELMET, EEItems.CLITANIUM_CHESTPLATE, EEItems.CLITANIUM_LEGGINGS, EEItems.CLITANIUM_BOOTS)
                .add(EEItems.ENDIMINTIUM_HELMET, EEItems.ENDIMINTIUM_CHESTPLATE, EEItems.ENDIMINTIUM_LEGGINGS, EEItems.ENDIMINTIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(EEItems.CLITANIUM_SWORD)
                .add(EEItems.ENDIMINTIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(EEItems.CLITANIUM_PICKAXE)
                .add(EEItems.ENDIMINTIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(EEItems.CLITANIUM_AXE)
                .add(EEItems.ENDIMINTIUM_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(EEItems.CLITANIUM_SHOVEL)
                .add(EEItems.ENDIMINTIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(EEItems.CLITANIUM_HOE)
                .add(EEItems.ENDIMINTIUM_HOE);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(EEBlocks.MIDNIGHT_PLANKS.asItem())
                .add(EEBlocks.CORLITE_PLANKS.asItem())
                .add(EEBlocks.MIDNIGHT_SLAB.asItem())
                .add(EEBlocks.CORLITE_SLAB.asItem())
                .add(EEBlocks.MIDNIGHT_STAIRS.asItem())
                .add(EEBlocks.CORLITE_STAIRS.asItem())
                .add(EEBlocks.MIDNIGHT_FENCE.asItem())
                .add(EEBlocks.CORLITE_FENCE.asItem())
                .add(EEBlocks.MIDNIGHT_FENCE_GATE.asItem())
                .add(EEBlocks.CORLITE_FENCE_GATE.asItem())
                .add(EEBlocks.MIDNIGHT_BUTTON.asItem())
                .add(EEBlocks.CORLITE_BUTTON.asItem())
                .add(EEBlocks.MIDNIGHT_PRESSURE_PLATE.asItem())
                .add(EEBlocks.CORLITE_PRESSURE_PLATE.asItem())
                .add(EEBlocks.MIDNIGHT_DOOR.asItem())
                .add(EEBlocks.CORLITE_DOOR.asItem())
                .add(EEBlocks.MIDNIGHT_TRAPDOOR.asItem())
                .add(EEBlocks.CORLITE_TRAPDOOR.asItem())
                .add(EEBlocks.STANDING_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.WALL_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.STANDING_CORLITE_SIGN.asItem())
                .add(EEBlocks.WALL_CORLITE_SIGN.asItem())
                .add(EEBlocks.HANGING_MIDNIGHT_SIGN.asItem())
                .add(EEBlocks.HANGING_CORLITE_SIGN.asItem())
                .add(EEBlocks.MIDNIGHT_STEM.asItem())
                .add(EEBlocks.MIDNIGHT_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem())
                .add(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE.asItem())
                .add(EEBlocks.CORLITE_STEM.asItem())
                .add(EEBlocks.CORLITE_HYPHAE.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_STEM.asItem())
                .add(EEBlocks.STRIPPED_CORLITE_HYPHAE.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(EEBlocks.MIDNIGHT_MUSHROOM_CAP.asItem())
                .add(EEBlocks.CORLITE_MUSHROOM_CAP.asItem())
                .add(EEBlocks.ENDIUM_MUSHROOM_CAP.asItem());

        getOrCreateTagBuilder(ItemTags.SAND)
                .add(EEBlocks.ENDIUM_SOIL.asItem());

        getOrCreateTagBuilder(ItemTags.PIGLIN_REPELLENTS)
                .add(EEBlocks.REINFORCED_OBSIDIAN.asItem());

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(EEItems.CLITANIUM)
                .add(EEItems.ENDIMINTIUM_INGOT);

        getOrCreateTagBuilder(EETags.Items.DRAGON_FIRE_BASE_BLOCKS)
                .add(Blocks.BEDROCK.asItem())
                .add(Blocks.END_STONE.asItem())
                .add(Blocks.END_STONE_BRICKS.asItem())
                .add(Blocks.END_STONE_BRICK_SLAB.asItem())
                .add(Blocks.END_STONE_BRICK_STAIRS.asItem())
                .add(Blocks.END_STONE_BRICK_WALL.asItem());

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "iron_ingots")))
                .add(EEItems.CLITANIUM);

    }
}
