package net.theminecraftman.advancedvaluables.AV_WorldGen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;

public class AdvancedValuables_ConfiguredFeature
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_SAPPHIRE_ORE_KEY = registerKey("blue_sapphire_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_SAPPHIRE_ORE_KEY = registerKey("red_sapphire_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_SAPPHIRE_ORE_KEY = registerKey("green_sapphire_ore_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_GARNET_ORE_KEY = registerKey("red_garnet_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_GARNET_ORE_KEY = registerKey("blue_garnet_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_GARNET_ORE_KEY = registerKey("pink_garnet_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_GARNET_ORE_KEY = registerKey("yellow_garnet_ore_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FUSION_ORE_KEY = registerKey("fusion_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore_key");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepSlateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworld_blue_sapphire_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_red_sapphire_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_green_sapphire_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworld_red_garnet_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.RED_GARNET_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_blue_garnet_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.BLUE_GARNET_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_pink_garnet_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.PINK_GARNET_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_yellow_garnet_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworld_fusion_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.FUSION_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> overworld_ruby_ore = List.of(
                OreFeatureConfig.createTarget(stoneReplaceable, AdvancedValuables_BlockClass.RUBY_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.getDefaultState())
        );

        register(context, BLUE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_blue_sapphire_ore, 9));
        register(context, RED_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_red_sapphire_ore, 9));
        register(context, GREEN_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_green_sapphire_ore, 9));

        register(context, RED_GARNET_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_red_garnet_ore, 9));
        register(context, BLUE_GARNET_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_blue_garnet_ore, 9));
        register(context, PINK_GARNET_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_pink_garnet_ore, 9));
        register(context, YELLOW_GARNET_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_yellow_garnet_ore, 9));

        register(context, FUSION_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_fusion_ore, 9));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworld_ruby_ore, 9));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AdvancedValuables.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<? ,?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
