package net.theminecraftman.advancedvaluables.AV_Registries;

import net.minecraft.block.*;
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
    public static final Block BLUE_SAPPHIRE_BLOCK = registerBlock("blue_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block RED_SAPPHIRE_BLOCK = registerBlock("red_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block GREEN_SAPPHIRE_BLOCK = registerBlock("green_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

    public static final Block RED_GARNET_BLOCK = registerBlock("red_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block BLUE_GARNET_BLOCK = registerBlock("blue_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block YELLOW_GARNET_BLOCK = registerBlock("yellow_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

    public static final Block FUSION_BLOCK = registerFireResistantBlock("fusion_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(4f).requiresTool()));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

    public static final Block BLUE_RAW_SAPPHIRE_BLOCK = registerBlock("blue_raw_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block RED_RAW_SAPPHIRE_BLOCK = registerBlock("red_raw_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block GREEN_RAW_SAPPHIRE_BLOCK = registerBlock("green_raw_sapphire_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

    public static final Block RED_RAW_GARNET_BLOCK = registerBlock("red_raw_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block BLUE_RAW_GARNET_BLOCK = registerBlock("blue_raw_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block PINK_RAW_GARNET_BLOCK = registerBlock("pink_raw_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));
    public static final Block YELLOW_RAW_GARNET_BLOCK = registerBlock("yellow_raw_garnet_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

    public static final Block RAW_FUSION_BLOCK = registerFireResistantBlock("raw_fusion_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(4f).requiresTool()));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f).requiresTool()));

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

    // -- Decor Blocks -- //
    // -- Red Sapphire -- //
    public static final Block RED_SAPPHIRE_STAIRS = registerBlock("red_sapphire_stairs",
            new StairsBlock(RED_SAPPHIRE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_SLAB = registerBlock("red_sapphire_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_PRESSURE_PLATE = registerBlock("red_sapphire_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_BUTTON = registerBlock("red_sapphire_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_FENCE = registerBlock("red_sapphire_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_FENCE_GATE = registerBlock("red_sapphire_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_WALL = registerBlock("red_sapphire_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_SAPPHIRE_DOOR = registerBlock("red_sapphire_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block RED_SAPPHIRE_TRAPDOOR = registerBlock("red_sapphire_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Blue Sapphire -- //
    public static final Block BLUE_SAPPHIRE_STAIRS = registerBlock("blue_sapphire_stairs",
            new StairsBlock(BLUE_SAPPHIRE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_SLAB = registerBlock("blue_sapphire_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_PRESSURE_PLATE = registerBlock("blue_sapphire_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_BUTTON = registerBlock("blue_sapphire_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_FENCE = registerBlock("blue_sapphire_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_FENCE_GATE = registerBlock("blue_sapphire_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_WALL = registerBlock("blue_sapphire_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_SAPPHIRE_DOOR = registerBlock("blue_sapphire_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block BLUE_SAPPHIRE_TRAPDOOR = registerBlock("blue_sapphire_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Green Sapphire -- //
    public static final Block GREEN_SAPPHIRE_STAIRS = registerBlock("green_sapphire_stairs",
            new StairsBlock(GREEN_SAPPHIRE_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_SLAB = registerBlock("green_sapphire_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_PRESSURE_PLATE = registerBlock("green_sapphire_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_BUTTON = registerBlock("green_sapphire_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_FENCE = registerBlock("green_sapphire_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_FENCE_GATE = registerBlock("green_sapphire_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_WALL = registerBlock("green_sapphire_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_SAPPHIRE_DOOR = registerBlock("green_sapphire_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block GREEN_SAPPHIRE_TRAPDOOR = registerBlock("green_sapphire_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Red Garnet -- //
    public static final Block RED_GARNET_STAIRS = registerBlock("red_garnet_stairs",
            new StairsBlock(RED_GARNET_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_SLAB = registerBlock("red_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_PRESSURE_PLATE = registerBlock("red_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_BUTTON = registerBlock("red_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_FENCE = registerBlock("red_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_FENCE_GATE = registerBlock("red_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_WALL = registerBlock("red_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RED_GARNET_DOOR = registerBlock("red_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block RED_GARNET_TRAPDOOR = registerBlock("red_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Blue Garnet -- //
    public static final Block BLUE_GARNET_STAIRS = registerBlock("blue_garnet_stairs",
            new StairsBlock(BLUE_GARNET_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_SLAB = registerBlock("blue_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_PRESSURE_PLATE = registerBlock("blue_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_BUTTON = registerBlock("blue_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_FENCE = registerBlock("blue_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_FENCE_GATE = registerBlock("blue_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_WALL = registerBlock("blue_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GARNET_DOOR = registerBlock("blue_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block BLUE_GARNET_TRAPDOOR = registerBlock("blue_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Pink Garnet -- //
    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            new StairsBlock(PINK_GARNET_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Yellow Garnet -- //
    public static final Block YELLOW_GARNET_STAIRS = registerBlock("yellow_garnet_stairs",
            new StairsBlock(YELLOW_GARNET_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_SLAB = registerBlock("yellow_garnet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_PRESSURE_PLATE = registerBlock("yellow_garnet_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_BUTTON = registerBlock("yellow_garnet_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_FENCE = registerBlock("yellow_garnet_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_FENCE_GATE = registerBlock("yellow_garnet_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_WALL = registerBlock("yellow_garnet_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GARNET_DOOR = registerBlock("yellow_garnet_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block YELLOW_GARNET_TRAPDOOR = registerBlock("yellow_garnet_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Fusion Gem -- //
    public static final Block FUSION_STAIRS = registerBlock("fusion_stairs",
            new StairsBlock(FUSION_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_SLAB = registerBlock("fusion_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_PRESSURE_PLATE = registerBlock("fusion_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_BUTTON = registerBlock("fusion_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_FENCE = registerBlock("fusion_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_FENCE_GATE = registerBlock("fusion_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_WALL = registerBlock("fusion_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block FUSION_DOOR = registerBlock("fusion_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block FUSION_TRAPDOOR = registerBlock("fusion_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    // -- Ruby -- //
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(RUBY_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON, 10, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

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

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdvancedValuables.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name), new BlockItem(block, new Item.Settings()));
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
