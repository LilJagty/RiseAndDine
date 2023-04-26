package com.liljagty.riseanddine;

import com.liljagty.riseanddine.platform.ForgeRegistryHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class RiseAndDine {
    
    public RiseAndDine() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        ForgeRegistryHelper.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        
    }
}