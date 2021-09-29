package lith.raccoonmod;

import lith.raccoonmod.entity.RaccoonEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Raccoon implements ModInitializer {

    public static final EntityType<RaccoonEntity> RACCOON = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("raccoonmod", "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RaccoonEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(RACCOON, RaccoonEntity.createMobAttributes());
    }
}
