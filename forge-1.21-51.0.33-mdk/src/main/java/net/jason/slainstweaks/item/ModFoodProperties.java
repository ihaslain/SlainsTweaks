package net.jason.slainstweaks.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
public class ModFoodProperties {
    public static final FoodProperties SILVERFISH_TAIL = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.INFESTED, 400), 0.65f).build();
    public static final FoodProperties KOI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();

}
