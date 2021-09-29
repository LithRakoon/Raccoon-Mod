package lith.raccoonmod.client.renderer;

import lith.raccoonmod.EntityClient;
import lith.raccoonmod.client.model.CubeEntityModel;
import lith.raccoonmod.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {
    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(EntityClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier("raccoonmod", "textures/entity/raccoon/raccoon.png");
    }
}
