package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ModelProvider extends FabricModelProvider
{
    public AdvancedValuables_ModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK)
                .stairs(AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS)
                .slab(AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB)
                .button(AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK)
                .stairs(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS)
                .slab(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB)
                .button(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK)
                .stairs(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS)
                .slab(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB)
                .button(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.RED_GARNET_BLOCK)
                .stairs(AdvancedValuables_BlockClass.RED_GARNET_STAIRS)
                .slab(AdvancedValuables_BlockClass.RED_GARNET_SLAB)
                .button(AdvancedValuables_BlockClass.RED_GARNET_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.RED_GARNET_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.RED_GARNET_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK)
                .stairs(AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS)
                .slab(AdvancedValuables_BlockClass.BLUE_GARNET_SLAB)
                .button(AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.BLUE_GARNET_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK)
                .stairs(AdvancedValuables_BlockClass.PINK_GARNET_STAIRS)
                .slab(AdvancedValuables_BlockClass.PINK_GARNET_SLAB)
                .button(AdvancedValuables_BlockClass.PINK_GARNET_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.PINK_GARNET_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.PINK_GARNET_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK)
                .stairs(AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS)
                .slab(AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB)
                .button(AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.YELLOW_GARNET_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.FUSION_BLOCK)
                .stairs(AdvancedValuables_BlockClass.FUSION_STAIRS)
                .slab(AdvancedValuables_BlockClass.FUSION_SLAB)
                .button(AdvancedValuables_BlockClass.FUSION_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.FUSION_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.FUSION_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.FUSION_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AdvancedValuables_BlockClass.RUBY_BLOCK)
                .stairs(AdvancedValuables_BlockClass.RUBY_STAIRS)
                .slab(AdvancedValuables_BlockClass.RUBY_SLAB)
                .button(AdvancedValuables_BlockClass.RUBY_BUTTON)
                .pressurePlate(AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE)
                .fence(AdvancedValuables_BlockClass.RUBY_FENCE)
                .fenceGate(AdvancedValuables_BlockClass.RUBY_FENCE_GATE)
                .wall(AdvancedValuables_BlockClass.RUBY_WALL);

        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR);

        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.RED_GARNET_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR);

        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.FUSION_DOOR);
        blockStateModelGenerator.registerDoor(AdvancedValuables_BlockClass.RUBY_DOOR);

        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR);

        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR);

        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.FUSION_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AdvancedValuables_BlockClass.RUBY_TRAPDOOR);


        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RED_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.BLUE_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.FUSION_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.RUBY_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_GEM, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_RAW_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_RAW_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_RAW_GARNET, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RAW_FUSION_GEM, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RAW_RUBY, Models.GENERATED);

        // -- HandHeld -- //
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_SWORD, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_SWORD, Models.HANDHELD);

        // -- Armors -- //
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET, "red_sapphire", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE, "red_sapphire", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS, "red_sapphire", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS, "red_sapphire", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET, "blue_sapphire", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE, "blue_sapphire", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS, "blue_sapphire", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS, "blue_sapphire", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET, "green_sapphire", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE, "green_sapphire", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS, "green_sapphire", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS, "green_sapphire", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_GARNET_HELMET, "red_garnet", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE, "red_garnet", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS, "red_garnet", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RED_GARNET_BOOTS, "red_garnet", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_GARNET_HELMET, "blue_garnet", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE, "blue_garnet", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS, "blue_garnet", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS, "blue_garnet", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.PINK_GARNET_HELMET, "pink_garnet", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE, "pink_garnet", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS, "pink_garnet", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.PINK_GARNET_BOOTS, "pink_garnet", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET, "yellow_garnet", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE, "yellow_garnet", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS, "yellow_garnet", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS, "yellow_garnet", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.FUSION_HELMET, "fusion_gem", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.FUSION_CHESTPLATE, "fusion_gem", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.FUSION_LEGGINGS, "fusion_gem", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.FUSION_BOOTS, "fusion_gem", EquipmentSlot.FEET);

        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RUBY_HELMET, "ruby", EquipmentSlot.HEAD);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RUBY_CHESTPLATE, "ruby", EquipmentSlot.CHEST);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RUBY_LEGGINGS, "ruby", EquipmentSlot.LEGS);
        generateArmorItem(itemModelGenerator, AdvancedValuables_ItemClass.RUBY_BOOTS, "ruby", EquipmentSlot.FEET);

        // -- Foods -- //
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_APPLE, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_APPLE, Models.GENERATED);

        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_APPLE, Models.GENERATED);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_APPLE, Models.GENERATED);

        // -- Hammers -- //
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_SAPPHIRE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RED_GARNET_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.BLUE_GARNET_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.PINK_GARNET_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.YELLOW_GARNET_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.FUSION_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(AdvancedValuables_ItemClass.RUBY_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(AdvancedValuables_ItemClass.HAMMER_WIREFRAME, Models.GENERATED);
    }

    public static void generateArmorItem(ItemModelGenerator itemModelGenerator, Item item, String modelId, EquipmentSlot slot)
    {
        itemModelGenerator.registerArmor(item, Identifier.of(AdvancedValuables.MOD_ID, modelId),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(AdvancedValuables.MOD_ID, modelId)).build(), slot);
    }
}
