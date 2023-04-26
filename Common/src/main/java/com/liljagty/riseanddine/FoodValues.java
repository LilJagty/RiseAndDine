package com.liljagty.riseanddine;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

/**
 * Food properties
 *
 * Typically, protein/healthiness implies greater nutrition but greater taste implies greater saturation
 *
 * @author LilJagty
 */
public class FoodValues {

    //TODO: Basic components


    // Basic Meals
    public static final FoodProperties CREAM_CHEESE_EVERYTHING_BAGEL = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.8f).build();
    public static final FoodProperties CREAM_CHEESE_PLAIN_BAGEL = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.7f).build();

    // Basic Foods
    public static final FoodProperties EVERYTHING_BAGEL = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.5f).build();
    public static final FoodProperties PLAIN_BAGEL = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.4f).build();

}
