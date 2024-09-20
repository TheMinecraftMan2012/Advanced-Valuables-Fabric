package net.theminecraftman.advancedvaluables.AV_WorldGen.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_PlacedFeature;

public class AdvancedValuables_OreGeneration
{
    public static void generateOres()
    {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.BLUE_SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.RED_SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.GREEN_SAPPHIRE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.RED_GARNET_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.BLUE_GARNET_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.PINK_GARNET_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.YELLOW_GARNET_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.FUSION_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AdvancedValuables_PlacedFeature.RUBY_ORE_PLACED_KEY);
    }
}
