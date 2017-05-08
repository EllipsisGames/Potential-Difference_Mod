package com.north.potential.handlers;

import com.north.potential.Reference;
import com.north.potential.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NorthernSprint on 5/4/2017.
 */
public class ItemHandler {
    //INGREDIENTS
    public static ItemStabilityCore STABILITY_CORE = new ItemStabilityCore();
    public static ItemDifferentialIngot DIFFERENTIAL_INGOT = new ItemDifferentialIngot();
    public static ItemDifferentialNugget DIFFERENTIAL_NUGGET = new ItemDifferentialNugget();

    //TOOLS
    public static ItemDifferentialPick DIFFERENTIAL_PICKAXE = new ItemDifferentialPick();
    public static ItemDifferentialShovel DIFFERENTIAL_SHOVEL = new ItemDifferentialShovel();
    public static ItemDifferentialAxe DIFFERENTIAL_AXE = new ItemDifferentialAxe();
    public static ItemDifferentialHoe DIFFERENTIAL_HOE = new ItemDifferentialHoe();
    public static ItemDifferentialSword DIFFERENTIAL_SWORD = new ItemDifferentialSword();

    private static List<ModItem> registerList = new ArrayList<ModItem>() {{
        //INGREDIENTS
        add(STABILITY_CORE     .setCreativeTab(TabHandler.MOD_INGREDIENTS));
        add(DIFFERENTIAL_INGOT .setCreativeTab(TabHandler.MOD_INGREDIENTS));
        add(DIFFERENTIAL_NUGGET.setCreativeTab(TabHandler.MOD_INGREDIENTS));

        //TOOLS
        add(DIFFERENTIAL_PICKAXE.setCreativeTab(TabHandler.MOD_TOOLS));
        add(DIFFERENTIAL_SHOVEL .setCreativeTab(TabHandler.MOD_TOOLS));
        add(DIFFERENTIAL_AXE    .setCreativeTab(TabHandler.MOD_TOOLS));
        add(DIFFERENTIAL_HOE    .setCreativeTab(TabHandler.MOD_TOOLS));
        add(DIFFERENTIAL_SWORD  .setCreativeTab(TabHandler.MOD_TOOLS));
    }};

    public static void register()
    {
        for (ModItem item : registerList )
        {
            item.initialize();
            GameRegistry.register(item);
        }
    }

    public static void registerRecipes()
    {
        for (ModItem item : registerList )
        {
            item.registerRecipe();
        }
    }

    public static void registerRenders()
    {
        for (ModItem item : registerList )
        {
            registerRender(item);
        }
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
