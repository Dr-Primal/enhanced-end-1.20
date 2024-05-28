package net.primal.enhanced_end.mixin;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.primal.enhanced_end.effect.EEEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(AreaEffectCloudEntity.class)
public class AreaEffectCloudEntityMixin {

    @Shadow private int duration;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        AreaEffectCloudEntity cloud = (AreaEffectCloudEntity) (Object) this;
        World world = cloud.getWorld();

        if (!world.isClient && cloud.getParticleType() == ParticleTypes.DRAGON_BREATH) {
            List<PlayerEntity> players = world.getEntitiesByClass(PlayerEntity.class, cloud.getBoundingBox(), player -> true);
            for (PlayerEntity player : players) {
                if (!player.hasStatusEffect(EEEffects.ACIDOSIS)) {
                    if (world.getDifficulty() == Difficulty.PEACEFUL) {
                        duration = 0;
                    }
                    else if (world.getDifficulty() == Difficulty.EASY) {
                        duration = 200;
                    }
                    else if (world.getDifficulty() == Difficulty.NORMAL) {
                        duration = 400;
                    }
                    else if (world.getDifficulty() == Difficulty.HARD) {
                        duration = 600;
                    }
                    player.addStatusEffect(new StatusEffectInstance(EEEffects.ACIDOSIS, duration, 0, false, true, true));
                }
            }
        }
    }
}