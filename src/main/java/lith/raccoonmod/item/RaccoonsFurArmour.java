package lith.raccoonmod.item;

import lith.raccoonmod.armour.RaccoonFurStats;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RaccoonsFurArmour {

    public static final ArmorMaterial RACCOONSFUR = new RaccoonFurStats();

    public static Item RACCOON_HAT;
    public static Item RACCOON_COAT;
    public static Item RACCOON_LEGGINGS;
    public static Item RACCOON_PAWS;

    public static void register() {
        RACCOON_HAT = register(Registry.ITEM, new Identifier("raccoonmod", "raccoonhat"), new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
        RACCOON_COAT = register(Registry.ITEM, new Identifier("raccoonmod", "raccooncoat"), new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
        RACCOON_LEGGINGS = register(Registry.ITEM, new Identifier("raccoonmod", "raccoonleggings"), new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
        RACCOON_PAWS = register(Registry.ITEM, new Identifier("raccoonmod", "raccoonpaws"), new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    }
}




