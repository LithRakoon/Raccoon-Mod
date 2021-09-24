package lith.raccoonmod.registry;

import lith.raccoonmod.init.RaccoonsFurArmour;
import net.fabricmc.api.ModInitializer;

public class RaccoonAmour implements ModInitializer {

    public static String MOD_ID = "raccoonmod";

    @Override
    public void onInitialize() {
        RaccoonsFurArmour.register();
    }
}
