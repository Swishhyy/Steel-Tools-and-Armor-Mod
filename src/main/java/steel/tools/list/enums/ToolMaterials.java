package steel.tools.list.enums;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import steel.tools.init.ItemInit;
import steel.tools.list.TagList;

public enum ToolMaterials implements ToolMaterial {
    STEEL(
            3430,
            10.0f,
            3.5f,
            TagList.Blocks.INCORRECT_FOR_STEEL_TOOL,
            15,
            Ingredient.ofItems(ItemInit.STEEL_INGOT)
    ),
    REINFORCED_STEEL(
            6430,
            20.0f,
            7.5f,
            TagList.Blocks.INCORRECT_FOR_STEEL_TOOL,
            20,
            Ingredient.ofItems(ItemInit.REINFORCED_STEEL_INGOT)
    );

    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
