package net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

import java.util.function.Supplier;

public enum AdvancedValuables_ToolsMaterials implements ToolMaterial
{
    RED_SAPPHIRE(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RED_SAPPHIRE)),
    BLUE_SAPPHIRE(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.BLUE_SAPPHIRE)),
    GREEN_SAPPHIRE(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.GREEN_SAPPHIRE)),

    RED_GARNET(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RED_GARNET)),
    BLUE_GARNET(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.BLUE_GARNET)),
    PINK_GARNET(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.PINK_GARNET)),
    YELLOW_GARNET(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.YELLOW_GARNET)),

    FUSION_GEM(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_FUSION_TOOL, 2500, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.FUSION_GEM)),
    RUBY(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_RUBY_TOOL, 2000, 7f, 1.5f, 22, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RUBY));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    AdvancedValuables_ToolsMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient)
    {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() { return this.itemDurability; }

    @Override
    public float getMiningSpeedMultiplier() { return this.miningSpeed; }

    @Override
    public float getAttackDamage() { return this.attackDamage; }

    @Override
    public TagKey<Block> getInverseTag() { return this.inverseTag; }

    @Override
    public int getEnchantability() { return this.enchantability; }

    @Override
    public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }
}
