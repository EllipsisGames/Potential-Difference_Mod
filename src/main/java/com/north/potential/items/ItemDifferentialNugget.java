package com.north.potential.items;

import com.north.potential.Reference;
import com.north.potential.handlers.ItemHandler;
import com.north.potential.handlers.TabHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/7/2017.
 */
public class ItemDifferentialNugget extends ModItem {

    @Override
    public void initialize() {
        setUnlocalizedName(Reference.ModItems.DIFFERENTIAL_NUGGET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DIFFERENTIAL_NUGGET.getRegistryName());
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addShapelessRecipe(new ItemStack(this,9), ItemHandler.DIFFERENTIAL_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(this,1), Items.GOLD_NUGGET, Items.REDSTONE, new ItemStack(Items.DYE,1,4));
    }
}
