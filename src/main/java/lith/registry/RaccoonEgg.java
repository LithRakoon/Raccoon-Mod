package lith.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class RaccoonEgg implements ModInitializer {

    // This Registers an instance of the raccoon egg
    public static final Item Racoon_Egg = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), Racoon_Egg);
    }
}
