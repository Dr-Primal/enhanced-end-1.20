package net.primal.enhanced_end.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;
import net.primal.enhanced_end.block.EEBlocks;

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

    //Clitanium Stuff
    public static final Item CLITANIUM = registerItem("clitanium",
            new Item(new FabricItemSettings()));

    public static final Item CLITANIUM_PICKAXE = registerItem("clitanium_pickaxe",
            new PickaxeItem(EEToolMaterial.CLITANIUM, 1, -2.8f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_AXE = registerItem("clitanium_axe",
            new AxeItem(EEToolMaterial.CLITANIUM, 5, -3f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_SHOVEL = registerItem("clitanium_shovel",
            new ShovelItem(EEToolMaterial.CLITANIUM, 1.5f, -3f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_SWORD = registerItem("clitanium_sword",
            new SwordItem(EEToolMaterial.CLITANIUM, 3, -2.4f,
                    new FabricItemSettings()));
    public static final Item CLITANIUM_HOE = registerItem("clitanium_hoe",
            new HoeItem(EEToolMaterial.CLITANIUM, -3, 0f,
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

    /*private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add();

    }*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnhancedEnd.MOD_ID, name), item);
    }

    public static void registerEEItems() {
        EnhancedEnd.LOGGER.info("Registering Items for " + EnhancedEnd.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(EEItems::addItemsToIngredientItemGroup);*/
    }
}
