package com.susjin.lampmod.items;

import com.susjin.lampmod.Lamp;
import com.susjin.lampmod.Reference;

import net.minecraft.item.Item;

public class Itemlampbot extends Item {

	public Itemlampbot() {
		setUnlocalizedName(Reference.LampItems.LAMPBOT.getUnlocalizedName());
		setRegistryName(Reference.LampItems.LAMPBOT.getRegistryName());
		setCreativeTab(Lamp.CREATIVE_TAB);
	}
}
