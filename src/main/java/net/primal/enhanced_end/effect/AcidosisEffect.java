package net.primal.enhanced_end.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.Difficulty;

public class AcidosisEffect extends StatusEffect {
    protected AcidosisEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == EEEffects.ACIDOSIS) {
            Difficulty difficulty = entity.getWorld().getDifficulty();
            if (difficulty == Difficulty.PEACEFUL) {
                entity.damage(entity.getDamageSources().dragonBreath(), 0.5f);
            }
            else if (difficulty == Difficulty.EASY) {
                entity.damage(entity.getDamageSources().dragonBreath(), 1.0f);
            }
            else if (difficulty == Difficulty.NORMAL) {
                entity.damage(entity.getDamageSources().dragonBreath(), 1.5f);
            }
            else if (difficulty == Difficulty.HARD) {
                entity.damage(entity.getDamageSources().dragonBreath(), 2.0f);
            }
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == EEEffects.ACIDOSIS) {
            int i = 10 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            return true;
        }
        return true;
    }
}
