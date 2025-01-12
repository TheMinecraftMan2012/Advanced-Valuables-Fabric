package net.theminecraftman.advancedvaluables.AV_Registries;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodConsumables;
import net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodProperties;
import net.theminecraftman.advancedvaluables.AV_Libraries.Hammer.HammerItem;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents.AdvancedValuables_ArmorMaterials;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents.AdvancedValuables_ToolsMaterials;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ItemClass
{
    public static final Item BLUE_SAPPHIRE = registerItem("blue_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire")))));
    public static final Item RED_SAPPHIRE = registerItem("red_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire")))));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire")))));

    public static final Item RED_GARNET = registerItem("red_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_garnet")))));
    public static final Item BLUE_GARNET = registerItem("blue_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet")))));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet")))));
    public static final Item YELLOW_GARNET = registerItem("yellow_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet")))));

    public static final Item FUSION_GEM = registerItem("fusion_gem", new Item(new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "fusion_gem")))));

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "ruby")))));

    public static final Item BLUE_RAW_SAPPHIRE = registerItem("blue_raw_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_raw_sapphire")))));
    public static final Item RED_RAW_SAPPHIRE = registerItem("red_raw_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_raw_sapphire")))));
    public static final Item GREEN_RAW_SAPPHIRE = registerItem("green_raw_sapphire", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_raw_sapphire")))));

    public static final Item RED_RAW_GARNET = registerItem("red_raw_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_raw_garnet")))));
    public static final Item BLUE_RAW_GARNET = registerItem("blue_raw_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_raw_garnet")))));
    public static final Item PINK_RAW_GARNET = registerItem("pink_raw_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_raw_garnet")))));
    public static final Item YELLOW_RAW_GARNET = registerItem("yellow_raw_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_raw_garnet")))));

    public static final Item RAW_FUSION_GEM = registerItem("raw_fusion_gem", new Item(new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "raw_fusion_gem")))));

    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "raw_ruby")))));

    // -- Pickaxes -- //
    public static final Item RED_SAPPHIRE_PICKAXE = registerPickaxeItem("red_sapphire_pickaxe", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_PICKAXE = registerPickaxeItem("blue_sapphire_pickaxe", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_PICKAXE = registerPickaxeItem("green_sapphire_pickaxe", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_PICKAXE = registerPickaxeItem("red_garnet_pickaxe", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_PICKAXE = registerPickaxeItem("blue_garnet_pickaxe", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_PICKAXE = registerPickaxeItem("pink_garnet_pickaxe", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_PICKAXE = registerPickaxeItem("yellow_garnet_pickaxe", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_PICKAXE = registerFireResistantPickaxeItem("fusion_pickaxe", AdvancedValuables_ToolsMaterials.FUSION_GEM);

    public static final Item RUBY_PICKAXE = registerPickaxeItem("ruby_pickaxe", AdvancedValuables_ToolsMaterials.RUBY);

    // -- Axes -- //
    public static final Item RED_SAPPHIRE_AXE = registerAxeItem("red_sapphire_axe", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_AXE = registerAxeItem("blue_sapphire_axe", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_AXE = registerAxeItem("green_sapphire_axe", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_AXE = registerAxeItem("red_garnet_axe", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_AXE = registerAxeItem("blue_garnet_axe", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_AXE = registerAxeItem("pink_garnet_axe", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_AXE = registerAxeItem("yellow_garnet_axe", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_AXE = registerFireResistantAxeItem("fusion_axe", AdvancedValuables_ToolsMaterials.FUSION_GEM);

    public static final Item RUBY_AXE = registerAxeItem("ruby_axe", AdvancedValuables_ToolsMaterials.RUBY);

    // -- Shovels -- //
    public static final Item RED_SAPPHIRE_SHOVEL = registerShovelItem("red_sapphire_shovel", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_SHOVEL = registerShovelItem("blue_sapphire_shovel", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_SHOVEL = registerShovelItem("green_sapphire_shovel", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_SHOVEL = registerShovelItem("red_garnet_shovel", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_SHOVEL = registerShovelItem("blue_garnet_shovel", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_SHOVEL = registerShovelItem("pink_garnet_shovel", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_SHOVEL = registerShovelItem("yellow_garnet_shovel", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_SHOVEL = registerFireResistantShovelItem("fusion_shovel", AdvancedValuables_ToolsMaterials.FUSION_GEM);

    public static final Item RUBY_SHOVEL = registerShovelItem("ruby_shovel", AdvancedValuables_ToolsMaterials.RUBY);

    // -- Hoes -- //
    public static final Item RED_SAPPHIRE_HOE = registerHoeItem("red_sapphire_hoe", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_HOE = registerHoeItem("blue_sapphire_hoe", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_HOE = registerHoeItem("green_sapphire_hoe", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_HOE = registerHoeItem("red_garnet_hoe", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_HOE = registerHoeItem("blue_garnet_hoe", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_HOE = registerHoeItem("pink_garnet_hoe", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_HOE = registerHoeItem("yellow_garnet_hoe", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_HOE = registerFireResistantHoeItem("fusion_hoe", AdvancedValuables_ToolsMaterials.FUSION_GEM);

    public static final Item RUBY_HOE = registerHoeItem("ruby_hoe", AdvancedValuables_ToolsMaterials.RUBY);

    // -- Swords -- //
    public static final Item RED_SAPPHIRE_SWORD = registerSwordItem("red_sapphire_sword", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_SWORD = registerSwordItem("blue_sapphire_sword", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_SWORD = registerSwordItem("green_sapphire_sword", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_SWORD = registerSwordItem("red_garnet_sword", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_SWORD = registerSwordItem("blue_garnet_sword", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_SWORD = registerSwordItem("pink_garnet_sword", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_SWORD = registerSwordItem("yellow_garnet_sword", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_SWORD = registerFireResistantSwordItem("fusion_sword", AdvancedValuables_ToolsMaterials.FUSION_GEM);

    public static final Item RUBY_SWORD = registerSwordItem("ruby_sword", AdvancedValuables_ToolsMaterials.RUBY);

    public static final Item RED_SAPPHIRE_HELMET = registerItem("red_sapphire_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire_helmet")))));

    public static final Item RED_SAPPHIRE_CHESTPLATE = registerItem("red_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire_chestplate")))));

    public static final Item RED_SAPPHIRE_LEGGINGS = registerItem("red_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire_leggings")))));

    public static final Item RED_SAPPHIRE_BOOTS = registerItem("red_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire_boots")))));

    public static final Item BLUE_SAPPHIRE_HELMET = registerItem("blue_sapphire_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire_helmet")))));

    public static final Item BLUE_SAPPHIRE_CHESTPLATE = registerItem("blue_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire_chestplate")))));

    public static final Item BLUE_SAPPHIRE_LEGGINGS = registerItem("blue_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire_leggings")))));

    public static final Item BLUE_SAPPHIRE_BOOTS = registerItem("blue_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire_boots")))));

    public static final Item GREEN_SAPPHIRE_HELMET = registerItem("green_sapphire_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire_helmet")))));

    public static final Item GREEN_SAPPHIRE_CHESTPLATE = registerItem("green_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire_chestplate")))));

    public static final Item GREEN_SAPPHIRE_LEGGINGS = registerItem("green_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire_leggings")))));

    public static final Item GREEN_SAPPHIRE_BOOTS = registerItem("green_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire_boots")))));

    public static final Item RED_GARNET_HELMET = registerItem("red_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_garnet_helmet")))));

    public static final Item RED_GARNET_CHESTPLATE = registerItem("red_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_garnet_chestplate")))));

    public static final Item RED_GARNET_LEGGINGS = registerItem("red_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_garnet_leggings")))));

    public static final Item RED_GARNET_BOOTS = registerItem("red_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "red_garnet_boots")))));

    public static final Item BLUE_GARNET_HELMET = registerItem("blue_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet_helmet")))));

    public static final Item BLUE_GARNET_CHESTPLATE = registerItem("blue_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet_chestplate")))));

    public static final Item BLUE_GARNET_LEGGINGS = registerItem("blue_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet_leggings")))));

    public static final Item BLUE_GARNET_BOOTS = registerItem("blue_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet_boots")))));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet_helmet")))));

    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet_chestplate")))));

    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet_leggings")))));

    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet_boots")))));

    public static final Item YELLOW_GARNET_HELMET = registerItem("yellow_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet_helmet")))));

    public static final Item YELLOW_GARNET_CHESTPLATE = registerItem("yellow_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet_chestplate")))));

    public static final Item YELLOW_GARNET_LEGGINGS = registerItem("yellow_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet_leggings")))));

    public static final Item YELLOW_GARNET_BOOTS = registerItem("yellow_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet_boots")))));

    public static final Item FUSION_HELMET = registerItem("fusion_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, EquipmentType.HELMET,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "fusion_helmet")))));

    public static final Item FUSION_CHESTPLATE = registerItem("fusion_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, EquipmentType.CHESTPLATE,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "fusion_chestplate")))));

    public static final Item FUSION_LEGGINGS = registerItem("fusion_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "fusion_leggings"))).fireproof()));

    public static final Item FUSION_BOOTS = registerItem("fusion_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "fusion_boots"))).fireproof()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, EquipmentType.HELMET,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "ruby_helmet")))));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, EquipmentType.CHESTPLATE,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "ruby_chestplate")))));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, EquipmentType.LEGGINGS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "ruby_leggings")))));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, EquipmentType.BOOTS,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "ruby_boots")))));

    // -- Food Items -- //
    public static final Item RED_SAPPHIRE_APPLE = registerFoodItem("red_sapphire_apple", AdvancedValuables_FoodProperties.RED_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.RED_SAPPHIRE_APPLE);
    public static final Item BLUE_SAPPHIRE_APPLE = registerFoodItem("blue_sapphire_apple", AdvancedValuables_FoodProperties.BLUE_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.BLUE_SAPPHIRE_APPLE);
    public static final Item GREEN_SAPPHIRE_APPLE = registerFoodItem("green_sapphire_apple", AdvancedValuables_FoodProperties.GREEN_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.GREEN_SAPPHIRE_APPLE);

    public static final Item RED_GARNET_APPLE = registerFoodItem("red_garnet_apple", AdvancedValuables_FoodProperties.RED_GARNET_APPLE, AdvancedValuables_FoodConsumables.RED_GARNET_APPLE);
    public static final Item BLUE_GARNET_APPLE = registerFoodItem("blue_garnet_apple", AdvancedValuables_FoodProperties.BLUE_GARNET_APPLE, AdvancedValuables_FoodConsumables.BLUE_GARNET_APPLE);
    public static final Item PINK_GARNET_APPLE = registerFoodItem("pink_garnet_apple", AdvancedValuables_FoodProperties.PINK_GARNET_APPLE, AdvancedValuables_FoodConsumables.PINK_GARNET_APPLE);
    public static final Item YELLOW_GARNET_APPLE = registerFoodItem("yellow_garnet_apple", AdvancedValuables_FoodProperties.YELLOW_GARNET_APPLE, AdvancedValuables_FoodConsumables.YELLOW_GARNET_APPLE);

    public static final Item FUSION_APPLE = registerFoodItem("fusion_apple", AdvancedValuables_FoodProperties.FUSION_APPLE, AdvancedValuables_FoodConsumables.FUSION_APPLE);

    public static final Item RUBY_APPLE = registerFoodItem("ruby_apple", AdvancedValuables_FoodProperties.RUBY_APPLE, AdvancedValuables_FoodConsumables.RUBY_APPLE);

    // -- Hammer Requirements -- //
    public static final Item HAMMER_WIREFRAME = registerItem("hammer_wireframe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, "hammer_wireframe")))));

    // -- Hammer -- //
    public static final Item RED_SAPPHIRE_HAMMER = registerHammerItem("red_sapphire_hammer", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_HAMMER = registerHammerItem("blue_sapphire_hammer", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_HAMMER = registerHammerItem("green_sapphire_hammer", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_HAMMER = registerHammerItem("red_garnet_hammer", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_HAMMER = registerHammerItem("blue_garnet_hammer", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_HAMMER = registerHammerItem("pink_garnet_hammer", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_HAMMER = registerHammerItem("yellow_garnet_hammer", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_HAMMER = registerFireResistantHammerItem("fusion_hammer", AdvancedValuables_ToolsMaterials.FUSION_GEM);
    public static final Item RUBY_HAMMER = registerHammerItem("ruby_hammer", AdvancedValuables_ToolsMaterials.RUBY);

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        AdvancedValuables.LOGGER.info("Registering Items for " + AdvancedValuables.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(AdvancedValuables_ItemClass.HAMMER_WIREFRAME));
    }

    // -- Tool Register Method -- //
    private static Item registerPickaxeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new PickaxeItem(toolsMaterials, 1, -2.8f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerAxeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new AxeItem(toolsMaterials, 6, -3.2f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerShovelItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new ShovelItem(toolsMaterials, 1.5f, -3f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerHoeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new HoeItem(toolsMaterials, 0, -3f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerSwordItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new SwordItem(toolsMaterials, 3, -2.4f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantPickaxeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new PickaxeItem(toolsMaterials, 1, -2.8f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantAxeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new AxeItem(toolsMaterials, 6, -3.2f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantShovelItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new ShovelItem(toolsMaterials, 1.5f, -3f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantHoeItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new HoeItem(toolsMaterials, 0, -3f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantSwordItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new SwordItem(toolsMaterials, 3, -2.4f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerHammerItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new HammerItem(toolsMaterials, 7, -3.5f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFireResistantHammerItem(String name, ToolMaterial toolsMaterials)
    {
        return registerItem(name, new HammerItem(toolsMaterials, 7, -3.5f, new Item.Settings().fireproof()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }

    private static Item registerFoodItem(String name, FoodComponent foodComponent, ConsumableComponent consumableComponent)
    {
        return registerItem(name, new Item(new Item.Settings().food(foodComponent, consumableComponent)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedValuables.MOD_ID, name)))));
    }
}
