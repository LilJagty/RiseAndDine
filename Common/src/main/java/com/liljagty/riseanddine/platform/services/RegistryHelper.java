package com.liljagty.riseanddine.platform.services;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public interface RegistryHelper {

    Supplier<Item> registerItem(String id, Supplier<Item> input);

}
