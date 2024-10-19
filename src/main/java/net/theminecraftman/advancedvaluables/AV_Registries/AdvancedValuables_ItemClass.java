package net.theminecraftman.advancedvaluables.AV_Registries;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodProperties;
import net.theminecraftman.advancedvaluables.AV_Libraries.Hammer.HammerItem;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents.AdvancedValuables_ArmorMaterials;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents.AdvancedValuables_ToolsMaterials;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ItemClass
{
    public static final Item BLUE_SAPPHIRE = registerItem("blue_sapphire", new Item(new Item.Settings()));
    public static final Item RED_SAPPHIRE = registerItem("red_sapphire", new Item(new Item.Settings()));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(new Item.Settings()));

    public static final Item RED_GARNET = registerItem("red_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_GARNET = registerItem("blue_garnet", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item YELLOW_GARNET = registerItem("yellow_garnet", new Item(new Item.Settings()));

    public static final Item FUSION_GEM = registerItem("fusion_gem", new Item(new Item.Settings().fireproof()));

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item BLUE_RAW_SAPPHIRE = registerItem("blue_raw_sapphire", new Item(new Item.Settings()));
    public static final Item RED_RAW_SAPPHIRE = registerItem("red_raw_sapphire", new Item(new Item.Settings()));
    public static final Item GREEN_RAW_SAPPHIRE = registerItem("green_raw_sapphire", new Item(new Item.Settings()));

    public static final Item RED_RAW_GARNET = registerItem("red_raw_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_RAW_GARNET = registerItem("blue_raw_garnet", new Item(new Item.Settings()));
    public static final Item PINK_RAW_GARNET = registerItem("pink_raw_garnet", new Item(new Item.Settings()));
    public static final Item YELLOW_RAW_GARNET = registerItem("yellow_raw_garnet", new Item(new Item.Settings()));

    public static final Item RAW_FUSION_GEM = registerItem("raw_fusion_gem", new Item(new Item.Settings().fireproof()));

    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

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
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item RED_SAPPHIRE_CHESTPLATE = registerItem("red_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item RED_SAPPHIRE_LEGGINGS = registerItem("red_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item RED_SAPPHIRE_BOOTS = registerItem("red_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item BLUE_SAPPHIRE_HELMET = registerItem("blue_sapphire_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item BLUE_SAPPHIRE_CHESTPLATE = registerItem("blue_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item BLUE_SAPPHIRE_LEGGINGS = registerItem("blue_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item BLUE_SAPPHIRE_BOOTS = registerItem("blue_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item GREEN_SAPPHIRE_HELMET = registerItem("green_sapphire_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item GREEN_SAPPHIRE_CHESTPLATE = registerItem("green_sapphire_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item GREEN_SAPPHIRE_LEGGINGS = registerItem("green_sapphire_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item GREEN_SAPPHIRE_BOOTS = registerItem("green_sapphire_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item RED_GARNET_HELMET = registerItem("red_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));

    public static final Item RED_GARNET_CHESTPLATE = registerItem("red_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));

    public static final Item RED_GARNET_LEGGINGS = registerItem("red_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));

    public static final Item RED_GARNET_BOOTS = registerItem("red_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

    public static final Item BLUE_GARNET_HELMET = registerItem("blue_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));

    public static final Item BLUE_GARNET_CHESTPLATE = registerItem("blue_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));

    public static final Item BLUE_GARNET_LEGGINGS = registerItem("blue_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));

    public static final Item BLUE_GARNET_BOOTS = registerItem("blue_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));

    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));

    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));

    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

    public static final Item YELLOW_GARNET_HELMET = registerItem("yellow_garnet_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));

    public static final Item YELLOW_GARNET_CHESTPLATE = registerItem("yellow_garnet_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));

    public static final Item YELLOW_GARNET_LEGGINGS = registerItem("yellow_garnet_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));

    public static final Item YELLOW_GARNET_BOOTS = registerItem("yellow_garnet_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

    public static final Item FUSION_HELMET = registerItem("fusion_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));

    public static final Item FUSION_CHESTPLATE = registerItem("fusion_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));

    public static final Item FUSION_LEGGINGS = registerItem("fusion_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));

    public static final Item FUSION_BOOTS = registerItem("fusion_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    // -- Food Items -- //
    public static final Item RED_SAPPHIRE_APPLE = registerItem("red_sapphire_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.RED_SAPPHIRE_APPLE)));
    public static final Item BLUE_SAPPHIRE_APPLE = registerItem("blue_sapphire_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.BLUE_SAPPHIRE_APPLE)));
    public static final Item GREEN_SAPPHIRE_APPLE = registerItem("green_sapphire_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.GREEN_SAPPHIRE_APPLE)));

    public static final Item RED_GARNET_APPLE = registerItem("red_garnet_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.RED_GARNET_APPLE)));
    public static final Item BLUE_GARNET_APPLE = registerItem("blue_garnet_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.BLUE_GARNET_APPLE)));
    public static final Item PINK_GARNET_APPLE = registerItem("pink_garnet_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.PINK_GARNET_APPLE)));
    public static final Item YELLOW_GARNET_APPLE = registerItem("yellow_garnet_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.YELLOW_GARNET_APPLE)));

    public static final Item FUSION_APPLE = registerItem("fusion_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.FUSION_APPLE)));
    public static final Item RUBY_APPLE = registerItem("ruby_apple", new Item(new Item.Settings().food(AdvancedValuables_FoodProperties.RUBY_APPLE)));

    // -- Hammer Requirements -- //
    public static final Item HAMMER_WIREFRAME = registerItem("hammer_wireframe", new Item(new Item.Settings()));

    // -- Hammer -- //
    public static final Item RED_SAPPHIRE_HAMMER = registerHammerItem("red_sapphire_hammer", AdvancedValuables_ToolsMaterials.RED_SAPPHIRE);
    public static final Item BLUE_SAPPHIRE_HAMMER = registerHammerItem("blue_sapphire_hammer", AdvancedValuables_ToolsMaterials.BLUE_SAPPHIRE);
    public static final Item GREEN_SAPPHIRE_HAMMER = registerHammerItem("green_sapphire_hammer", AdvancedValuables_ToolsMaterials.GREEN_SAPPHIRE);

    public static final Item RED_GARNET_HAMMER = registerHammerItem("red_garnet_hammer", AdvancedValuables_ToolsMaterials.RED_GARNET);
    public static final Item BLUE_GARNET_HAMMER = registerHammerItem("blue_garnet_hammer", AdvancedValuables_ToolsMaterials.BLUE_GARNET);
    public static final Item PINK_GARNET_HAMMER = registerHammerItem("pink_garnet_hammer", AdvancedValuables_ToolsMaterials.PINK_GARNET);
    public static final Item YELLOW_GARNET_HAMMER = registerHammerItem("yellow_garnet_hammer", AdvancedValuables_ToolsMaterials.YELLOW_GARNET);

    public static final Item FUSION_HAMMER = registerHammerItem("fusion_hammer", AdvancedValuables_ToolsMaterials.FUSION_GEM);
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
    private static Item registerPickaxeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new PickaxeItem(toolsMaterials, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(toolsMaterials, 1, -2.8f))));
    }

    private static Item registerAxeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new AxeItem(toolsMaterials, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(toolsMaterials, 6, -3.2f))));
    }

    private static Item registerShovelItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new ShovelItem(toolsMaterials, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(toolsMaterials, 1.5f, -3f))));
    }

    private static Item registerHoeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new HoeItem(toolsMaterials, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(toolsMaterials, 0, -3f))));
    }

    private static Item registerSwordItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new SwordItem(toolsMaterials, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(toolsMaterials, 3, -2.4f))));
    }

    private static Item registerFireResistantPickaxeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new PickaxeItem(toolsMaterials, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(toolsMaterials, 1, -2.8f)).fireproof()));
    }

    private static Item registerFireResistantAxeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new AxeItem(toolsMaterials, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(toolsMaterials, 6, -3.2f)).fireproof()));
    }

    private static Item registerFireResistantShovelItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new ShovelItem(toolsMaterials, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(toolsMaterials, 1.5f, -3f)).fireproof()));
    }

    private static Item registerFireResistantHoeItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new HoeItem(toolsMaterials, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(toolsMaterials, 0, -3f)).fireproof()));
    }

    private static Item registerFireResistantSwordItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new SwordItem(toolsMaterials, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(toolsMaterials, 3, -2.4f)).fireproof()));
    }

    private static Item registerHammerItem(String name, AdvancedValuables_ToolsMaterials toolsMaterials)
    {
        return registerItem(name, new HammerItem(toolsMaterials, new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(toolsMaterials, 7, -3.5f))));
    }
}
