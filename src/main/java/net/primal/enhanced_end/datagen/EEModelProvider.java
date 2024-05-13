package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
