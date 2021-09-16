package lith.client.renderer;

import lith.entity.RaccoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;

public class RaccoonEntityRenderer extends MobEntityRenderer<RaccoonEntity, RaccoonEntityRenderer> {

    public RaccoonEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RaccoonEntityModel);
    }
}
