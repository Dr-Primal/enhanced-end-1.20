package net.primal.enhanced_end.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;
import net.primal.enhanced_end.effect.EEEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(InGameHud.class)
public class AcidosisHeartsMixin {
    @Unique private static final Identifier ACIDOSIS_HEARTS = new Identifier(EnhancedEnd.MOD_ID, "textures/gui/acidosis_hearts.png");

    @Inject(method = "drawHeart", at = @At("HEAD"), cancellable = true)
    private void drawHeart(DrawContext context, InGameHud.HeartType type, int x, int y, int v, boolean blinking, boolean halfHeart, CallbackInfo ci) {
    if (!blinking && type == InGameHud.HeartType.NORMAL && MinecraftClient.getInstance().cameraEntity instanceof PlayerEntity player && (player.hasStatusEffect(EEEffects.ACIDOSIS))) {
        context.drawTexture(ACIDOSIS_HEARTS, x, y, halfHeart ? 9 : 0, 0, 9, 9);
            ci.cancel();
        }
    }
}