package net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class AdvancedValuables_ArmorMaterials
{
    public static final RegistryEntry<ArmorMaterial> BLUE_SAPPHIRE = registerArmorMaterial("blue_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.BLUE_SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> RED_SAPPHIRE = registerArmorMaterial("red_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RED_SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> GREEN_SAPPHIRE = registerArmorMaterial("green_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.GREEN_SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> RED_GARNET = registerArmorMaterial("red_garnet",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RED_GARNET),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "red_garnet"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> BLUE_GARNET = registerArmorMaterial("blue_garnet",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.BLUE_GARNET),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> PINK_GARNET = registerArmorMaterial("pink_garnet",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.PINK_GARNET),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> YELLOW_GARNET = registerArmorMaterial("yellow_garnet",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.YELLOW_GARNET),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> FUSION_GEM = registerArmorMaterial("fusion_gem",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.FUSION_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "fusion_gem"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> RUBY = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(AdvancedValuables_ItemClass.RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedValuables.MOD_ID, "ruby"))), 0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material)
    {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AdvancedValuables.MOD_ID, name), material.get());
    }
}
