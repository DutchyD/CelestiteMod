package com.celestitemc.item.block;

import net.minecraft.block.Block;

import java.lang.reflect.Constructor;

public enum EBlock {
    ;

    private Constructor<? extends Block> ctor;

    EBlock(Class<? extends Block> clazz) {
        try {
            ctor = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public Block getBlock() {
        try {
            return ctor.getDeclaringClass().newInstance();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}