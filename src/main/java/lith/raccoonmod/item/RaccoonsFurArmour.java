package lith.raccoonmod.item;

import lith.raccoonmod.armour.RaccoonFurStats;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RaccoonsFurArmour {

    public static final ArmorMaterial RACCOONS_FUR = new RaccoonFurStats();

    public static final Item RACCOON_HAT = new ArmorItem(
            RACCOONS_FUR,
            EquipmentSlot.HEAD,
            new Item.Settings().group(ItemGroup.COMBAT)
    );

    public static final Item RACCOON_COAT = new ArmorItem(
            RACCOONS_FUR,
            EquipmentSlot.CHEST,
            new Item.Settings().group(ItemGroup.COMBAT)
    );

    public static final Item RACCOON_LEGGINGS = new ArmorItem(
            RACCOONS_FUR,
            EquipmentSlot.LEGS,
            new Item.Settings().group(ItemGroup.COMBAT)
    );

    public static final Item RACCOON_PAWS = new ArmorItem(
            RACCOONS_FUR,
            EquipmentSlot.FEET,
            new Item.Settings().group(ItemGroup.COMBAT)

    );

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonhat"), RACCOON_HAT);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccooncoat"), RACCOON_COAT);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonleggings"), RACCOON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("raccoonmod", "raccoonpaws"), RACCOON_PAWS);
    }
}



