package com.celestitemc.item;

public enum Name {

    GODSWORD("godsword", "ItemGodsword"),
    ;

    private String unlocalizedName;
    private String registryName;

    Name(String unlocalizedName, String registryName) {
        this.unlocalizedName = unlocalizedName;
        this.registryName = registryName;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public String getRegistryName() {
        return registryName;
    }
}