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

import static net.minecraft.util.registry.Registry.register;

public class trashblock implements ModInitializer {
    public static Block TRASH_BLOCK;

    @Override
    public void onInitialize() {
        TRASH_BLOCK = register(Registry.BLOCK, new Identifier("raccoonmod", "trashblock"), new Block(FabricBlockSettings.of(Material.SOIL).strength(4.0f)));
        register(Registry.ITEM, new Identifier("raccoonmod", "trashblock"), new BlockItem(TRASH_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}