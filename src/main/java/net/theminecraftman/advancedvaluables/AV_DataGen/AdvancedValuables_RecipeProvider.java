package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_RecipeProvider extends FabricRecipeProvider
{
    public AdvancedValuables_RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter)
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

        // -- Shaped Crafting -- //
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_SAPPHIRE, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, exporter);

        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RED_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_GARNET, exporter);

        generateShapedBlockRecipe(AdvancedValuables_BlockClass.FUSION_BLOCK, AdvancedValuables_ItemClass.FUSION_GEM, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RUBY_BLOCK, AdvancedValuables_ItemClass.RUBY, exporter);

        generateShapedBlockRecipe(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, exporter);

        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_RAW_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_RAW_GARNET, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, exporter);

        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK, AdvancedValuables_ItemClass.RAW_FUSION_GEM, exporter);
        generateShapedBlockRecipe(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK, AdvancedValuables_ItemClass.RAW_RUBY, exporter);

        // -- Shapeless Crafting -- //
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "blue_sapphire", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_SAPPHIRE, "red_sapphire", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "green_sapphire", exporter);

        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RED_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_GARNET, "red_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_GARNET, "blue_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_GARNET, "pink_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_GARNET, "yellow_garnet", exporter);

        generateBlockToItemRecipe(AdvancedValuables_BlockClass.FUSION_BLOCK, AdvancedValuables_ItemClass.FUSION_GEM, "fusion_gem", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RUBY_BLOCK, AdvancedValuables_ItemClass.RUBY, "ruby", exporter);

        generateBlockToItemRecipe(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, "blue_sapphire", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, "red_sapphire", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, "green_sapphire", exporter);

        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_RAW_GARNET, "red_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, "blue_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_RAW_GARNET, "pink_garnet", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, "yellow_garnet", exporter);

        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK, AdvancedValuables_ItemClass.RAW_FUSION_GEM, "fusion_gem", exporter);
        generateBlockToItemRecipe(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK, AdvancedValuables_ItemClass.RAW_RUBY, "ruby", exporter);

        // -- Smelting -- //
        offerSmelting(exporter, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, 0.2f, 200, "blue_sapphire");
        offerSmelting(exporter, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE, 0.2f, 200, "red_sapphire");
        offerSmelting(exporter, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, 0.2f, 200, "green_sapphire");

        offerSmelting(exporter, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET, 0.2f, 200, "red_garnet");
        offerSmelting(exporter, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET, 0.2f, 200, "blue_garnet");
        offerSmelting(exporter, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET, 0.2f, 200, "pink_garnet");
        offerSmelting(exporter, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET, 0.2f, 200, "yellow_garnet");

        offerSmelting(exporter, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM, 0.2f, 200, "fusion_gem");
        offerSmelting(exporter, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY, 0.2f, 200, "ruby");

        // -- Blasting -- //
        offerBlasting(exporter, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, 0.2f, 100, "blue_sapphire");
        offerBlasting(exporter, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE, 0.2f, 100, "red_sapphire");
        offerBlasting(exporter, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, 0.2f, 100, "green_sapphire");

        offerBlasting(exporter, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET, 0.2f, 100, "red_garnet");
        offerBlasting(exporter, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET, 0.2f, 100, "blue_garnet");
        offerBlasting(exporter, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET, 0.2f, 100, "pink_garnet");
        offerBlasting(exporter, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET, 0.2f, 100, "yellow_garnet");

        offerBlasting(exporter, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM, 0.2f, 100, "fusion_gem");
        offerBlasting(exporter, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY, 0.2f, 100, "ruby");

        // -- Tools Crafting -- //
        generatePickaxeRecipe(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE, "blue_sapphire_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE, "blue_sapphire_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL, "blue_sapphire_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE, "blue_sapphire_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD, "blue_sapphire_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE, "red_sapphire_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE, "red_sapphire_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL, "red_sapphire_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE, "red_sapphire_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD, "red_sapphire_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE, "green_sapphire_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE, "green_sapphire_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL, "green_sapphire_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE, "green_sapphire_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD, "green_sapphire_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_PICKAXE, "red_garnet_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_AXE, "red_garnet_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_SHOVEL, "red_garnet_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_HOE, "red_garnet_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_SWORD, "red_garnet_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE, "blue_garnet_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_AXE, "blue_garnet_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL, "blue_garnet_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_HOE, "blue_garnet_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_SWORD, "blue_garnet_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE, "pink_garnet_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_AXE, "pink_garnet_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL, "pink_garnet_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_HOE, "pink_garnet_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_SWORD, "pink_garnet_tools", exporter);

        generatePickaxeRecipe(AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE, "yellow_garnet_tools", exporter);
        generateAxeRecipe(AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_AXE, "yellow_garnet_tools", exporter);
        generateShovelRecipe(AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL, "yellow_garnet_tools", exporter);
        generateHoeRecipe(AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_HOE, "yellow_garnet_tools", exporter);
        generateSwordRecipe(AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD, "yellow_garnet_tools", exporter);

        // -- Smelting (Raw Blocks - Solid Blocks) -- //
        offerSmelting(exporter, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, 0.25f, 200, "blue_sapphire");
        offerSmelting(exporter, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, 0.25f, 200, "red_sapphire");
        offerSmelting(exporter, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, 0.25f, 200, "green_sapphire");
        offerSmelting(exporter, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, 0.25f, 200, "red_garnet");
        offerSmelting(exporter, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, 0.25f, 200, "blue_garnet");
        offerSmelting(exporter, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, 0.25f, 200, "pink_garnet");
        offerSmelting(exporter, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, 0.25f, 200, "yellow_garnet");
        offerSmelting(exporter, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK, 0.25f, 200, "fusion_gem");
        offerSmelting(exporter, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK, 0.25f, 200, "ruby");

        // -- Blasting (Raw Blocks - Solid Blocks) -- //
        offerBlasting(exporter, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, 0.25f, 100, "blue_sapphire");
        offerBlasting(exporter, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, 0.25f, 100, "red_sapphire");
        offerBlasting(exporter, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, 0.25f, 100, "green_sapphire");
        offerBlasting(exporter, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, 0.25f, 100, "red_garnet");
        offerBlasting(exporter, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, 0.25f, 100, "blue_garnet");
        offerBlasting(exporter, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, 0.25f, 100, "pink_garnet");
        offerBlasting(exporter, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, 0.25f, 200, "yellow_garnet");
        offerBlasting(exporter, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK, 0.25f, 100, "fusion_gem");
        offerBlasting(exporter, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK, 0.25f, 100, "ruby");

        // -- Decor Blocks -- //
        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.RED_SAPPHIRE, "red_sapphire");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "blue_sapphire");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "green_sapphire");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.RED_GARNET_STAIRS,
                AdvancedValuables_BlockClass.RED_GARNET_SLAB,
                AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RED_GARNET_BUTTON,
                AdvancedValuables_BlockClass.RED_GARNET_FENCE,
                AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.RED_GARNET_WALL,
                AdvancedValuables_BlockClass.RED_GARNET_DOOR,
                AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.RED_GARNET, "red_garnet");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS,
                AdvancedValuables_BlockClass.BLUE_GARNET_SLAB,
                AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON,
                AdvancedValuables_BlockClass.BLUE_GARNET_FENCE,
                AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.BLUE_GARNET_WALL,
                AdvancedValuables_BlockClass.BLUE_GARNET_DOOR,
                AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.BLUE_GARNET, "blue_garnet");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.PINK_GARNET_STAIRS,
                AdvancedValuables_BlockClass.PINK_GARNET_SLAB,
                AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.PINK_GARNET_BUTTON,
                AdvancedValuables_BlockClass.PINK_GARNET_FENCE,
                AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.PINK_GARNET_WALL,
                AdvancedValuables_BlockClass.PINK_GARNET_DOOR,
                AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.PINK_GARNET, "pink_garnet");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS,
                AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB,
                AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON,
                AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_WALL,
                AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR,
                AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.YELLOW_GARNET, "yellow_garnet");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.FUSION_STAIRS,
                AdvancedValuables_BlockClass.FUSION_SLAB,
                AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.FUSION_BUTTON,
                AdvancedValuables_BlockClass.FUSION_FENCE,
                AdvancedValuables_BlockClass.FUSION_FENCE_GATE,
                AdvancedValuables_BlockClass.FUSION_WALL,
                AdvancedValuables_BlockClass.FUSION_DOOR,
                AdvancedValuables_BlockClass.FUSION_TRAPDOOR,
                AdvancedValuables_ItemClass.FUSION_GEM, "fusion_gem");

        generateBuildingBlocks(exporter,
                AdvancedValuables_BlockClass.RUBY_STAIRS,
                AdvancedValuables_BlockClass.RUBY_SLAB,
                AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RUBY_BUTTON,
                AdvancedValuables_BlockClass.RUBY_FENCE,
                AdvancedValuables_BlockClass.RUBY_FENCE_GATE,
                AdvancedValuables_BlockClass.RUBY_WALL,
                AdvancedValuables_BlockClass.RUBY_DOOR,
                AdvancedValuables_BlockClass.RUBY_TRAPDOOR,
                AdvancedValuables_ItemClass.RUBY, "ruby");

        // -- Add-ons -- //
        offerBlasting(exporter, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        offerBlasting(exporter, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        offerBlasting(exporter, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

        offerSmelting(exporter, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        offerSmelting(exporter, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        offerSmelting(exporter, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");
    }

    private void generateShapedBlockRecipe(Block result, Item ingredient, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).offerTo(exporter);
    }
    private void generateBlockToItemRecipe(Block input, Item output, String group, RecipeExporter exporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 9)
                .input(input)
                .group(group)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }

    private void generatePickaxeRecipe(Item input, Item output, String group, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', input)
                .input('b', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input)).group(group).offerTo(exporter);
    }

    private void generateAxeRecipe(Item input, Item output, String group, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .input('a', input)
                .input('b', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input)).group(group).offerTo(exporter);
    }

    private void generateShovelRecipe(Item input, Item output, String group, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', input)
                .input('b', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input)).group(group).offerTo(exporter);
    }

    private void generateHoeRecipe(Item input, Item output, String group, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', input)
                .input('b', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input)).group(group).offerTo(exporter);
    }

    private void generateSwordRecipe(Item input, Item output, String group, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .input('a', input)
                .input('b', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input)).group(group).offerTo(exporter);
    }

    private void generateBuildingBlocks(RecipeExporter exporter,
                                        Block result_stair, Block result_slab,
                                        Block result_pressure_plate, Block result_button,
                                        Block result_fence, Block result_fence_gate,
                                        Block result_wall, Block result_door,
                                        Block result_trapdoor,
                                        Item ingredient, String group)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_stair, 4)
                .pattern("a  ")
                .pattern("aa ")
                .pattern("aaa")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_slab, 6)
                .pattern("   ")
                .pattern("aaa")
                .pattern("   ")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_pressure_plate)
                .pattern("aa ")
                .pattern("   ")
                .pattern("   ")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, result_button)
                .input(ingredient)
                .group(group)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_fence, 3)
                .pattern("aba")
                .pattern("aba")
                .pattern("   ")
                .input('a', ingredient)
                .input('b', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_fence_gate)
                .pattern("aba")
                .pattern("aba")
                .pattern("   ")
                .input('b', ingredient)
                .input('a', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_wall, 6)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("   ")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_door, 3)
                .pattern("aa ")
                .pattern("aa ")
                .pattern("aa ")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result_trapdoor, 2)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("   ")
                .input('a', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient)).group(group)
                .offerTo(exporter);
    }
}
