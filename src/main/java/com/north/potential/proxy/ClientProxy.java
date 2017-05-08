package com.north.potential.proxy;

import com.north.potential.handlers.BlockHandler;
import com.north.potential.handlers.ItemHandler;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class ClientProxy implements CommonProxy {

    @Override
    public void registerRenders() {
        ItemHandler.registerRenders();
        BlockHandler.registerRenders();
    }
}
