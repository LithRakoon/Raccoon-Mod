package lith.raccoonmod.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RaccoonsFur implements ModInitializer {

    public static Item RACCOONS_FUR;

    @Override
    public void onInitialize() {
        RACCOONS_FUR = Registry.register(Registry.ITEM, new Identifier( "raccoonmod", "raccoonsfur"), new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    }
}