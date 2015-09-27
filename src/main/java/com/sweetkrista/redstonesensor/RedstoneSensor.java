package com.sweetkrista.redstonesensor;

import com.sweetkrista.redstonesensor.handler.ConfigurationHelper;
import com.sweetkrista.redstonesensor.init.ModBlocks;
import com.sweetkrista.redstonesensor.init.ModItems;
import com.sweetkrista.redstonesensor.init.Recipes;
import com.sweetkrista.redstonesensor.proxy.IProxy;
import com.sweetkrista.redstonesensor.reference.Reference;
import com.sweetkrista.redstonesensor.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION, name = Reference.MOD_NAME, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RedstoneSensor {
    @Mod.Instance(Reference.MOD_ID)
    public static RedstoneSensor instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHelper.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHelper());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre-initialisation Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
        LogHelper.info("Initialisation Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-initialisation Complete.");
    }
}
