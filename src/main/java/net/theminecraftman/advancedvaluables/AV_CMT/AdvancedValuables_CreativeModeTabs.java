package net.theminecraftman.advancedvaluables.AV_CMT;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_CreativeModeTabs
{
    public static final ItemGroup AV_VALUABLES = registerCreativeTabs("valuables", FabricItemGroup.builder()
            .displayName(Text.translatable("creativetab.advancedvaluables.valuables"))
            .icon(() -> new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM))
            .entries(((displayContext, entries) -> {
                // -- Solid Items -- //
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET);
                entries.add(AdvancedValuables_ItemClass.FUSION_GEM);
                entries.add(AdvancedValuables_ItemClass.RUBY);

                // -- Raw Items -- //
                entries.add(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE);
                entries.add(AdvancedValuables_ItemClass.RED_RAW_GARNET);
                entries.add(AdvancedValuables_ItemClass.BLUE_RAW_GARNET);
                entries.add(AdvancedValuables_ItemClass.PINK_RAW_GARNET);
                entries.add(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET);
                entries.add(AdvancedValuables_ItemClass.RAW_FUSION_GEM);
                entries.add(AdvancedValuables_ItemClass.RAW_RUBY);

                // -- Solid Blocks -- //
                entries.add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.FUSION_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RUBY_BLOCK);

                // -- Raw Blocks -- //
                entries.add(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
                entries.add(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);
            })).build());

    public static final ItemGroup AV_VALUABLES_ORE = registerCreativeTabs("valuable_ores", FabricItemGroup.builder()
            .displayName(Text.translatable("creativetab.advancedvaluables.valuable_ores"))
            .icon(() -> new ItemStack(AdvancedValuables_BlockClass.FUSION_BLOCK))
            .entries(((displayContext, entries) -> {
                entries.add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.RED_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.PINK_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.FUSION_ORE);
                entries.add(AdvancedValuables_BlockClass.RUBY_ORE);

                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE);
                entries.add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);
            })).build());

    public static final ItemGroup AV_TOOLS_ARMOR = registerCreativeTabs("tools_armor", FabricItemGroup.builder()
            .displayName(Text.translatable("creativetab.advancedvaluables.tools_armor"))
            .icon(() -> new ItemStack(AdvancedValuables_ItemClass.FUSION_PICKAXE))
            .entries(((displayContext, entries) -> {
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD);

                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD);

                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD);

                entries.add(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_AXE);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_HOE);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_SWORD);

                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_AXE);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_HOE);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD);

                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_AXE);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_HOE);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_SWORD);

                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD);

                entries.add(AdvancedValuables_ItemClass.FUSION_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.FUSION_AXE);
                entries.add(AdvancedValuables_ItemClass.FUSION_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.FUSION_HOE);
                entries.add(AdvancedValuables_ItemClass.FUSION_SWORD);

                entries.add(AdvancedValuables_ItemClass.RUBY_PICKAXE);
                entries.add(AdvancedValuables_ItemClass.RUBY_AXE);
                entries.add(AdvancedValuables_ItemClass.RUBY_SHOVEL);
                entries.add(AdvancedValuables_ItemClass.RUBY_HOE);
                entries.add(AdvancedValuables_ItemClass.RUBY_SWORD);

                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS);

                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS);

                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS);

                entries.add(AdvancedValuables_ItemClass.RED_GARNET_HELMET);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.RED_GARNET_BOOTS);

                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_HELMET);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS);

                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_HELMET);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.PINK_GARNET_BOOTS);

                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS);

                entries.add(AdvancedValuables_ItemClass.FUSION_HELMET);
                entries.add(AdvancedValuables_ItemClass.FUSION_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.FUSION_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.FUSION_BOOTS);

                entries.add(AdvancedValuables_ItemClass.RUBY_HELMET);
                entries.add(AdvancedValuables_ItemClass.RUBY_CHESTPLATE);
                entries.add(AdvancedValuables_ItemClass.RUBY_LEGGINGS);
                entries.add(AdvancedValuables_ItemClass.RUBY_BOOTS);
            })).build());

    private static ItemGroup registerCreativeTabs(String name, ItemGroup itemGroup)
    {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(AdvancedValuables.MOD_ID, name), itemGroup);
    }

    public static void registerCreativeModeTabs()
    {
        AdvancedValuables.LOGGER.info("Registering Creative Mode Tabs for " + AdvancedValuables.MOD_ID);
    }
}
