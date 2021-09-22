package lith.raccoonmod.armour;

import lith.raccoonmod.item.RaccoonsFur;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.jetbrains.annotations.NotNull;

public class RaccoonFurStats implements ArmorMaterial {

    private static final int[] BASE_DURABILTIY = new int[] {2, 4, 7, 2};
    private static final int[] PROTECTION_VALUES = new int[] {2, 5, 4, 2};

    @Override
    public int getDurability(@NotNull EquipmentSlot slot) {
        return BASE_DURABILTIY[slot.getEntitySlotId()] * 14;
    }

    @Override
    public int getProtectionAmount(@NotNull EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RaccoonsFur.RACCOONS_FUR);
    }

    @Override
    public String getName() {
        return "raccoonsfur";
    }

    @Override
    public float getToughness() {
        return 0.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}

