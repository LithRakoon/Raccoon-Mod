package lith.raccoonmod.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class raccoonegg implements ModInitializer {

    // racoon egg pog
    public static Item RACCOON_EGG;

    @Override
    public void onInitialize() {
        RACCOON_EGG = Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonegg"), new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
    }
}