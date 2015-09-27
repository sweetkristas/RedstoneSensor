package com.sweetkrista.redstonesensor.block;

import com.sweetkrista.redstonesensor.creativetab.CreativeTabRS;

public class BlockColoredBrick extends BlockWrapper {
    public BlockColoredBrick()
    {
        super();
        this.setBlockName("colored_brick");
        this.setBlockTextureName("colored_brick");
        this.setCreativeTab(CreativeTabRS.RS_TAB);
    }
}
