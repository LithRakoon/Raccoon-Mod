package lith.raccoonmod.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.register;

public class cottoncandy implements ModInitializer {
    public static Item COTTON_CANDY;

    @Override
    public void onInitialize() {
        COTTON_CANDY= Registry.register(Registry.ITEM, new Identifier("raccoonmod","cottoncandy"), new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2).snack().build())));
    }

}
