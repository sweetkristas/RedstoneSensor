package com.sweetkrista.redstonesensor.init;

import com.sweetkrista.redstonesensor.item.ItemWrench;
import com.sweetkrista.redstonesensor.item.ItemWrapper;
import com.sweetkrista.redstonesensor.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemWrapper testItem = new ItemWrench();

    public static void init() {
        GameRegistry.registerItem(testItem, "testItem");
    }
}
