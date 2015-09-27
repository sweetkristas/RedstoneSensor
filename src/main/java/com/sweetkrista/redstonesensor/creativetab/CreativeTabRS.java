package com.sweetkrista.redstonesensor.creativetab;

import com.sweetkrista.redstonesensor.init.ModItems;
import com.sweetkrista.redstonesensor.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRS {
    public static final CreativeTabs RS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.testItem;
        }
    };
}
