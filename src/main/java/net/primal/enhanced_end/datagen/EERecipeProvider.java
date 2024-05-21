package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItems;
import net.primal.enhanced_end.util.EETags;

import java.util.List;
import java.util.function.Consumer;

public class EERecipeProvider extends FabricRecipeProvider {
    public EERecipeProvider(FabricDataOutput output) {
        super(output);
    }

    public static void offerEndimintiumUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(EEItems.ENDIMINTIUM_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(input),
                Ingredient.ofItems(EEItems.ENDIMINTIUM_INGOT), category, result)
                .criterion("has_endimintium_ingot",
                RecipeProvider.conditionsFromItem(EEItems.ENDIMINTIUM_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
//Crafting
        //Hyphae
        offerBarkBlockRecipe(exporter, EEBlocks.MIDNIGHT_HYPHAE, EEBlocks.MIDNIGHT_STEM);
        offerBarkBlockRecipe(exporter, EEBlocks.CORLITE_HYPHAE, EEBlocks.CORLITE_STEM);

        //Stripped Hyphae
        offerBarkBlockRecipe(exporter, EEBlocks.STRIPPED_MIDNIGHT_HYPHAE, EEBlocks.STRIPPED_MIDNIGHT_STEM);
        offerBarkBlockRecipe(exporter, EEBlocks.STRIPPED_CORLITE_HYPHAE, EEBlocks.STRIPPED_CORLITE_STEM);

        //Planks
        offerPlanksRecipe(exporter, EEBlocks.MIDNIGHT_PLANKS.asItem(), EETags.Items.MIDNIGHT_STEMS, 4);
        offerPlanksRecipe(exporter, EEBlocks.CORLITE_PLANKS.asItem(), EETags.Items.CORLITE_STEMS, 4);


        //Wooden Stairs
        createStairsRecipe(EEBlocks.MIDNIGHT_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_STAIRS.asItem())));
        createStairsRecipe(EEBlocks.CORLITE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_STAIRS.asItem())));

        //Wooden Slabs
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.MIDNIGHT_SLAB, EEBlocks.MIDNIGHT_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.CORLITE_SLAB, EEBlocks.CORLITE_PLANKS);


        //Wooden Buttons
        offerSingleOutputShapelessRecipe(exporter, EEBlocks.MIDNIGHT_BUTTON, EEBlocks.MIDNIGHT_PLANKS, "enhanced_end_blocks");
        offerSingleOutputShapelessRecipe(exporter, EEBlocks.CORLITE_BUTTON, EEBlocks.CORLITE_PLANKS, "enhanced_end_blocks");



        //Wooden Pressure Plates
        offerPressurePlateRecipe(exporter, EEBlocks.MIDNIGHT_PRESSURE_PLATE, EEBlocks.MIDNIGHT_PLANKS);
        offerPressurePlateRecipe(exporter, EEBlocks.CORLITE_PRESSURE_PLATE, EEBlocks.CORLITE_PLANKS);


        //Fences
        createFenceRecipe(EEBlocks.MIDNIGHT_FENCE.asItem(), Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_FENCE.asItem())));
        createFenceRecipe(EEBlocks.CORLITE_FENCE.asItem(), Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_FENCE.asItem())));


        //Fence Gates
        createFenceGateRecipe(EEBlocks.MIDNIGHT_FENCE_GATE.asItem(), Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_FENCE_GATE.asItem())));
        createFenceGateRecipe(EEBlocks.CORLITE_FENCE_GATE.asItem(), Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_FENCE_GATE.asItem())));

        //Wooden Doors
        createDoorRecipe(EEBlocks.MIDNIGHT_DOOR.asItem(), Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_DOOR.asItem())));
        createDoorRecipe(EEBlocks.CORLITE_DOOR.asItem(), Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_DOOR.asItem())));

        //Wooden Trapdoors
        createTrapdoorRecipe(EEBlocks.MIDNIGHT_TRAPDOOR.asItem(), Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_TRAPDOOR.asItem())));
        createTrapdoorRecipe(EEBlocks.CORLITE_TRAPDOOR.asItem(), Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_TRAPDOOR.asItem())));

        //Signs
        createSignRecipe(EEItems.MIDNIGHT_SIGN, Ingredient.ofItems(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.MIDNIGHT_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.MIDNIGHT_SIGN)));
        createSignRecipe(EEItems.CORLITE_SIGN, Ingredient.ofItems(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(EEBlocks.CORLITE_PLANKS.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CORLITE_SIGN)));

        //Hanging Signs
        offerHangingSignRecipe(exporter, EEItems.HANGING_MIDNIGHT_SIGN, EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem());
        offerHangingSignRecipe(exporter, EEItems.HANGING_CORLITE_SIGN, EEBlocks.STRIPPED_CORLITE_STEM.asItem());

        //Kimberlite
        createStairsRecipe(EEBlocks.KIMBERLITE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.KIMBERLITE.asItem()))
                .criterion(hasItem(EEBlocks.KIMBERLITE.asItem()),
                        conditionsFromItem(EEBlocks.KIMBERLITE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.KIMBERLITE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.KIMBERLITE_SLAB, EEBlocks.KIMBERLITE);
        offerSingleOutputShapelessRecipe(exporter, EEBlocks.KIMBERLITE_BUTTON, EEBlocks.KIMBERLITE, "enhanced_end_blocks");
        offerPressurePlateRecipe(exporter, EEBlocks.KIMBERLITE_PRESSURE_PLATE, EEBlocks.KIMBERLITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.KIMBERLITE.asItem())
                .criterion(hasItem(EEBlocks.KIMBERLITE.asItem()),
                        conditionsFromItem(EEBlocks.KIMBERLITE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.POLISHED_KIMBERLITE.asItem())));
        createStairsRecipe(EEBlocks.POLISHED_KIMBERLITE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.POLISHED_KIMBERLITE.asItem()))
                .criterion(hasItem(EEBlocks.POLISHED_KIMBERLITE.asItem()),
                        conditionsFromItem(EEBlocks.POLISHED_KIMBERLITE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.POLISHED_KIMBERLITE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_SLAB, EEBlocks.POLISHED_KIMBERLITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_WALL, EEBlocks.POLISHED_KIMBERLITE);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_PILLAR, EEBlocks.POLISHED_KIMBERLITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICKS, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.POLISHED_KIMBERLITE.asItem())
                .criterion(hasItem(EEBlocks.POLISHED_KIMBERLITE.asItem()),
                        conditionsFromItem(EEBlocks.POLISHED_KIMBERLITE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.POLISHED_KIMBERLITE_BRICKS.asItem())));
        createStairsRecipe(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.POLISHED_KIMBERLITE_BRICKS.asItem()))
                .criterion(hasItem(EEBlocks.POLISHED_KIMBERLITE_BRICKS.asItem()),
                        conditionsFromItem(EEBlocks.POLISHED_KIMBERLITE_BRICKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB, EEBlocks.POLISHED_KIMBERLITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL, EEBlocks.POLISHED_KIMBERLITE_BRICKS);

        //Laristone
        createStairsRecipe(EEBlocks.LARISTONE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.LARISTONE.asItem()))
                .criterion(hasItem(EEBlocks.LARISTONE.asItem()),
                        conditionsFromItem(EEBlocks.LARISTONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.LARISTONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_SLAB, EEBlocks.LARISTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_WALL, EEBlocks.LARISTONE);
        offerSingleOutputShapelessRecipe(exporter, EEBlocks.LARISTONE_BUTTON, EEBlocks.LARISTONE, "enhanced_end_blocks");
        offerPressurePlateRecipe(exporter, EEBlocks.LARISTONE_PRESSURE_PLATE, EEBlocks.LARISTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICKS, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.LARISTONE.asItem())
                .criterion(hasItem(EEBlocks.LARISTONE.asItem()),
                        conditionsFromItem(EEBlocks.LARISTONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.LARISTONE_BRICKS.asItem())));
        createStairsRecipe(EEBlocks.LARISTONE_BRICK_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.LARISTONE_BRICKS.asItem()))
                .criterion(hasItem(EEBlocks.LARISTONE_BRICKS.asItem()),
                        conditionsFromItem(EEBlocks.LARISTONE_BRICKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.LARISTONE_BRICK_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_SLAB, EEBlocks.LARISTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_WALL, EEBlocks.LARISTONE_BRICKS);

        //Siltstone
        createStairsRecipe(EEBlocks.SILTSTONE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.SILTSTONE.asItem()))
                .criterion(hasItem(EEBlocks.SILTSTONE.asItem()),
                        conditionsFromItem(EEBlocks.SILTSTONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.SILTSTONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_SLAB, EEBlocks.SILTSTONE);
        offerSingleOutputShapelessRecipe(exporter, EEBlocks.SILTSTONE_BUTTON, EEBlocks.SILTSTONE, "outer_world_blocks");
        offerPressurePlateRecipe(exporter, EEBlocks.SILTSTONE_PRESSURE_PLATE, EEBlocks.SILTSTONE);

        createStairsRecipe(EEBlocks.COBBLED_SILTSTONE_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.COBBLED_SILTSTONE.asItem()))
                .criterion(hasItem(EEBlocks.COBBLED_SILTSTONE.asItem()),
                        conditionsFromItem(EEBlocks.COBBLED_SILTSTONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.COBBLED_SILTSTONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_SLAB, EEBlocks.COBBLED_SILTSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_WALL, EEBlocks.COBBLED_SILTSTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICKS, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.COBBLED_SILTSTONE.asItem())
                .criterion(hasItem(EEBlocks.COBBLED_SILTSTONE.asItem()),
                        conditionsFromItem(EEBlocks.COBBLED_SILTSTONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.SILTSTONE_BRICKS.asItem())));
        createStairsRecipe(EEBlocks.SILTSTONE_BRICK_STAIRS.asItem(), Ingredient.ofItems(EEBlocks.SILTSTONE_BRICKS.asItem()))
                .criterion(hasItem(EEBlocks.SILTSTONE_BRICKS.asItem()),
                        conditionsFromItem(EEBlocks.SILTSTONE_BRICKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.SILTSTONE_BRICK_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_SLAB, EEBlocks.SILTSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_WALL, EEBlocks.SILTSTONE_BRICKS);

        //Diamond Fragment
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Items.DIAMOND, EEItems.DIAMOND_FRAGMENT);

        //Clitanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EEItems.CLITANIUM_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EEItems.CLITANIUM_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EEItems.CLITANIUM_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EEItems.CLITANIUM_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EEItems.CLITANIUM_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EEItems.CLITANIUM_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EEItems.CLITANIUM_AXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EEItems.CLITANIUM_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EEItems.CLITANIUM_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', EEItems.CLITANIUM)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EEItems.CLITANIUM_HOE)));

        //Endimintium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EEItems.ENDIMINTIUM_INGOT, 1)
                .pattern("RRR")
                .pattern("REE")
                .pattern("EE ")
                .input('R', EEItems.CLITANIUM)
                .input('E', EEItems.ENDIMINTIUM_SCRAP)
                .criterion(hasItem(EEItems.CLITANIUM),
                        conditionsFromItem(EEItems.CLITANIUM))
                .criterion(hasItem(EEItems.ENDIMINTIUM_SCRAP),
                        conditionsFromItem(EEItems.ENDIMINTIUM_SCRAP))
                .offerTo(exporter, new Identifier(("endimintium_ingot_from_endimintium_scrap")));

        offerSmithingTemplateCopyingRecipe(exporter, EEItems.ENDIMINTIUM_UPGRADE_SMITHING_TEMPLATE, Blocks.END_STONE);

        //Ore Blocks
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EEItems.RAW_TANZANITE, RecipeCategory.DECORATIONS, EEBlocks.RAW_TANZANITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EEItems.TANZANITE, RecipeCategory.DECORATIONS, EEBlocks.TANZANITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EEItems.CLITANIUM, RecipeCategory.DECORATIONS, EEBlocks.CLITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EEItems.ENDIMINTIUM_INGOT, RecipeCategory.DECORATIONS, EEBlocks.ENDIMINTIUM_BLOCK);

//Stone Cutting
        //Kimberlite
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS, EEBlocks.POLISHED_KIMBERLITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB, EEBlocks.POLISHED_KIMBERLITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL, EEBlocks.POLISHED_KIMBERLITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.KIMBERLITE_STAIRS, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.KIMBERLITE_SLAB, EEBlocks.KIMBERLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_STAIRS, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_SLAB, EEBlocks.KIMBERLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_WALL, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICKS, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB, EEBlocks.KIMBERLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL, EEBlocks.KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_PILLAR, EEBlocks.KIMBERLITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_STAIRS, EEBlocks.POLISHED_KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_SLAB, EEBlocks.POLISHED_KIMBERLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_WALL, EEBlocks.POLISHED_KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICKS, EEBlocks.POLISHED_KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS, EEBlocks.POLISHED_KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB, EEBlocks.POLISHED_KIMBERLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL, EEBlocks.POLISHED_KIMBERLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.POLISHED_KIMBERLITE_PILLAR, EEBlocks.POLISHED_KIMBERLITE);

        //Laristone
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_STAIRS, EEBlocks.LARISTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_SLAB, EEBlocks.LARISTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_WALL, EEBlocks.LARISTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICKS, EEBlocks.LARISTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_STAIRS, EEBlocks.LARISTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_SLAB, EEBlocks.LARISTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_WALL, EEBlocks.LARISTONE, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_STAIRS, EEBlocks.LARISTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_SLAB, EEBlocks.LARISTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.LARISTONE_BRICK_WALL, EEBlocks.LARISTONE_BRICKS);

        //Siltstone
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_STAIRS, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_SLAB, EEBlocks.SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_STAIRS, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_SLAB, EEBlocks.SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_WALL, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICKS, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_STAIRS, EEBlocks.SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_SLAB, EEBlocks.SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_WALL, EEBlocks.SILTSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_STAIRS, EEBlocks.COBBLED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_SLAB, EEBlocks.COBBLED_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.COBBLED_SILTSTONE_WALL, EEBlocks.COBBLED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICKS, EEBlocks.COBBLED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_STAIRS, EEBlocks.COBBLED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_SLAB, EEBlocks.COBBLED_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_WALL, EEBlocks.COBBLED_SILTSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_STAIRS, EEBlocks.SILTSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_SLAB, EEBlocks.SILTSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EEBlocks.SILTSTONE_BRICK_WALL, EEBlocks.SILTSTONE_BRICKS);

        //Smithing
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_HELMET, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_HELMET);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_CHESTPLATE, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_CHESTPLATE);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_LEGGINGS, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_LEGGINGS);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_BOOTS, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_BOOTS);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_SWORD, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_SWORD);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_AXE, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_AXE);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_PICKAXE, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_PICKAXE);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_SHOVEL, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_SHOVEL);
        offerEndimintiumUpgradeRecipe(exporter, EEItems.CLITANIUM_HOE, RecipeCategory.COMBAT, EEItems.ENDIMINTIUM_HOE);

        //Smelting
        offerFoodCookingRecipe(exporter, RecipeType.SMOKING.toString(), RecipeSerializer.SMOKING, 100, EEItems.RAW_ENDER_BULL, EEItems.COOKED_ENDER_BULL, 0.35f);
        offerFoodCookingRecipe(exporter, RecipeType.CAMPFIRE_COOKING.toString(), RecipeSerializer.CAMPFIRE_COOKING, 600, EEItems.RAW_ENDER_BULL, EEItems.COOKED_ENDER_BULL, 0.35f);
        offerSmelting(exporter, List.of(EEItems.RAW_ENDER_BULL), RecipeCategory.FOOD, EEItems.COOKED_ENDER_BULL, 0.35f, 200, "enhanced_end_items");

        offerSmelting(exporter, List.of(EEItems.RAW_TANZANITE), RecipeCategory.MISC, EEItems.TANZANITE, 0.7f, 200, "enhanced_end_items");
        offerBlasting(exporter, List.of(EEItems.RAW_TANZANITE), RecipeCategory.MISC, EEItems.TANZANITE, 0.7f, 100, "enhanced_end_items");
    }
}