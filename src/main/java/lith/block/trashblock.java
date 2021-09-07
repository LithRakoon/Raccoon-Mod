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

public class trashblock implements ModInitializer {
    public static final Block TRASH_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).strength(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("raccoon", "trashblock"), TRASH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("raccoon", "trashblock"), new BlockItem(TRASH_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
