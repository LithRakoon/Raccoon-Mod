package lith.raccoonmod.client.renderer;

import lith.raccoonmod.client.model.CubeEntityModel;
import lith.raccoonmod.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RaccoonEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {
    public RaccoonEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier("raccoonmod", "textures/entity/raccoon/raccoon.png");
    }
}
