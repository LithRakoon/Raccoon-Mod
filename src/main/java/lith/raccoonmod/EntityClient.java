package lith.raccoonmod;

import lith.raccoonmod.client.model.CubeEntityModel;
import lith.raccoonmod.client.renderer.CubeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EntityClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("raccoonmod", "cube"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Entity.CUBE, (context) -> {
            return new CubeEntityRenderer(context);
        });

      EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, CubeEntityModel::getTexturedModeldata);
    }
}
