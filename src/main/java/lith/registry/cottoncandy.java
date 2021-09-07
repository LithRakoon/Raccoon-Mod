package lith.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class cottoncandy implements ModInitializer {
    public static final Item COTTONCANDY = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("raccoon","cottoncandy"), COTTONCANDY);
    }

}
