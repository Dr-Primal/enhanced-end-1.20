package net.primal.enhanced_end.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.primal.enhanced_end.EnhancedEnd;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.item.custom.BlindDiskItem;
import net.primal.enhanced_end.item.custom.EndimintiumSmithingTemplateItem;
import net.primal.enhanced_end.item.custom.EnhancedPearlItem;

public class EEItems {
    public static final Item MIDNIGHT_SIGN = registerItem("midnight_sign",
            new SignItem(new FabricItemSettings().maxCount(16),
                    EEBlocks.STANDING_MIDNIGHT_SIGN, EEBlocks.WALL_MIDNIGHT_SIGN));
    public static final Item HANGING_MIDNIGHT_SIGN = registerItem("midnight_hanging_sign",
            new HangingSignItem(EEBlocks.HANGING_MIDNIGHT_SIGN,
                    EEBlocks.WALL_HANGING_MIDNIGHT_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item CORLITE_SIGN = registerItem("corlite_sign",
            new SignItem(new FabricItemSettings().maxCount(16),
                    EEBlocks.STANDING_CORLITE_SIGN, EEBlocks.WALL_CORLITE_SIGN));
    public static final Item HANGING_CORLITE_SIGN = registerItem("corlite_hanging_sign",
            new HangingSignItem(EEBlocks.HANGING_CORLITE_SIGN,
                    EEBlocks.WALL_HANGING_CORLITE_SIGN, new FabricItemSettings().maxCount(16)));

    //Clitanium
    public static final Item CLITANIUM = registerItem("clitanium",
            new Item(new FabricItemSettings()));

    public static final Item CLITANIUM_PICKAXE = registerItem("clitanium_pickaxe",
            new PickaxeItem(EEToolMaterials.CLITANIUM, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_AXE = registerItem("clitanium_axe",
            new AxeItem(EEToolMaterials.CLITANIUM, 5, -3f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_SHOVEL = registerItem("clitanium_shovel",
            new ShovelItem(EEToolMaterials.CLITANIUM, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_SWORD = registerItem("clitanium_sword",
            new SwordItem(EEToolMaterials.CLITANIUM, 3, -2.4f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_HOE = registerItem("clitanium_hoe",
            new HoeItem(EEToolMaterials.CLITANIUM, -3, 0f,
                    new FabricItemSettings()));

    public static final Item CLITANIUM_HELMET = registerItem("clitanium_helmet",
            new ArmorItem(EEArmorMaterials.CLITANIUM, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_CHESTPLATE = registerItem("clitanium_chestplate",
            new ArmorItem(EEArmorMaterials.CLITANIUM, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_LEGGINGS = registerItem("clitanium_leggings",
            new ArmorItem(EEArmorMaterials.CLITANIUM, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_BOOTS = registerItem("clitanium_boots",
            new ArmorItem(EEArmorMaterials.CLITANIUM, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    //Endimintium
    public static final Item ENDIMINTIUM_SCRAP = registerItem("endimintium_scrap",
            new Item(new FabricItemSettings()
                    .fireproof()));
    public static final Item ENDIMINTIUM_INGOT = registerItem("endimintium_ingot",
            new Item(new FabricItemSettings()
                            .fireproof()));

    public static final Item ENDIMINTIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("endimintium_upgrade_smithing_template",
            EndimintiumSmithingTemplateItem.createEndimintiumUpgrade());

    public static final Item ENDIMINTIUM_PICKAXE = registerItem("endimintium_pickaxe",
            new PickaxeItem(EEToolMaterials.ENDIMINTIUM, 0, -2.8f,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_AXE = registerItem("endimintium_axe",
            new AxeItem(EEToolMaterials.ENDIMINTIUM, 5, -3f,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_SHOVEL = registerItem("endimintium_shovel",
            new ShovelItem(EEToolMaterials.ENDIMINTIUM, 0.5f, -3f,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_SWORD = registerItem("endimintium_sword",
            new SwordItem(EEToolMaterials.ENDIMINTIUM, 3, -2.4f,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_HOE = registerItem("endimintium_hoe",
            new HoeItem(EEToolMaterials.ENDIMINTIUM, -6, 0f,
                    new FabricItemSettings()
                            .fireproof()));

    public static final Item ENDIMINTIUM_HELMET = registerItem("endimintium_helmet",
            new ArmorItem(EEArmorMaterials.ENDIMINTIUM, ArmorItem.Type.HELMET,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_CHESTPLATE = registerItem("endimintium_chestplate",
            new ArmorItem(EEArmorMaterials.ENDIMINTIUM, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_LEGGINGS = registerItem("endimintium_leggings",
            new ArmorItem(EEArmorMaterials.ENDIMINTIUM, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()
                            .fireproof()));
    public static final Item ENDIMINTIUM_BOOTS = registerItem("endimintium_boots",
            new ArmorItem(EEArmorMaterials.ENDIMINTIUM, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()
                            .fireproof()));
    //Diamond Fragment
    public static final Item DIAMOND_FRAGMENT = registerItem("diamond_fragment",
            new Item(new FabricItemSettings()));

    //Tanzanite
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));

    //Food Items
    public static final Item TANZANITE_BEETROOT = registerItem("tanzanite_beetroot",
            new Item(new FabricItemSettings()
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(16)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 6000, 0), 1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 6000, 0), 0.5f)
                            .alwaysEdible().build())));
    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings()
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(16)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 1), 1.0f)

                            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 1), 1f)
                            .alwaysEdible().build())));
    public static final Item ENHANCED_BEETROOT = registerItem("enhanced_beetroot",
            new Item(new FabricItemSettings()
                    .maxCount(16)
                    .rarity(Rarity.RARE)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 500, 1), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500, 1), 0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 500, 9), 0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 500, 0), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 500, 0), 0.6f)
                            .alwaysEdible().build())));
    public static final Item ENCHANTED_ENHANCED_BEETROOT = registerItem("enchanted_enhanced_beetroot",
            new EnchantedGoldenAppleItem(new FabricItemSettings()
                    .maxCount(16)
                    .rarity(Rarity.EPIC)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 0), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1000, 0), 0.8f)
                            .alwaysEdible().build())));
    public static final Item CORRUPTED_BEETROOT = registerItem("corrupted_beetroot",
            new EnchantedGoldenAppleItem(new FabricItemSettings()
                    .maxCount(16).rarity(Rarity.EPIC)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(1.5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1000, 0), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000, 0), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 500, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 50, 5), 0.4f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 500, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 500, 1), 0.6f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 50, 4), 0.4f)
                            .alwaysEdible().build())));

    public static final Item RAW_ENDER_BULL = registerItem("raw_ender_bull",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).meat()
                            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 50, 0), 0.6f)
                            .build())));
    public static final Item COOKED_ENDER_BULL = registerItem("cooked_ender_bull",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).meat()
                            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 50, 0), 0.2f)
                            .build())));

    //Reinforced Obsidian Shard
    public static final Item REINFORCED_OBSIDIAN_SHARD = registerItem("reinforced_obsidian_shard",
            new Item(new FabricItemSettings()));

    //Sentry Disk
    public static final Item SENTRY_DISK = registerItem("sentry_disk",
            new BlindDiskItem(new FabricItemSettings()));

    //Shadow Fragment
    public static final Item SHADOW_SHARD = registerItem("shadow_shard",
            new Item(new FabricItemSettings()));

    //Enhanced Pearl Item
    public static final Item ENHANCED_PEARL = registerItem("enhanced_pearl",
            new EnhancedPearlItem(new FabricItemSettings().maxCount(16)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(EEItems.DIAMOND_FRAGMENT);
        entries.add(EEItems.RAW_TANZANITE);
        entries.add(EEItems.TANZANITE);
        entries.add(EEItems.CLITANIUM);
        entries.add(EEItems.ENDIMINTIUM_SCRAP);
        entries.add(EEItems.ENDIMINTIUM_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnhancedEnd.MOD_ID, name), item);
    }

    public static void registerEEItems() {
        EnhancedEnd.LOGGER.info("Registering Items for " + EnhancedEnd.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(EEItems::addItemsToIngredientItemGroup);*/
    }
}
