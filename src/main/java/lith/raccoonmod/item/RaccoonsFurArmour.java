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

    public static final Item RACCOONHAT = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item RACCOONCOAT = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item RACCOONLEGGINGS = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item RACCOONPAWS = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonhat"), RACCOONHAT);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccooncoat"), RACCOONCOAT);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonleggings"), RACCOONLEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonpaws"), RACCOONPAWS);
    }
}




