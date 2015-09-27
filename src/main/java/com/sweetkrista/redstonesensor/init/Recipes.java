package com.sweetkrista.redstonesensor.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
    public static void init() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testItem), " ss", " ss", "s  ", 's', "ingotIron"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.testBlock), new ItemStack(ModItems.testItem), new ItemStack(ModItems.testItem), new ItemStack(ModItems.testItem));
    }
}
