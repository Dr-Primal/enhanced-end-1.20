package net.primal.enhanced_end.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SignItem;
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
