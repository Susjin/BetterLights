package com.susjin.lampmod;

import com.susjin.lampmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LightTab extends CreativeTabs {

	public LightTab() {
		super("tabLight");
	}

	@Override
	public Item getTabIconItem() {
		ItemStack iStack = new ItemStack(ModBlocks.light);
		return iStack.getItem();
	}



}
