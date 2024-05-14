package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.primal.enhanced_end.block.EEBlocks;

public class EEModelProvider extends FabricModelProvider {
    public EEModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool midnightPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.MIDNIGHT_PLANKS);
        midnightPool.family(EEBlocks.MIDNIGHT_FAMILY);
        blockStateModelGenerator.registerLog(EEBlocks.MIDNIGHT_STEM).log(EEBlocks.MIDNIGHT_STEM).wood(EEBlocks.MIDNIGHT_HYPHAE);
        blockStateModelGenerator.registerLog(EEBlocks.STRIPPED_MIDNIGHT_STEM).log(EEBlocks.STRIPPED_MIDNIGHT_STEM).wood(EEBlocks.STRIPPED_MIDNIGHT_HYPHAE);
        midnightPool.stairs(EEBlocks.MIDNIGHT_STAIRS);
        midnightPool.slab(EEBlocks.MIDNIGHT_SLAB);
        midnightPool.button(EEBlocks.MIDNIGHT_BUTTON);
        midnightPool.pressurePlate(EEBlocks.MIDNIGHT_PRESSURE_PLATE);
        midnightPool.fence(EEBlocks.MIDNIGHT_FENCE);
        midnightPool.fenceGate(EEBlocks.MIDNIGHT_FENCE_GATE);
        blockStateModelGenerator.registerHangingSign(EEBlocks.STRIPPED_MIDNIGHT_STEM, EEBlocks.HANGING_MIDNIGHT_SIGN, EEBlocks.WALL_HANGING_MIDNIGHT_SIGN);
        blockStateModelGenerator.registerDoor(EEBlocks.MIDNIGHT_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(EEBlocks.MIDNIGHT_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool corlitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.CORLITE_PLANKS);
        corlitePool.family(EEBlocks.CORLITE_FAMILY);
        blockStateModelGenerator.registerLog(EEBlocks.CORLITE_STEM).log(EEBlocks.CORLITE_STEM).wood(EEBlocks.CORLITE_HYPHAE);
        blockStateModelGenerator.registerLog(EEBlocks.STRIPPED_CORLITE_STEM).log(EEBlocks.STRIPPED_CORLITE_STEM).wood(EEBlocks.STRIPPED_CORLITE_HYPHAE);
        corlitePool.stairs(EEBlocks.CORLITE_STAIRS);
        corlitePool.slab(EEBlocks.CORLITE_SLAB);
        corlitePool.button(EEBlocks.CORLITE_BUTTON);
        corlitePool.pressurePlate(EEBlocks.CORLITE_PRESSURE_PLATE);
        corlitePool.fence(EEBlocks.CORLITE_FENCE);
        corlitePool.fenceGate(EEBlocks.CORLITE_FENCE_GATE);
        blockStateModelGenerator.registerHangingSign(EEBlocks.STRIPPED_CORLITE_STEM, EEBlocks.HANGING_CORLITE_SIGN, EEBlocks.WALL_HANGING_CORLITE_SIGN);
        blockStateModelGenerator.registerDoor(EEBlocks.CORLITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(EEBlocks.CORLITE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool kimberlitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.KIMBERLITE);
        BlockStateModelGenerator.BlockTexturePool polishedKimberlitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.POLISHED_KIMBERLITE);
        BlockStateModelGenerator.BlockTexturePool polishedKimberliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.POLISHED_KIMBERLITE_BRICKS);
        kimberlitePool.stairs(EEBlocks.KIMBERLITE_STAIRS);
        kimberlitePool.slab(EEBlocks.KIMBERLITE_SLAB);
        kimberlitePool.button(EEBlocks.KIMBERLITE_BUTTON);
        kimberlitePool.pressurePlate(EEBlocks.KIMBERLITE_PRESSURE_PLATE);
        polishedKimberlitePool.stairs(EEBlocks.POLISHED_KIMBERLITE_STAIRS);
        polishedKimberlitePool.slab(EEBlocks.POLISHED_KIMBERLITE_SLAB);
        polishedKimberlitePool.wall(EEBlocks.POLISHED_KIMBERLITE_WALL);
        polishedKimberliteBrickPool.stairs(EEBlocks.POLISHED_KIMBERLITE_BRICK_STAIRS);
        polishedKimberliteBrickPool.slab(EEBlocks.POLISHED_KIMBERLITE_BRICK_SLAB);
        polishedKimberliteBrickPool.wall(EEBlocks.POLISHED_KIMBERLITE_BRICK_WALL);
        blockStateModelGenerator.registerAxisRotated(EEBlocks.POLISHED_KIMBERLITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        BlockStateModelGenerator.BlockTexturePool laristonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.LARISTONE);
        BlockStateModelGenerator.BlockTexturePool laristoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.LARISTONE_BRICKS);
        laristonePool.stairs(EEBlocks.LARISTONE_STAIRS);
        laristonePool.slab(EEBlocks.LARISTONE_SLAB);
        laristonePool.wall(EEBlocks.LARISTONE_WALL);
        laristonePool.button(EEBlocks.LARISTONE_BUTTON);
        laristonePool.pressurePlate(EEBlocks.LARISTONE_PRESSURE_PLATE);
        laristoneBrickPool.stairs(EEBlocks.LARISTONE_BRICK_STAIRS);
        laristoneBrickPool.slab(EEBlocks.LARISTONE_BRICK_SLAB);
        laristoneBrickPool.wall(EEBlocks.LARISTONE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
