package com.north.potential.blocks;

import com.north.potential.Reference;
import com.north.potential.handlers.ItemHandler;
import com.north.potential.handlers.TabHandler;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class BlockDifferential extends ModBlock {

    public static BlockDifferential block;

    public BlockDifferential() {
        super(Material.ANVIL);
    }

    public void initialize() {
        setRegistryName(Reference.ModBlocks.DIFFERENTIAL_BLOCK.getRegistryName());
        setUnlocalizedName(Reference.ModBlocks.DIFFERENTIAL_BLOCK.getUnlocalizedName());
        setHardness(8);
        //dropBlockAsItem(Minecraft.getMinecraft().world, BlockPos.ORIGIN, this.getBlockState().getBaseState(),0);
        itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(Reference.ModBlocks.DIFFERENTIAL_BLOCK.getRegistryName());
        itemBlock.setUnlocalizedName(Reference.ModBlocks.DIFFERENTIAL_BLOCK.getUnlocalizedName());
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addShapelessRecipe(new ItemStack(this,1), Blocks.OBSIDIAN, ItemHandler.STABILITY_CORE, ItemHandler.STABILITY_CORE);
        GameRegistry.addRecipe(new ItemStack(this, 1), "AAA", "AAA", "AAA", 'A', ItemHandler.DIFFERENTIAL_INGOT);
    }

    @Override
    public ItemBlock getItemBlock() {
        return itemBlock;
    }
}
