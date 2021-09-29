package lith.raccoonmod.client.renderer;

import lith.raccoonmod.RaccoonEntityClient;
import lith.raccoonmod.client.model.RaccoonEntityModel;
import lith.raccoonmod.entity.RaccoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RaccoonEntityRenderer extends MobEntityRenderer<RaccoonEntity, RaccoonEntityModel> {
    public RaccoonEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RaccoonEntityModel(context.getPart(RaccoonEntityClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(RaccoonEntity entity) {
        return new Identifier("raccoonmod", "textures/entity/raccoon/raccoon.png");
    }
}
