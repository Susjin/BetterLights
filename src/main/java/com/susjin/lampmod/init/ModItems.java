package com.susjin.lampmod.init;

import com.susjin.lampmod.Reference;
import com.susjin.lampmod.items.Itemlampbot;
import com.susjin.lampmod.items.Itemlamptop;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item lamptop;
	public static Item lampbot;
	
	public static void init() {
		lamptop = new Itemlamptop();
		lampbot = new Itemlampbot();
		
	}
	
	public static void register(){
		GameRegistry.register(lamptop);
		GameRegistry.register(lampbot);
	}
	
	public static void registerRenders(){
		registerRender(lamptop);
		registerRender(lampbot);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
