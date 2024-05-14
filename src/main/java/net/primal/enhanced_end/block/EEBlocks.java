package net.primal.enhanced_end.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;

public class EEBlocks {
    //Midnight Wood Set
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EnhancedEnd.MOD_ID, name), block);
    }
    public static final Block MIDNIGHT_STEM = registerBlock("midnight_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f)));
    public static final Block MIDNIGHT_HYPHAE = registerBlock("midnight_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f)));
    public static final Block STRIPPED_MIDNIGHT_STEM = registerBlock("stripped_midnight_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM)
                    .mapColor(MapColor.PINK)
                    .strength(2f)));
    public static final Block STRIPPED_MIDNIGHT_HYPHAE = registerBlock("stripped_midnight_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE)
                    .mapColor(MapColor.PINK)
                    .strength(2f)));
    public static final Block MIDNIGHT_PLANKS = registerBlock("midnight_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)
                    .mapColor(MapColor.PINK)
                    .strength(2f)));
    public static final Block MIDNIGHT_STAIRS = registerBlock("midnight_stairs",
            new StairsBlock(EEBlocks.MIDNIGHT_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS)
                            .mapColor(MapColor.PINK)
                            .strength(2f)));
    public static final Block MIDNIGHT_SLAB = registerBlock("midnight_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB)
                    .mapColor(MapColor.PINK)
                    .strength(2f)));
    public static final Block MIDNIGHT_BUTTON = registerBlock("midnight_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON)
                    .mapColor(MapColor.PINK)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.WARPED, 30, true));
    public static final Block MIDNIGHT_PRESSURE_PLATE = registerBlock("midnight_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE)
                            .mapColor(MapColor.PINK)
                            .strength(0.5f),
                    BlockSetType.WARPED));
    public static final Block MIDNIGHT_FENCE = registerBlock("midnight_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE)
                    .mapColor(MapColor.PINK)
                    .strength(2f)));
    public static final Block MIDNIGHT_FENCE_GATE = registerBlock("midnight_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE)
                    .mapColor(MapColor.PINK)
                    .strength(2f),
                    WoodType.WARPED));
    public static final Block MIDNIGHT_DOOR = registerBlock("midnight_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR)
                    .mapColor(MapColor.PINK)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.WARPED));
    public static final Block MIDNIGHT_TRAPDOOR = registerBlock("midnight_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR)
                    .mapColor(MapColor.PINK)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.WARPED));
    public static final Identifier MIDNIGHT_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "entity/signs/midnight");
    public static final Identifier MIDNIGHT_HANGING_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "entity/signs/hanging/midnight");
    public static final Identifier MIDNIGHT_HANGING_GUI_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "textures/gui/hanging_signs/midnight");
    public static final Block STANDING_MIDNIGHT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "midnight_standing_sign"),
                    new TerraformSignBlock(MIDNIGHT_SIGN_TEXTURE,
                            FabricBlockSettings.copy(Blocks.WARPED_SIGN)
                                    .mapColor(MapColor.PINK)));
    public static final Block WALL_MIDNIGHT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "midnight_wall_sign"),
                    new TerraformWallSignBlock(MIDNIGHT_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.WARPED_WALL_SIGN)
                                    .dropsLike(STANDING_MIDNIGHT_SIGN)
                                    .mapColor(MapColor.PINK)));
    public static final Block HANGING_MIDNIGHT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "midnight_hanging_sign"),
                    new TerraformHangingSignBlock(MIDNIGHT_HANGING_SIGN_TEXTURE, MIDNIGHT_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.WARPED_HANGING_SIGN)
                                    .mapColor(MapColor.PINK)));
    public static final Block WALL_HANGING_MIDNIGHT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "midnight_wall_hanging_sign"),
                    new TerraformWallHangingSignBlock(MIDNIGHT_HANGING_SIGN_TEXTURE, MIDNIGHT_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.WARPED_WALL_HANGING_SIGN)
                                    .dropsLike(HANGING_MIDNIGHT_SIGN)
                                    .mapColor(MapColor.PINK)));
    public static final BlockFamily MIDNIGHT_FAMILY =
            BlockFamilies.register(EEBlocks.MIDNIGHT_PLANKS)
                    .sign(EEBlocks.STANDING_MIDNIGHT_SIGN, EEBlocks.WALL_MIDNIGHT_SIGN)
                    .group("wooden").unlockCriterionName("has_planks").build();

    //Corlite Wood Set
    public static final Block CORLITE_STEM = registerBlock("corlite_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block CORLITE_HYPHAE = registerBlock("corlite_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block STRIPPED_CORLITE_STEM = registerBlock("stripped_corlite_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM)
                    .mapColor(MapColor.PURPLE)
                    .strength(2f)));
    public static final Block STRIPPED_CORLITE_HYPHAE = registerBlock("stripped_corlite_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)
                    .mapColor(MapColor.PURPLE)
                    .strength(2f)));
    public static final Block CORLITE_PLANKS = registerBlock("corlite_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)
                    .mapColor(MapColor.WHITE)
                    .strength(2f)));
    public static final Block CORLITE_STAIRS = registerBlock("corlite_stairs",
            new StairsBlock(EEBlocks.CORLITE_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS)
                            .mapColor(MapColor.WHITE)
                            .strength(2f)));
    public static final Block CORLITE_SLAB = registerBlock("corlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)
                    .mapColor(MapColor.WHITE)
                    .strength(2f)));
    public static final Block CORLITE_BUTTON = registerBlock("corlite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON)
                    .mapColor(MapColor.WHITE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.CRIMSON, 30, true));
    public static final Block CORLITE_PRESSURE_PLATE = registerBlock("corlite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE)
                            .mapColor(MapColor.WHITE)
                            .strength(0.5f),
                    BlockSetType.CRIMSON));
    public static final Block CORLITE_FENCE = registerBlock("corlite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE)
                    .mapColor(MapColor.WHITE)
                    .strength(2f)));
    public static final Block CORLITE_FENCE_GATE = registerBlock("corlite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE)
                    .mapColor(MapColor.WHITE)
                    .strength(2f),
                    WoodType.CRIMSON));
    public static final Block CORLITE_DOOR = registerBlock("corlite_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR)
                    .mapColor(MapColor.WHITE)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.CRIMSON));
    public static final Block CORLITE_TRAPDOOR = registerBlock("corlite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR)
                    .mapColor(MapColor.WHITE)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.CRIMSON));
    public static final Identifier CORLITE_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "entity/signs/corlite");
    public static final Identifier CORLITE_HANGING_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "entity/signs/hanging/corlite");
    public static final Identifier CORLITE_HANGING_GUI_SIGN_TEXTURE =
            new Identifier(EnhancedEnd.MOD_ID, "textures/gui/hanging_signs/corlite");
    public static final Block STANDING_CORLITE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "corlite_standing_sign"),
                    new TerraformSignBlock(CORLITE_SIGN_TEXTURE,
                            FabricBlockSettings.copy(Blocks.ACACIA_SIGN)
                                    .mapColor(MapColor.WHITE)));
    public static final Block WALL_CORLITE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "corlite_wall_sign"),
                    new TerraformWallSignBlock(CORLITE_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_SIGN)
                                    .dropsLike(STANDING_CORLITE_SIGN)
                                    .mapColor(MapColor.WHITE)));
    public static final Block HANGING_CORLITE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "corlite_hanging_sign"),
                    new TerraformHangingSignBlock(CORLITE_HANGING_SIGN_TEXTURE, CORLITE_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_HANGING_SIGN)
                                    .mapColor(MapColor.WHITE)));
    public static final Block WALL_HANGING_CORLITE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(EnhancedEnd.MOD_ID, "corlite_wall_hanging_sign"),
                    new TerraformWallHangingSignBlock(CORLITE_HANGING_SIGN_TEXTURE, CORLITE_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_HANGING_SIGN)
                                    .dropsLike(HANGING_CORLITE_SIGN)
                                    .mapColor(MapColor.WHITE)));
    public static final BlockFamily CORLITE_FAMILY =
            BlockFamilies.register(EEBlocks.CORLITE_PLANKS)
                    .sign(EEBlocks.STANDING_CORLITE_SIGN, EEBlocks.WALL_CORLITE_SIGN)
                    .group("wooden").unlockCriterionName("has_planks").build();

    //Kimberlite Stone Set
    public static final Block KIMBERLITE = registerBlock("kimberlite",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block KIMBERLITE_STAIRS = registerBlock("kimberlite_stairs",
            new StairsBlock(KIMBERLITE.getDefaultState(), FabricBlockSettings.copyOf(KIMBERLITE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block KIMBERLITE_SLAB = registerBlock("kimberlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));
    public static final Block KIMBERLITE_BUTTON = registerBlock("kimberlite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block KIMBERLITE_PRESSURE_PLATE = registerBlock("kimberlite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .requiresTool()
                            .strength(0.5f),
                    BlockSetType.STONE));
    public static final Block POLISHED_KIMBERLITE = registerBlock("polished_kimberlite",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_KIMBERLITE_STAIRS = registerBlock("polished_kimberlite_stairs",
            new StairsBlock(POLISHED_KIMBERLITE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_KIMBERLITE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_KIMBERLITE_SLAB = registerBlock("polished_kimberlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));
    public static final Block POLISHED_KIMBERLITE_WALL = registerBlock("polished_kimberlite_wall",
            new WallBlock(FabricBlockSettings.copyOf(EEBlocks.POLISHED_KIMBERLITE)
                    .solid()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_KIMBERLITE_BRICKS = registerBlock("polished_kimberlite_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_KIMBERLITE_BRICK_STAIRS = registerBlock("polished_kimberlite_brick_stairs",
            new StairsBlock(POLISHED_KIMBERLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_KIMBERLITE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_KIMBERLITE_BRICK_SLAB = registerBlock("polished_kimberlite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));
    public static final Block POLISHED_KIMBERLITE_BRICK_WALL = registerBlock("polished_kimberlite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(EEBlocks.POLISHED_KIMBERLITE_BRICKS)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));

    public static final Block POLISHED_KIMBERLITE_PILLAR = registerBlock("polished_kimberlite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));

    //Laristone Stone Set
    public static final Block LARISTONE = registerBlock("laristone",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LARISTONE_STAIRS = registerBlock("laristone_stairs",
            new StairsBlock(LARISTONE.getDefaultState(), FabricBlockSettings.copyOf(LARISTONE)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LARISTONE_SLAB = registerBlock("laristone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));
    public static final Block LARISTONE_WALL = registerBlock("laristone_wall",
            new WallBlock(FabricBlockSettings.copyOf(EEBlocks.LARISTONE)
                    .solid()
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LARISTONE_BUTTON = registerBlock("laristone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block LARISTONE_PRESSURE_PLATE = registerBlock("laristone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.DIAMOND_BLUE)
                            .requiresTool()
                            .strength(0.5f),
                    BlockSetType.STONE));
    public static final Block LARISTONE_BRICKS = registerBlock("laristone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LARISTONE_BRICK_STAIRS = registerBlock("laristone_brick_stairs",
            new StairsBlock(LARISTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(LARISTONE_BRICKS)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LARISTONE_BRICK_SLAB = registerBlock("laristone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));
    public static final Block LARISTONE_BRICK_WALL = registerBlock("laristone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(EEBlocks.LARISTONE_BRICKS)
                    .solid()
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EnhancedEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerEEBlocks() {
        EnhancedEnd.LOGGER.info("Registering Blocks for " + EnhancedEnd.MOD_ID);
    }
}
