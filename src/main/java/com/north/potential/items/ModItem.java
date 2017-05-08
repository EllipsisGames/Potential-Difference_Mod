package com.north.potential.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by NorthernSprint on 5/4/2017.
 */
public abstract class ModItem extends Item {

    public abstract void initialize();
    public abstract void registerRecipe();

    @Override
    public ModItem setCreativeTab(CreativeTabs tabs) {
        super.setCreativeTab(tabs);
        return this;
    }

    public ModItem getItem() {return this;}
}
