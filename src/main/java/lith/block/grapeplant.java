package lith.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class grapeplant implements ModInitializer {
    public static final Block GRAPE_PLANT = new Block(FabricBlockSettings.of(Material.BAMBOO_SAPLING).strength(1.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("raccoon", "grapeplant"), GRAPE_PLANT);
        Registry.register(Registry.ITEM, new Identifier("raccoon", "grapeplant"), new BlockItem(GRAPE_PLANT, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
