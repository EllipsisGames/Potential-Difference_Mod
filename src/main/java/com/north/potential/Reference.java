package com.north.potential;

/**
 * Created by NorthernSprint on 5/5/2017.
 */
public class Reference {

    public static final String MODNAME = "Potential Difference";
    public static final String MODID = "pdm";
    public static final String VERSION = "0.0.1";

    public static final String CLIENT_PROXY_CLASS = "com.north.potential.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.north.potential.proxy.ServerProxy";

    public static enum ModItems {
        DIFFERENTIAL_PICKAXE("DIFFERENTIAL_PICKAXE"),
        DIFFERENTIAL_SHOVEL("DIFFERENTIAL_SHOVEL"),
        DIFFERENTIAL_AXE("DIFFERENTIAL_AXE"),
        DIFFERENTIAL_HOE("DIFFERENTIAL_HOE"),
        DIFFERENTIAL_SWORD("DIFFERENTIAL_SWORD"),
        DIFFERENTIAL_INGOT("DIFFERENTIAL_INGOT"),
        DIFFERENTIAL_NUGGET("DIFFERENTIAL_NUGGET"),
        STABILITY_CORE("STABILITY_CORE");

        private String unlocalizedName;
        private String registryName;

        ModItems(String name) {
            this.unlocalizedName = name;
            this.registryName = name;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }

    public static enum ModBlocks {
        DIFFERENTIAL_BLOCK("DIFFERENTIAL_BLOCK");

        private String unlocalizedName;
        private String registryName;

        ModBlocks(String name) {
            this.unlocalizedName = name;
            this.registryName = name;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }
}
