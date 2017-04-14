package com.celestitemc.item.sword;

import com.celestitemc.item.sword.swords.GodSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum ESword {
    GODSWORD(GodSword.class, ToolMaterial.DIAMOND)
    ;

    private Constructor<? extends ItemSword> ctor;
    private ToolMaterial material;

    ESword(Class<? extends ItemSword> clazz, ToolMaterial material) {
        this.material = material;
        try {
            ctor = clazz.getDeclaredConstructor(ToolMaterial.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public ItemSword getItemSword() {
        try {
            return ctor.newInstance(material);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}