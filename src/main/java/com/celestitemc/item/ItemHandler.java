package com.celestitemc.item;

import com.celestitemc.item.block.EBlock;
import com.celestitemc.item.item.EItem;
import com.celestitemc.item.sword.ESword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ItemHandler {

    private List<Item> items = new ArrayList();
    private List<Block> blocks = new ArrayList();
    private List<ItemSword> swords = new ArrayList();


    /* Singleton instance */
    private static ItemHandler instance;

    /* Singleton constructor */
    private ItemHandler() {
    }

    /* Singleton call */
    public static ItemHandler getInstance() {

        if (instance == null)
            instance = new ItemHandler();

        return instance;
    }

    public void register() {
        initItems(EnumSet.allOf(EItem.class));
        initBlocks(EnumSet.allOf(EBlock.class));
        initSwords(EnumSet.allOf(ESword.class));
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public List<ItemSword> getSwords() {
        return swords;
    }

    private void initItems(EnumSet<EItem> set) {
        for (EItem item : set) {
            items.add(item.getItem());
        }
    }

    private void initBlocks(EnumSet<EBlock> set) {
        for (EBlock block : set) {
            blocks.add(block.getBlock());
        }
    }

    private void initSwords(EnumSet<ESword> set) {
        for (ESword sword : set) {
            swords.add(sword.getItemSword());
        }
    }
}