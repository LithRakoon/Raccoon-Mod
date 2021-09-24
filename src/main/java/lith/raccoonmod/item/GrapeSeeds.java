package lith.raccoonmod.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GrapeSeeds implements ModInitializer {
    public static Item GRAPE_SEEDS;

    @Override
    public void onInitialize() {
        GRAPE_SEEDS = Registry.register(Registry.ITEM, new Identifier("raccoonmod", "grape_seeds"), new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build())));
    }
}
