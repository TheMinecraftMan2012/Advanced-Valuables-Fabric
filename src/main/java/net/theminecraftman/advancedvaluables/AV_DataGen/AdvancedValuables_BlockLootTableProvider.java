package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_BlockLootTableProvider extends FabricBlockLootTableProvider
{
    protected AdvancedValuables_BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.FUSION_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RUBY_BLOCK);

        addDrop(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
        addDrop(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);

        addDrop(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, 2, 4));
        addDrop(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, 2, 4));
        addDrop(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, 2, 4));
        addDrop(AdvancedValuables_BlockClass.RED_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.RED_GARNET_ORE, AdvancedValuables_ItemClass.RED_RAW_GARNET, 2, 5));
        addDrop(AdvancedValuables_BlockClass.BLUE_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.BLUE_GARNET_ORE, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, 2, 5));
        addDrop(AdvancedValuables_BlockClass.PINK_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.PINK_GARNET_ORE, AdvancedValuables_ItemClass.PINK_RAW_GARNET, 2, 5));
        addDrop(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, 2, 5));
        addDrop(AdvancedValuables_BlockClass.FUSION_ORE, multipleOreDrops(AdvancedValuables_BlockClass.FUSION_ORE, AdvancedValuables_ItemClass.RAW_FUSION_GEM, 5, 10));
        addDrop(AdvancedValuables_BlockClass.RUBY_ORE, multipleOreDrops(AdvancedValuables_BlockClass.RUBY_ORE, AdvancedValuables_ItemClass.RAW_RUBY, 2, 6));

        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, 2, 5));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, 2, 5));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, 2, 5));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE, AdvancedValuables_ItemClass.RED_RAW_GARNET, 2, 6));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, 2, 6));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE, AdvancedValuables_ItemClass.PINK_RAW_GARNET, 2, 6));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, 2, 6));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE, AdvancedValuables_ItemClass.RAW_FUSION_GEM, 6, 12));
        addDrop(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE, multipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE, AdvancedValuables_ItemClass.RAW_RUBY, 2, 7));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops)
    {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
