package lith.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class RaccoonEgg implements ModInitializer {

    // racoon egg pog
    public static final Item Raccoon_egg = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("TheRaccoonMod", "Raccoon_egg.png"), Raccoon_egg);
    }
}
