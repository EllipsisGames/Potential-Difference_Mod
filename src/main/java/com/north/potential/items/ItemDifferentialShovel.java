package com.north.potential.items;

import com.north.potential.Reference;
import com.north.potential.handlers.ItemHandler;
import com.north.potential.handlers.TabHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class ItemDifferentialShovel extends ModItem {

    @Override
    public void initialize() {
        setUnlocalizedName(Reference.ModItems.DIFFERENTIAL_SHOVEL.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DIFFERENTIAL_SHOVEL.getRegistryName());

        setMaxStackSize(1);
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addRecipe(new ItemStack(this,1), "A", "B", "C", 'A', ItemHandler.DIFFERENTIAL_INGOT, 'B', Items.IRON_INGOT, 'C', Items.DIAMOND);
    }
}
