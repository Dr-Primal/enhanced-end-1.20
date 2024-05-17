package net.primal.enhanced_end.item.custom;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class EndimintiumSmithingTemplateItem extends SmithingTemplateItem {
    public EndimintiumSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE =
            new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE =
            new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE =
            new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE =
            new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE =
            new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE =
            new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE =
            new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE =
            new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE =
            new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE =
            new Identifier("item/empty_slot_ingot");

    private static final Formatting TITLE_FORMATTING
            = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING
            = Formatting.LIGHT_PURPLE;
    private static final Text ENDIMINTIUM_UPGRADE_TEXT
            = Text.translatable(Util.createTranslationKey("upgrade",
            new Identifier("endimintium_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text ENDIMINTIUM_UPGRADE_APPLIES_TO_TEXT
            = Text.translatable(Util.createTranslationKey("item",
            new Identifier("smithing_template.endimintium_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text ENDIMINTIUM_UPGRADE_INGREDIENTS_TEXT
            = Text.translatable(Util.createTranslationKey("item",
            new Identifier("smithing_template.endimintium_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text ENDIMINTIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT
            = Text.translatable(Util.createTranslationKey("item",
            new Identifier("smithing_template.endimintium_upgrade.base_slot_description")));
    private static final Text ENDIMINTIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT
            = Text.translatable(Util.createTranslationKey("item",
            new Identifier("smithing_template.endimintium_upgrade.additions_slot_description")));

    private static List<Identifier> getEndimintiumUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
    private static List<Identifier> getEndimintiumUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    public static EndimintiumSmithingTemplateItem createEndimintiumUpgrade() {
        return new EndimintiumSmithingTemplateItem(
                ENDIMINTIUM_UPGRADE_APPLIES_TO_TEXT,
                ENDIMINTIUM_UPGRADE_INGREDIENTS_TEXT,
                ENDIMINTIUM_UPGRADE_TEXT,
                ENDIMINTIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                ENDIMINTIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                EndimintiumSmithingTemplateItem.getEndimintiumUpgradeEmptyBaseSlotTextures(),
                EndimintiumSmithingTemplateItem.getEndimintiumUpgradeEmptyAdditionsSlotTextures());
    }
}
