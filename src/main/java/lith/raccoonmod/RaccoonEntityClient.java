package lith.raccoonmod;

import lith.raccoonmod.client.model.RaccoonEntityModel;
import lith.raccoonmod.client.renderer.RaccoonEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class RaccoonEntityClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("raccoonmod", "cube"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Raccoon.RACCOON, RaccoonEntityRenderer::new);

      EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, RaccoonEntityModel::getTexturedModeldata);
    }
}
