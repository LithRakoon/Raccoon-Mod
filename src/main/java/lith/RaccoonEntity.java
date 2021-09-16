package lith;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;

import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RaccoonEntity implements ModInitializer {

    public static final EntityType<lith.entity.RaccoonEntity> RACCOON = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("raccoon","raccoonentity"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, lith.entity.RaccoonEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()

    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(RACCOON, lith.entity.RaccoonEntity.createMobAttributes());
    }
}
