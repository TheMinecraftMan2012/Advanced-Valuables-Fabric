package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class AdvancedValuables_RecipeProvider extends FabricRecipeProvider
{
    public AdvancedValuables_RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter)
    {

        return new RecipeGenerator(wrapperLookup, recipeExporter)
        {
            @Override
            public void generate()
            {
                List<ItemConvertible> BLUE_SAPPHIRE_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE,
                        AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE
                );
                List<ItemConvertible> RED_SAPPHIRE_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE,
                        AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE
                );
                List<ItemConvertible> GREEN_SAPPHIRE_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE,
                        AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE
                );
                List<ItemConvertible> RED_GARNET_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.RED_RAW_GARNET,
                        AdvancedValuables_BlockClass.RED_GARNET_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE
                );
                List<ItemConvertible> BLUE_GARNET_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.BLUE_RAW_GARNET,
                        AdvancedValuables_BlockClass.BLUE_GARNET_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE
                );
                List<ItemConvertible> PINK_GARNET_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.PINK_RAW_GARNET,
                        AdvancedValuables_BlockClass.PINK_GARNET_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE
                );
                List<ItemConvertible> YELLOW_GARNET_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.YELLOW_RAW_GARNET,
                        AdvancedValuables_BlockClass.YELLOW_GARNET_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE
                );

                List<ItemConvertible> FUSION_GEM_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.RAW_FUSION_GEM,
                        AdvancedValuables_BlockClass.FUSION_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE
                );
                List<ItemConvertible> RUBY_SMELTING_ITEMS = List.of(
                        AdvancedValuables_ItemClass.RAW_RUBY,
                        AdvancedValuables_BlockClass.RUBY_ORE,
                        AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE
                );

                // -- Raw Blocks - Solid Blocks -- //
                List<ItemConvertible> BLUE_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
                List<ItemConvertible> RED_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
                List<ItemConvertible> GREEN_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
                List<ItemConvertible> RED_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
                List<ItemConvertible> BLUE_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
                List<ItemConvertible> PINK_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
                List<ItemConvertible> YELLOW_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
                List<ItemConvertible> FUSION_GEM_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
                List<ItemConvertible> RUBY_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);

                // Add-ons
                List<ItemConvertible> IRON_SMELTING_BLOCK = List.of(Blocks.RAW_IRON_BLOCK);
                List<ItemConvertible> GOLD_SMELTING_BLOCK = List.of(Blocks.RAW_GOLD_BLOCK);
                List<ItemConvertible> COPPER_SMELTING_BLOCK = List.of(Blocks.RAW_COPPER_BLOCK);

                // -- Shaped Crafting -- // -- Solid Block -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Shaped Crafting -- // -- Raw Block -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RED_RAW_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_RAW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_RAW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.BLUE_RAW_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_RAW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_RAW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.PINK_RAW_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_RAW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_RAW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_RAW_GARNET)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RAW_FUSION_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RAW_FUSION_GEM)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RAW_FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.RAW_FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RAW_RUBY_BLOCK)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern("aaa")
                        .input('a', AdvancedValuables_ItemClass.RAW_RUBY)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RAW_RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RAW_RUBY))
                        .offerTo(exporter);

                // -- Shapeless Crafting -- // -- Solid Blocks -- //
                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.RED_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RED_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RED_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM, 9)
                        .input(AdvancedValuables_BlockClass.FUSION_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.FUSION_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.FUSION_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY, 9)
                        .input(AdvancedValuables_BlockClass.RUBY_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RUBY_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RUBY_BLOCK))
                        .offerTo(exporter);

                // -- Shapeless Crafting -- // -- Raw Blocks -- //
                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, 9)
                        .input(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_RAW_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, 9)
                        .input(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_FUSION_GEM, 9)
                        .input(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_RUBY, 9)
                        .input(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK)
                        .criterion(hasItem(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK), conditionsFromItem(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK))
                        .offerTo(exporter);

                // -- Smelting -- //
                offerSmelting(BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, 0.2f, 200, "blue_sapphire");
                offerSmelting(RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE, 0.2f, 200, "red_sapphire");
                offerSmelting(GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, 0.2f, 200, "green_sapphire");

                offerSmelting(RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET, 0.2f, 200, "red_garnet");
                offerSmelting(BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET, 0.2f, 200, "blue_garnet");
                offerSmelting(PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET, 0.2f, 200, "pink_garnet");
                offerSmelting(YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET, 0.2f, 200, "yellow_garnet");

                offerSmelting(FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM, 0.2f, 200, "fusion_gem");
                offerSmelting(RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY, 0.2f, 200, "ruby");

                // -- Blasting -- //
                offerBlasting(BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, 0.2f, 100, "blue_sapphire");
                offerBlasting(RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE, 0.2f, 100, "red_sapphire");
                offerBlasting(GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, 0.2f, 100, "green_sapphire");

                offerBlasting(RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET, 0.2f, 100, "red_garnet");
                offerBlasting(BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET, 0.2f, 100, "blue_garnet");
                offerBlasting(PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET, 0.2f, 100, "pink_garnet");
                offerBlasting(YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET, 0.2f, 100, "yellow_garnet");

                offerBlasting(FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM, 0.2f, 100, "fusion_gem");
                offerBlasting(RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY, 0.2f, 100, "ruby");

                // -- Tools Crafting -- //
                // -- Pickaxe -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_PICKAXE)
                        .pattern("aaa")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Axe -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_AXE)
                        .pattern("aa ")
                        .pattern("ab ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Shovel -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_SHOVEL)
                        .pattern(" a ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Hoe -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_HOE)
                        .pattern("aa ")
                        .pattern(" b ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Sword -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.GREEN_SAPPHIRE)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RED_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.BLUE_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.PINK_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.YELLOW_GARNET)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.FUSION_GEM)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_SWORD)
                        .pattern(" a ")
                        .pattern(" a ")
                        .pattern(" b ")
                        .input('a', AdvancedValuables_ItemClass.RUBY)
                        .input('b', Items.STICK)
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                // -- Smelting (Raw Blocks - Solid Blocks) -- //
                offerSmelting(BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, 0.25f, 200, "blue_sapphire");
                offerSmelting(RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, 0.25f, 200, "red_sapphire");
                offerSmelting(GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, 0.25f, 200, "green_sapphire");
                offerSmelting(RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, 0.25f, 200, "red_garnet");
                offerSmelting(BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, 0.25f, 200, "blue_garnet");
                offerSmelting(PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, 0.25f, 200, "pink_garnet");
                offerSmelting(YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, 0.25f, 200, "yellow_garnet");
                offerSmelting(FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK, 0.25f, 200, "fusion_gem");
                offerSmelting(RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK, 0.25f, 200, "ruby");

                // -- Blasting (Raw Blocks - Solid Blocks) -- //
                offerBlasting(BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, 0.25f, 100, "blue_sapphire");
                offerBlasting(RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, 0.25f, 100, "red_sapphire");
                offerBlasting(GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, 0.25f, 100, "green_sapphire");
                offerBlasting(RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, 0.25f, 100, "red_garnet");
                offerBlasting(BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, 0.25f, 100, "blue_garnet");
                offerBlasting(PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, 0.25f, 100, "pink_garnet");
                offerBlasting(YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, 0.25f, 200, "yellow_garnet");
                offerBlasting(FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK, 0.25f, 100, "fusion_gem");
                offerBlasting(RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK, 0.25f, 100, "ruby");

                // -- Decor Blocks -- //
                createStairsRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL, AdvancedValuables_ItemClass.RED_SAPPHIRE);
                createDoorRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.RED_SAPPHIRE))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL, AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
                createDoorRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL, AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
                createDoorRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .criterion(hasItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE), conditionsFromItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.RED_GARNET_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_GARNET_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.RED_GARNET_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.RED_GARNET_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RED_GARNET_WALL, AdvancedValuables_ItemClass.RED_GARNET);
                createDoorRecipe(AdvancedValuables_BlockClass.RED_GARNET_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RED_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.RED_GARNET))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_GARNET_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.BLUE_GARNET_WALL, AdvancedValuables_ItemClass.BLUE_GARNET);
                createDoorRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.BLUE_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.BLUE_GARNET))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.PINK_GARNET_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.PINK_GARNET_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.PINK_GARNET_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.PINK_GARNET_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.PINK_GARNET_WALL, AdvancedValuables_ItemClass.PINK_GARNET);
                createDoorRecipe(AdvancedValuables_BlockClass.PINK_GARNET_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.PINK_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.PINK_GARNET))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.YELLOW_GARNET_WALL, AdvancedValuables_ItemClass.YELLOW_GARNET);
                createDoorRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .criterion(hasItem(AdvancedValuables_ItemClass.YELLOW_GARNET), conditionsFromItem(AdvancedValuables_ItemClass.YELLOW_GARNET))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.RUBY_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RUBY_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.RUBY_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.RUBY_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.RUBY_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.RUBY_WALL, AdvancedValuables_ItemClass.RUBY);
                createDoorRecipe(AdvancedValuables_BlockClass.RUBY_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.RUBY_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.RUBY))
                        .criterion(hasItem(AdvancedValuables_ItemClass.RUBY), conditionsFromItem(AdvancedValuables_ItemClass.RUBY))
                        .offerTo(exporter);

                createStairsRecipe(AdvancedValuables_BlockClass.FUSION_STAIRS, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.FUSION_SLAB, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createButtonRecipe(AdvancedValuables_BlockClass.FUSION_BUTTON, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createFenceRecipe(AdvancedValuables_BlockClass.FUSION_FENCE, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createFenceGateRecipe(AdvancedValuables_BlockClass.FUSION_FENCE_GATE, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, AdvancedValuables_BlockClass.FUSION_WALL, AdvancedValuables_ItemClass.FUSION_GEM);
                createDoorRecipe(AdvancedValuables_BlockClass.FUSION_DOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);
                createTrapdoorRecipe(AdvancedValuables_BlockClass.FUSION_TRAPDOOR, Ingredient.ofItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .criterion(hasItem(AdvancedValuables_ItemClass.FUSION_GEM), conditionsFromItem(AdvancedValuables_ItemClass.FUSION_GEM))
                        .offerTo(exporter);

                // -- Add-ons -- //
                offerBlasting(IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
                offerBlasting(GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
                offerBlasting(COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

                offerSmelting(IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
                offerSmelting(GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
                offerSmelting(COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

                // -- Hammer Wireframe -- //
                createShaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .pattern("aaa")
                        .pattern("aaa")
                        .pattern(" a ")
                        .input('a', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);

                // -- Hammer Crafting -- //
                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.RED_SAPPHIRE_HAMMER)
                        .input(AdvancedValuables_ItemClass.RED_SAPPHIRE).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HAMMER)
                        .input(AdvancedValuables_ItemClass.BLUE_SAPPHIRE).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HAMMER)
                        .input(AdvancedValuables_ItemClass.GREEN_SAPPHIRE).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.RED_GARNET_HAMMER)
                        .input(AdvancedValuables_ItemClass.RED_GARNET).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.BLUE_GARNET_HAMMER)
                        .input(AdvancedValuables_ItemClass.BLUE_GARNET).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.PINK_GARNET_HAMMER)
                        .input(AdvancedValuables_ItemClass.PINK_GARNET).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.YELLOW_GARNET_HAMMER)
                        .input(AdvancedValuables_ItemClass.YELLOW_GARNET).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.FUSION_HAMMER)
                        .input(AdvancedValuables_ItemClass.FUSION_GEM).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, AdvancedValuables_ItemClass.RUBY_HAMMER)
                        .input(AdvancedValuables_ItemClass.RUBY).input(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                        .criterion(hasItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME), conditionsFromItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName()
    {
        return "My Recipe Generator";
    }
}
