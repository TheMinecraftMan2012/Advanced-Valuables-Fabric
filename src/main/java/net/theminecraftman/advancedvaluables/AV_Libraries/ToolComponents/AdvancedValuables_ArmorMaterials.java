package net.theminecraftman.advancedvaluables.AV_Libraries.ToolComponents;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.theminecraftman.advancedvaluables.AdvancedValuables;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

import java.util.EnumMap;

public class AdvancedValuables_ArmorMaterials
{
    public static final ArmorMaterial RED_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0,
            AdvancedValuables_Tags.Items.RED_SAPPHIRE_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "red_sapphire")
    );

    public static final ArmorMaterial BLUE_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_SAPPHIRE_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "blue_sapphire")
    );

    public static final ArmorMaterial GREEN_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.GREEN_SAPPHIRE_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "green_sapphire")
    );

    public static final ArmorMaterial RED_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.RED_GARNET_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "red_garnet")
    );

    public static final ArmorMaterial BLUE_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "blue_garnet")
    );

    public static final ArmorMaterial PINK_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.PINK_GARNET_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "pink_garnet")
    );

    public static final ArmorMaterial YELLOW_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "yellow_garnet")
    );

    public static final ArmorMaterial FUSION_GEM = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.FUSION_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "fusion_gem")
    );

    public static final ArmorMaterial RUBY = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(EquipmentType.class), attribute -> {
                attribute.put(EquipmentType.BOOTS, 2);
                attribute.put(EquipmentType.LEGGINGS, 4);
                attribute.put(EquipmentType.CHESTPLATE, 6);
                attribute.put(EquipmentType.HELMET, 2);
                attribute.put(EquipmentType.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.RUBY_REPAIR,
            Identifier.of(AdvancedValuables.MOD_ID, "ruby")
    );
}
