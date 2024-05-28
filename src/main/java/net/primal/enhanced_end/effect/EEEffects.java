package net.primal.enhanced_end.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;

public class EEEffects {
    public static final StatusEffect ACIDOSIS = registerStatusEffect(
            new AcidosisEffect(StatusEffectCategory.HARMFUL, 0xcb57c6));


    private static StatusEffect registerStatusEffect(StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(EnhancedEnd.MOD_ID, "acidosis"), statusEffect);
    }

    public static void registerEffects() {
        EnhancedEnd.LOGGER.info("Registering Effects for " + EnhancedEnd.MOD_ID);
    }
}
