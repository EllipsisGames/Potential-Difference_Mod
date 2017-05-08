package com.north.potential.items;

import com.north.potential.Reference;
import com.north.potential.handlers.TabHandler;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class ItemStabilityCore extends ModItem {
    @Override
    public void initialize() {
        setUnlocalizedName(Reference.ModItems.STABILITY_CORE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.STABILITY_CORE.getRegistryName());
    }

    @Override
    public void registerRecipe() {
        GameRegistry.addRecipe(new ItemStack(this,2), "IRI","GDG","IRI",'I',Items.IRON_INGOT,'R',Items.REDSTONE,'G',Items.GOLD_INGOT,'D',Items.DIAMOND);
        GameRegistry.addRecipe(new ItemStack(this,2), "IGI","RDR","IGI",'I',Items.IRON_INGOT,'R',Items.REDSTONE,'G',Items.GOLD_INGOT,'D',Items.DIAMOND);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {}
}
