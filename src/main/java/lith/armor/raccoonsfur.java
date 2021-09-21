package lith.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;

public class raccoonsfur implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{112, 180, 175, 130};
    private static final int[] PROTECTION_VALUES = new int[]{2, 5, 4, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 23;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public net.minecraft.sound.SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.);
    }



}
