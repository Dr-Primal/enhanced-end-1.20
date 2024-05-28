package net.primal.enhanced_end.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.primal.enhanced_end.EnhancedEnd;
import net.primal.enhanced_end.entity.projectile.thrown.BlindDiskEntity;

public class EEEntities {

    //Projectiles
    public static final EntityType<BlindDiskEntity> BlindDiskEntityEntityType = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EnhancedEnd.MOD_ID, "blind_disk"),
            FabricEntityTypeBuilder.<BlindDiskEntity>create(SpawnGroup.MISC, BlindDiskEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.1f))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build()
    );
}
