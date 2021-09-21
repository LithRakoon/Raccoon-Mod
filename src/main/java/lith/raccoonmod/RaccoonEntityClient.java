package lith.raccoonmod;

import lith.raccoonmod.client.renderer.RaccoonEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


@Environment(EnvType.CLIENT)
public class RaccoonEntityClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(RaccoonEntity.CUBE, (dispatcher, context) -> {
            return new RaccoonEntityRenderer(dispatcher);
        });
    }
}
