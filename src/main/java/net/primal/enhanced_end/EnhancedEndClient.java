package net.primal.enhanced_end;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.entity.EEEntities;

public class EnhancedEndClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(EEBlocks.MIDNIGHT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EEBlocks.MIDNIGHT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EEBlocks.CORLITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EEBlocks.CORLITE_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(EEBlocks.DRAGON_FIRE, RenderLayer.getCutout());

        StrippableBlockRegistry.register(EEBlocks.MIDNIGHT_STEM, EEBlocks.STRIPPED_MIDNIGHT_STEM);
        StrippableBlockRegistry.register(EEBlocks.MIDNIGHT_HYPHAE, EEBlocks.STRIPPED_MIDNIGHT_HYPHAE);
        StrippableBlockRegistry.register(EEBlocks.CORLITE_STEM, EEBlocks.STRIPPED_CORLITE_STEM);
        StrippableBlockRegistry.register(EEBlocks.CORLITE_HYPHAE, EEBlocks.STRIPPED_CORLITE_HYPHAE);

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        EEBlocks.MIDNIGHT_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        EEBlocks.MIDNIGHT_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        EEBlocks.CORLITE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        EEBlocks.CORLITE_HANGING_SIGN_TEXTURE));

        EntityRendererRegistry.register(EEEntities.BlindDiskEntityEntityType, FlyingItemEntityRenderer::new);


        System.out.println("Initializing Enhanced End On the Client Side!");
    }
}
