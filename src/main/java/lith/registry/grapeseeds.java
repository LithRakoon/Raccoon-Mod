package lith.registry;

import lith.block.grapeplant;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class grapeseeds implements ModInitializer {

    public static final CropBlock grapeplant = new grapeplant(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item GRAPESEEDS = new AliasedBlockItem(grapeseeds.grapeplant, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("raccoon", "grapeseeds"), GRAPESEEDS);
        Registry.register(Registry.BLOCK, new Identifier("raccoon", "grapeplant"), grapeplant);
    }
}
