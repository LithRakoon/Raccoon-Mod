package lith.raccoonmod.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TrashBlock implements ModInitializer {
    public static Block TRASH_BLOCK;

    @Override
    public void onInitialize() {
        TRASH_BLOCK = Registry.register(Registry.BLOCK, new Identifier("raccoonmod", "trash_block"), new Block(FabricBlockSettings.of(Material.SOIL).strength(4.0f)));
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "trash_block"), new BlockItem(TRASH_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}