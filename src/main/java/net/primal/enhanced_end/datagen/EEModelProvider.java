package net.primal.enhanced_end.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.EEItems;

import java.util.List;

public class EEModelProvider extends FabricModelProvider {
    public EEModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Midnight Wood Set
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

        //Corlite Wood Set
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

        //Kimberlite Stone Set
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

        //Laristone Stone Set
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

        //Siltstone Stone Set
        BlockStateModelGenerator.BlockTexturePool siltstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool cobbledSiltstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.COBBLED_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool siltstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EEBlocks.SILTSTONE_BRICKS);
        siltstonePool.stairs(EEBlocks.SILTSTONE_STAIRS);
        siltstonePool.slab(EEBlocks.SILTSTONE_SLAB);
        siltstonePool.button(EEBlocks.SILTSTONE_BUTTON);
        siltstonePool.pressurePlate(EEBlocks.SILTSTONE_PRESSURE_PLATE);
        cobbledSiltstonePool.stairs(EEBlocks.COBBLED_SILTSTONE_STAIRS);
        cobbledSiltstonePool.slab(EEBlocks.COBBLED_SILTSTONE_SLAB);
        cobbledSiltstonePool.wall(EEBlocks.COBBLED_SILTSTONE_WALL);
        siltstoneBrickPool.stairs(EEBlocks.SILTSTONE_BRICK_STAIRS);
        siltstoneBrickPool.slab(EEBlocks.SILTSTONE_BRICK_SLAB);
        siltstoneBrickPool.wall(EEBlocks.SILTSTONE_BRICK_WALL);

        //Nylium
        blockStateModelGenerator.registerCubeWithCustomTextures(EEBlocks.MIDNIGHT_NYLIUM, Blocks.END_STONE, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(EEBlocks.CORLITE_NYLIUM, Blocks.END_STONE, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.ENDIUM_SOIL);
        //Mushroom Caps
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.MIDNIGHT_MUSHROOM_CAP);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.CORLITE_MUSHROOM_CAP);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.ENDIUM_MUSHROOM_CAP);


        //Ore and Ore Blocks
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.END_TANZANITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.END_CLITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.RAW_TANZANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.TANZANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.CLITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.ENDIMINTIUM_BLOCK);

        //Reinforced Obsidian
        blockStateModelGenerator.registerSimpleCubeAll(EEBlocks.REINFORCED_OBSIDIAN);

        //Dragon Fire
        List<Identifier> list = blockStateModelGenerator.getFireFloorModels(EEBlocks.DRAGON_FIRE);
        List<Identifier> list2 = blockStateModelGenerator.getFireSideModels(EEBlocks.DRAGON_FIRE);
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(EEBlocks.DRAGON_FIRE)
                .with(BlockStateModelGenerator.buildBlockStateVariants(list, blockStateVariant -> blockStateVariant))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R90)))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R180)))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R270))));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Clitanium
        itemModelGenerator.register(EEItems.CLITANIUM, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.CLITANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.CLITANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.CLITANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.CLITANIUM_BOOTS));
        itemModelGenerator.register(EEItems.CLITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EEItems.CLITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(EEItems.CLITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EEItems.CLITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(EEItems.CLITANIUM_HOE, Models.HANDHELD);
        //Endimintium
        itemModelGenerator.register(EEItems.ENDIMINTIUM_SCRAP, Models.GENERATED);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.ENDIMINTIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.ENDIMINTIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.ENDIMINTIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) EEItems.ENDIMINTIUM_BOOTS));
        itemModelGenerator.register(EEItems.ENDIMINTIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(EEItems.ENDIMINTIUM_HOE, Models.HANDHELD);
        //Diamond Fragment
        itemModelGenerator.register(EEItems.DIAMOND_FRAGMENT, Models.GENERATED);
        //Tanzanite
        itemModelGenerator.register(EEItems.TANZANITE, Models.GENERATED);
        itemModelGenerator.register(EEItems.RAW_TANZANITE, Models.GENERATED);
        //Foods
        itemModelGenerator.register(EEItems.TANZANITE_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.GOLDEN_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.ENHANCED_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.ENCHANTED_ENHANCED_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.CORRUPTED_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(EEItems.RAW_ENDER_BULL, Models.GENERATED);
        itemModelGenerator.register(EEItems.COOKED_ENDER_BULL, Models.GENERATED);

        //Misc
        itemModelGenerator.register(EEItems.REINFORCED_OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(EEItems.SENTRY_DISK, Models.GENERATED);
        itemModelGenerator.register(EEItems.SHADOW_SHARD, Models.GENERATED);
        itemModelGenerator.register(EEItems.ENHANCED_PEARL, Models.GENERATED);
        itemModelGenerator.register(EEItems.PHANTOM_PEARL, Models.GENERATED);
        itemModelGenerator.register(EEItems.PHANTOM_EYE, Models.GENERATED);
    }
}
