package com.susjin.lampmod.items;

import com.susjin.lampmod.Lamp;
import com.susjin.lampmod.Reference;

import net.minecraft.item.Item;

public class Itemlamptop extends Item {
	
	public Itemlamptop() {
		setUnlocalizedName(Reference.LampItems.LAMPTOP.getUnlocalizedName());
		setRegistryName(Reference.LampItems.LAMPTOP.getRegistryName());
		setCreativeTab(Lamp.CREATIVE_TAB);
	}
}
