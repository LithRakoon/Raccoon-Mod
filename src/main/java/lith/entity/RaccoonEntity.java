package lith.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class RaccoonEntity extends PathAwareEntity {

    public RaccoonEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(EntityType, world);
    }
}
