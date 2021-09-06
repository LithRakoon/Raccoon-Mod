package lith.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class raccoonegg implements ModInitializer {

	// racoon egg pog
	public static final Item RACCOON_EGG = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("theraccoonmod", "raccoon_egg"), RACCOON_EGG);
	}
}