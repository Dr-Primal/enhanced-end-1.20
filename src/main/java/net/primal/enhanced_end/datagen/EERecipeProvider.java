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

        //Hyphae
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.MIDNIGHT_HYPHAE, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.MIDNIGHT_STEM.asItem())
                .criterion(hasItem(EEBlocks.MIDNIGHT_STEM.asItem()),
                        conditionsFromItem(EEBlocks.MIDNIGHT_STEM.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.MIDNIGHT_HYPHAE.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.CORLITE_HYPHAE, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.CORLITE_STEM.asItem())
                .criterion(hasItem(EEBlocks.CORLITE_STEM.asItem()),
                        conditionsFromItem(EEBlocks.CORLITE_STEM.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.CORLITE_HYPHAE.asItem())));

        //Stripped Hyphae
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.STRIPPED_MIDNIGHT_HYPHAE.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem())
                .criterion(hasItem(EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem()),
                        conditionsFromItem(EEBlocks.STRIPPED_MIDNIGHT_STEM.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EEBlocks.STRIPPED_CORLITE_HYPHAE.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', EEBlocks.STRIPPED_CORLITE_STEM.asItem())
                .criterion(hasItem(EEBlocks.STRIPPED_CORLITE_STEM.asItem()),
                        conditionsFromItem(EEBlocks.STRIPPED_CORLITE_STEM.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(EEBlocks.STRIPPED_CORLITE_HYPHAE.asItem())));

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
    }
}
