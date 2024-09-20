package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_ConfiguredFeature;
import net.theminecraftman.advancedvaluables.AV_WorldGen.AdvancedValuables_PlacedFeature;

public class AdvancedValuables_DataGenerators implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(AdvancedValuables_ModelProvider::new);
		pack.addProvider(AdvancedValuables_ItemTagProvider::new);
		pack.addProvider(AdvancedValuables_BlockTagsProvider::new);
		pack.addProvider(AdvancedValuables_BlockLootTableProvider::new);
		pack.addProvider(AdvancedValuables_RecipeProvider::new);
		pack.addProvider(AdvancedValuables_WorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AdvancedValuables_ConfiguredFeature::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AdvancedValuables_PlacedFeature::bootstrap);
	}
}
