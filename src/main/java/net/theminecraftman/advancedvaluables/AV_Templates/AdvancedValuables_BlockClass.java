package net.theminecraftman.advancedvaluables.AV_Templates;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_BlockClass
{
    public static final Block BLUE_SAPPHIRE_BLOCK = registerSimpleBlock("blue_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block RED_SAPPHIRE_BLOCK = registerSimpleBlock("red_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block GREEN_SAPPHIRE_BLOCK = registerSimpleBlock("green_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);

    public static final Block RED_GARNET_BLOCK = registerSimpleBlock("red_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block BLUE_GARNET_BLOCK = registerSimpleBlock("blue_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block PINK_GARNET_BLOCK = registerSimpleBlock("pink_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block YELLOW_GARNET_BLOCK = registerSimpleBlock("yellow_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);

    public static final Block FUSION_BLOCK = registerSimpleFireResistantBlock("fusion_block", BlockSoundGroup.NETHERITE);

    public static final Block RUBY_BLOCK = registerSimpleBlock("ruby_block", BlockSoundGroup.AMETHYST_BLOCK);

    public static final Block BLUE_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("blue_raw_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block RED_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("red_raw_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block GREEN_RAW_SAPPHIRE_BLOCK = registerSimpleBlock("green_raw_sapphire_block", BlockSoundGroup.AMETHYST_BLOCK);

    public static final Block RED_RAW_GARNET_BLOCK = registerSimpleBlock("red_raw_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block BLUE_RAW_GARNET_BLOCK = registerSimpleBlock("blue_raw_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block PINK_RAW_GARNET_BLOCK = registerSimpleBlock("pink_raw_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);
    public static final Block YELLOW_RAW_GARNET_BLOCK = registerSimpleBlock("yellow_raw_garnet_block", BlockSoundGroup.AMETHYST_BLOCK);

    public static final Block RAW_FUSION_BLOCK = registerSimpleFireResistantBlock("raw_fusion_block", BlockSoundGroup.NETHERITE);

    public static final Block RAW_RUBY_BLOCK = registerSimpleBlock("raw_ruby_block", BlockSoundGroup.AMETHYST_BLOCK);

    // -- Ores -- // -- Stone -- //
    public static final Block RED_SAPPHIRE_ORE = registerStoneOreBlock("red_sapphire_ore", 2, 4);
    public static final Block BLUE_SAPPHIRE_ORE = registerStoneOreBlock("blue_sapphire_ore", 2, 4);
    public static final Block GREEN_SAPPHIRE_ORE = registerStoneOreBlock("green_sapphire_ore", 2, 4);

    public static final Block RED_GARNET_ORE = registerStoneOreBlock("red_garnet_ore", 2, 5);
    public static final Block BLUE_GARNET_ORE = registerStoneOreBlock("blue_garnet_ore", 2, 5);
    public static final Block PINK_GARNET_ORE = registerStoneOreBlock("pink_garnet_ore", 2, 5);
    public static final Block YELLOW_GARNET_ORE = registerStoneOreBlock("yellow_garnet_ore", 2, 5);

    public static final Block FUSION_ORE = registerStoneOreBlock("fusion_ore", 5, 10);

    public static final Block RUBY_ORE = registerStoneOreBlock("ruby_ore", 2, 6);

    // -- Ores -- // -- Deepslate -- //
    public static final Block DEEPSLATE_RED_SAPPHIRE_ORE = registerDeepSlateOreBlock("red_sapphire_deepslate_ore", 2, 5);
    public static final Block DEEPSLATE_BLUE_SAPPHIRE_ORE = registerDeepSlateOreBlock("blue_sapphire_deepslate_ore", 2, 5);
    public static final Block DEEPSLATE_GREEN_SAPPHIRE_ORE = registerDeepSlateOreBlock("green_sapphire_deepslate_ore", 2, 5);

    public static final Block DEEPSLATE_RED_GARNET_ORE = registerDeepSlateOreBlock("red_garnet_deepslate_ore", 2, 6);
    public static final Block DEEPSLATE_BLUE_GARNET_ORE = registerDeepSlateOreBlock("blue_garnet_deepslate_ore", 2, 6);
    public static final Block DEEPSLATE_PINK_GARNET_ORE = registerDeepSlateOreBlock("pink_garnet_deepslate_ore", 2, 6);
    public static final Block DEEPSLATE_YELLOW_GARNET_ORE = registerDeepSlateOreBlock("yellow_garnet_deepslate_ore", 2, 6);

    public static final Block DEEPSLATE_FUSION_ORE = registerDeepSlateOreBlock("fusion_deepslate_ore", 6, 12);

    public static final Block DEEPSLATE_RUBY_ORE = registerDeepSlateOreBlock("ruby_deepslate_ore", 2, 7);

    private static Block registerStoneOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, new ExperienceDroppingBlock(UniformIntProvider.create(minValue, maxValue),
                AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    }

    private static Block registerDeepSlateOreBlock(String name, int minValue, int maxValue)
    {
        return registerBlock(name, new ExperienceDroppingBlock(UniformIntProvider.create(minValue, maxValue),
                AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    }

    private static Block registerSimpleBlock(String name, BlockSoundGroup blockSoundGroup)
    {
        return registerBlock(name, new Block(AbstractBlock.Settings.create().sounds(blockSoundGroup).strength(4f).requiresTool()));
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdvancedValuables.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    private static Block registerSimpleFireResistantBlock(String name, BlockSoundGroup blockSoundGroup)
    {
        return registerFireResistantBlock(name, new Block(AbstractBlock.Settings.create().sounds(blockSoundGroup).strength(4f).requiresTool()));
    }

    private static Block registerFireResistantBlock(String name, Block block)
    {
        registerFireResistantBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdvancedValuables.MOD_ID, name), block);
    }

    private static void registerFireResistantBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name), new BlockItem(block, new Item.Settings().fireproof()));
    }

    public static void registerModBlocks()
    {
        AdvancedValuables.LOGGER.info("Registering Mod Blocks for " + AdvancedValuables.MOD_ID);
    }
}
