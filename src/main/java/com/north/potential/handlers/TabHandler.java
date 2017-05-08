package com.north.potential.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by NorthernSprint on 5/7/2017.
 */
public class TabHandler {
    public static CreativeTabs MOD_INGREDIENTS = new CreativeTabs("POTENTIAL_INGREDIENTS") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemHandler.DIFFERENTIAL_INGOT);
        }
    };
    public static CreativeTabs MOD_TOOLS = new CreativeTabs("POTENTIAL_TOOLS") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemHandler.DIFFERENTIAL_PICKAXE);
        }
    };
    public static CreativeTabs MOD_BLOCKS = new CreativeTabs("POTENTIAL_BLOCKS") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockHandler.DIFFERENTIAL_BLOCK);
        }
    };
}
