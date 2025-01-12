package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_ItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public AdvancedValuables_ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.VALUABLE_ITEMS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE,
                    AdvancedValuables_ItemClass.BLUE_SAPPHIRE,
                    AdvancedValuables_ItemClass.GREEN_SAPPHIRE,
                    AdvancedValuables_ItemClass.RED_GARNET,
                    AdvancedValuables_ItemClass.BLUE_GARNET,
                    AdvancedValuables_ItemClass.PINK_GARNET,
                    AdvancedValuables_ItemClass.YELLOW_GARNET,
                    AdvancedValuables_ItemClass.FUSION_GEM,
                    AdvancedValuables_ItemClass.RUBY,
                    AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE,
                    AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE,
                    AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE,
                    AdvancedValuables_ItemClass.RED_RAW_GARNET,
                    AdvancedValuables_ItemClass.BLUE_RAW_GARNET,
                    AdvancedValuables_ItemClass.PINK_RAW_GARNET,
                    AdvancedValuables_ItemClass.YELLOW_RAW_GARNET,
                    AdvancedValuables_ItemClass.RAW_FUSION_GEM,
                    AdvancedValuables_ItemClass.RAW_RUBY
                );

        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.RED_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.RED_SAPPHIRE);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.BLUE_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.GREEN_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE);

        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.RED_GARNET_REPAIR).add(AdvancedValuables_ItemClass.RED_GARNET);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR).add(AdvancedValuables_ItemClass.BLUE_GARNET);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.PINK_GARNET_REPAIR).add(AdvancedValuables_ItemClass.PINK_GARNET);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.YELLOW_GARNET_REPAIR).add(AdvancedValuables_ItemClass.YELLOW_GARNET);

        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.FUSION_REPAIR).add(AdvancedValuables_ItemClass.FUSION_GEM);
        getOrCreateTagBuilder(AdvancedValuables_Tags.Items.RUBY_REPAIR).add(AdvancedValuables_ItemClass.RUBY);
    }
}
