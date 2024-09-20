package net.theminecraftman.advancedvaluables.AV_WorldGen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;

public class AdvancedValuables_PlacedFeature
{
    public static final RegistryKey<PlacedFeature> BLUE_SAPPHIRE_ORE_PLACED_KEY = registerKey("blue_sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_SAPPHIRE_ORE_PLACED_KEY = registerKey("red_sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> GREEN_SAPPHIRE_ORE_PLACED_KEY = registerKey("green_sapphire_ore_placed");

    public static final RegistryKey<PlacedFeature> RED_GARNET_ORE_PLACED_KEY = registerKey("red_garnet_ore_placed");
    public static final RegistryKey<PlacedFeature> BLUE_GARNET_ORE_PLACED_KEY = registerKey("blue_garnet_ore_placed");
    public static final RegistryKey<PlacedFeature> PINK_GARNET_ORE_PLACED_KEY = registerKey("pink_garnet_ore_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_GARNET_ORE_PLACED_KEY = registerKey("yellow_garnet_ore_placed");

    public static final RegistryKey<PlacedFeature> FUSION_ORE_PLACED_KEY = registerKey("fusion_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BLUE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.BLUE_SAPPHIRE_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, RED_SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.RED_SAPPHIRE_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, GREEN_SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.GREEN_SAPPHIRE_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );

        register(context, RED_GARNET_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.RED_GARNET_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, BLUE_GARNET_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.BLUE_GARNET_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, PINK_GARNET_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.PINK_GARNET_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, YELLOW_GARNET_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.YELLOW_GARNET_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );

        register(context, FUSION_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.FUSION_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AdvancedValuables_ConfiguredFeature.RUBY_ORE_KEY),
                AdvancedValuables_OrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(AdvancedValuables.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}
