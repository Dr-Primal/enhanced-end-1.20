package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItems;
import net.primal.enhanced_end.util.EETags;

import java.util.function.Consumer;

public class EERecipeProvider extends FabricRecipeProvider {
    public EERecipeProvider(FabricDataOutput output) {
        super(output);
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
    }
}
