package com.sweetkrista.redstonesensor.init;

import com.sweetkrista.redstonesensor.block.BlockColoredBrick;
import com.sweetkrista.redstonesensor.block.BlockWrapper;
import com.sweetkrista.redstonesensor.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockWrapper testBlock = new BlockColoredBrick();

    public static void init() {
        GameRegistry.registerBlock(testBlock, "colored_brick");
    }

}
