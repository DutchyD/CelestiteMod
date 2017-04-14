package com.celestitemc.item.item;

import net.minecraft.item.Item;

import java.lang.reflect.Constructor;

/**
 * Created by Dutchy.
 */
public enum EItem {
    ;

    private Constructor<? extends Item> ctor;

    EItem(Class<? extends Item> clazz) {
        try {
            ctor = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public Item getItem() {
        try {
            return ctor.getDeclaringClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}