package com.sweetkrista.redstonesensor.client.gui;

import com.sweetkrista.redstonesensor.handler.ConfigurationHelper;
import com.sweetkrista.redstonesensor.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiscreen) {
        super(guiscreen,
                new ConfigElement(ConfigurationHelper.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHelper.configuration.toString()));
    }
}
