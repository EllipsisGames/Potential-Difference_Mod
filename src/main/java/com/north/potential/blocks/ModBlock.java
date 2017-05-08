package com.north.potential.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public abstract class ModBlock extends Block {

    protected ItemBlock itemBlock = null;

    public ModBlock(Material material)
    {
        super(material);
    }

    public abstract void initialize();
    public abstract void registerRecipe();


    @Override
    public ModBlock setCreativeTab(CreativeTabs tabs) {
        super.setCreativeTab(tabs);
        return this;
    }

    public ItemBlock getItemBlock() {return itemBlock;}
    public Block getBlock() {return this;}
}
