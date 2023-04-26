package com.liljagty.riseanddine.common.registry;

import com.liljagty.riseanddine.FoodValues;
import com.liljagty.riseanddine.platform.Services;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class RiseAndDineItems {

    public static void init() {

    }

    // Helper methods
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    // Basic meals
    public static final Supplier<Item> CREAM_CHEESE_EVERYTHING_BAGEL = Services.REGISTRY.registerItem("cream_cheese_everything_bagel",
            () -> new Item(foodItem(FoodValues.CREAM_CHEESE_EVERYTHING_BAGEL)));
    public static final Supplier<Item> CREAM_CHEESE_PLAIN_BAGEL = Services.REGISTRY.registerItem("cream_cheese_plain_bagel",
            () -> new Item(foodItem(FoodValues.CREAM_CHEESE_PLAIN_BAGEL)));

    // Basic Foods
    public static final Supplier<Item> EVERYTHING_BAGEL = Services.REGISTRY.registerItem("everything_bagel",
            () -> new Item(foodItem(FoodValues.EVERYTHING_BAGEL)));
    public static final Supplier<Item> PLAIN_BAGEL = Services.REGISTRY.registerItem("plain_bagel",
            () -> new Item(foodItem(FoodValues.PLAIN_BAGEL)));

}
