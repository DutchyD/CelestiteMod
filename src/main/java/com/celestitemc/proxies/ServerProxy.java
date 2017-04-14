package com.celestitemc.proxies;

import com.celestitemc.item.ItemHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy implements CommonProxy {

    @Override
    public void init() {
        for (ItemSword sword : ItemHandler.getInstance().getSwords()) {
            GameRegistry.register(sword);
            ModelLoader.setCustomModelResourceLocation(sword, 0, new ModelResourceLocation(sword.getRegistryName(), "inventory"));
        }
    }
}