package com.north.potential.items;

import com.north.potential.Reference;
import com.north.potential.handlers.ItemHandler;
import com.north.potential.handlers.TabHandler;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/4/2017.
 */
public class ItemDifferentialPick extends ModItem {

    public void initialize()
    {
        setUnlocalizedName(Reference.ModItems.DIFFERENTIAL_PICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DIFFERENTIAL_PICKAXE.getRegistryName());

        setMaxStackSize(1);
        setHarvestLevel("pickaxe",10);
        setMaxDamage(2000);
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addRecipe(new ItemStack(this,1), "AAA", " B ", " C ", 'A', ItemHandler.DIFFERENTIAL_INGOT, 'B', Items.IRON_INGOT, 'C', Items.DIAMOND);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if(isSelected)
        {

        }
    }
}
