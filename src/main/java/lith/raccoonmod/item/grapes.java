package lith.raccoonmod.item;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.register;


public class grapes implements ModInitializer {
    public static Item GRAPES;

    @Override
    public void onInitialize() {
        GRAPES = register(Registry.ITEM, new Identifier("raccoonmod", "grapes"), new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build())));
    }
}
