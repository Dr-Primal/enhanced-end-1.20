package net.primal.enhanced_end.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;

public class EETags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(EnhancedEnd.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MIDNIGHT_STEMS=
                createTag("midnight_stems");

        public static final TagKey<Item> CORLITE_STEMS =
                createTag("corlite_stems");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(EnhancedEnd.MOD_ID, name));
        }
    }
}