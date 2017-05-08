package com.north.potential.handlers;

import com.north.potential.Reference;
import com.north.potential.blocks.BlockDifferential;
import com.north.potential.blocks.BlockPortalCold;
import com.north.potential.blocks.ModBlock;
import com.north.potential.blocks.ModPortalBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class BlockHandler {
    public static BlockDifferential DIFFERENTIAL_BLOCK = new BlockDifferential();

    private static List<ModBlock> registerBlockList = new ArrayList<ModBlock>() {{
        add(DIFFERENTIAL_BLOCK.setCreativeTab(TabHandler.MOD_BLOCKS));
    }};

    //PORTAL BLOCKS
    public static BlockPortalCold PORTAL_COLDWORLD = new BlockPortalCold();

    private static List<ModPortalBlock> registerPortalList = new ArrayList<ModPortalBlock>() {{
        add(PORTAL_COLDWORLD);
    }};

    public static void register()
    {
        for (ModBlock block: registerBlockList)
        {
            block.initialize();
            GameRegistry.register(block);
            ItemBlock ib = block.getItemBlock();
            if(ib!=null) {GameRegistry.register(ib);}
        }
        for (ModPortalBlock portal: registerPortalList)
        {
            portal.initialize();
            GameRegistry.register(portal);
            ItemBlock p = portal.getItemBlock();
            if(p!=null) {GameRegistry.register(p);}
        }
    }

    public static void registerRecipes()
    {
        for (ModBlock block: registerBlockList)
        {
            block.registerRecipe();
        }
        for (ModPortalBlock portal: registerPortalList)
        {
            portal.registerRecipe();
        }
    }

    public static void registerRenders()
    {
        for (ModBlock block: registerBlockList)
        {
            registerRender(block);
            ItemBlock ib = block.getItemBlock();
            if(ib!=null) {ItemHandler.registerRender(ib);}
        }
        for (ModPortalBlock portal: registerPortalList)
        {
            registerRender(portal);
            ItemBlock p = portal.getItemBlock();
            if(p!=null) {ItemHandler.registerRender(p);}
        }
    }

    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block.getRegistryName(),"inventory"));
    }
}
