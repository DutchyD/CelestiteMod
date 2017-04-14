package com.celestitemc.item.sword.swords;

import com.celestitemc.item.Name;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * Created by Dutchy.
 */
public class GodSword extends ItemSword {

    public GodSword(Item.ToolMaterial material) {
        super(material);
        setRegistryName(Name.GODSWORD.getRegistryName());
        setUnlocalizedName(Name.GODSWORD.getUnlocalizedName());
        setCreativeTab(CreativeTabs.COMBAT);
    }
}