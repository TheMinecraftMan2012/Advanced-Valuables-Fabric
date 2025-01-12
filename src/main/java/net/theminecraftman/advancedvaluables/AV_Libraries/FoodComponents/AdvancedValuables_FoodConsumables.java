package net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

public class AdvancedValuables_FoodConsumables
{
    public static final ConsumableComponent RED_SAPPHIRE_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f)).build();
    public static final ConsumableComponent BLUE_SAPPHIRE_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f)).build();
    public static final ConsumableComponent GREEN_SAPPHIRE_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 10), 100f)).build();

    public static final ConsumableComponent RED_GARNET_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final ConsumableComponent BLUE_GARNET_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final ConsumableComponent PINK_GARNET_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final ConsumableComponent YELLOW_GARNET_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 15), 100f)).build();

    public static final ConsumableComponent FUSION_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(
            List.of(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 100),
                    new StatusEffectInstance(StatusEffects.RESISTANCE, 800, 100),
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 100),
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 100)
            )
    )).build();

    public static final ConsumableComponent RUBY_APPLE = ConsumableComponents.food().consumeEffect(new ApplyEffectsConsumeEffect(
            List.of(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 100),
                    new StatusEffectInstance(StatusEffects.RESISTANCE, 800, 100),
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 100),
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 100)
            )
    )).build();
}
