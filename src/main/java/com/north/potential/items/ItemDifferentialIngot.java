package com.north.potential.items;

import com.north.potential.Reference;
import com.north.potential.handlers.BlockHandler;
import com.north.potential.handlers.ItemHandler;
import com.north.potential.handlers.TabHandler;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class ItemDifferentialIngot extends ModItem {
    @Override
    public void initialize() {
        setUnlocalizedName(Reference.ModItems.DIFFERENTIAL_INGOT.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DIFFERENTIAL_INGOT.getRegistryName());
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addShapelessRecipe(new ItemStack(this,1), Items.WATER_BUCKET, ItemHandler.STABILITY_CORE, Items.LAVA_BUCKET);

        GameRegistry.addShapelessRecipe(new ItemStack(this,9), BlockHandler.DIFFERENTIAL_BLOCK);
        GameRegistry.addRecipe(new ItemStack(this,1), "AAA", "AAA", "AAA", 'A', ItemHandler.DIFFERENTIAL_NUGGET);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {}
}
