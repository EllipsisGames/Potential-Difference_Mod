package com.north.potential.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public abstract class ModPortalBlock extends BlockPortal {

    protected ItemBlock itemBlock = null;

    public abstract void initialize();

    public void registerRecipe() {};
    public ItemBlock getItemBlock() {return itemBlock;}
    public BlockPortal getBlock() {return this;}
}
