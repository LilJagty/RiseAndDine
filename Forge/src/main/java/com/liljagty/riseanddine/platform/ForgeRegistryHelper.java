package com.liljagty.riseanddine.platform;

import com.liljagty.riseanddine.CommonClass;
import com.liljagty.riseanddine.Constants;
import com.liljagty.riseanddine.RiseAndDine;
import com.liljagty.riseanddine.platform.services.RegistryHelper;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ForgeRegistryHelper implements RegistryHelper {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    @Override
    public Supplier<Item> registerItem(String id, Supplier<Item> input) {
        return ITEMS.register(id, input);
    }
}
