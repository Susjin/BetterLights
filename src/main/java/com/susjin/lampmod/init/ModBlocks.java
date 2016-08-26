package com.susjin.lampmod.init;

import com.susjin.lampmod.blocks.BlockGlowingBricks;
import com.susjin.lampmod.blocks.BlockLight;
import com.susjin.lampmod.blocks.BlockLightProvider;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block glowingBricks;
	public static Block light;
	public static Block lightprovider;
	
	public static void init() {
		glowingBricks = new BlockGlowingBricks();
		light = new BlockLight();
		lightprovider = new BlockLightProvider();
	}
	
	public static void register(){
		registerBlock(glowingBricks);
		registerBlock(light);
		registerBlock(lightprovider);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders(){
		registerRender(glowingBricks);
		registerRender(light);
		registerRender(lightprovider);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}

