package net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class AdvancedValuables_FoodProperties
{
    public static final FoodComponent RED_SAPPHIRE_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodComponent BLUE_SAPPHIRE_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodComponent GREEN_SAPPHIRE_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodComponent RED_GARNET_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodComponent BLUE_GARNET_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodComponent PINK_GARNET_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodComponent YELLOW_GARNET_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodComponent FUSION_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 25), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 25), 100f).build();

    public static final FoodComponent RUBY_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 750, 20), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 750, 20), 100f).build();
}
