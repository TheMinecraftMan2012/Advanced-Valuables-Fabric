package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_BlockTagsProvider extends FabricTagProvider.BlockTagProvider
{
    public AdvancedValuables_BlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.FUSION_BLOCK)
                .add(AdvancedValuables_BlockClass.RUBY_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK)
                .add(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.RED_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.PINK_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.FUSION_ORE)
                .add(AdvancedValuables_BlockClass.RUBY_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.RUBY_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK)
                .add(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK)
                .add(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.RED_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.PINK_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.RUBY_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(AdvancedValuables_BlockClass.FUSION_BLOCK)
                .add(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK)
                .add(AdvancedValuables_BlockClass.FUSION_ORE)
                .add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE);
    }
}
