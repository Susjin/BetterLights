package com.susjin.lampmod;

import com.susjin.lampmod.init.ModBlocks;
import com.susjin.lampmod.init.ModCrafting;
import com.susjin.lampmod.init.ModItems;
import com.susjin.lampmod.proxy.CommonProxy;
import com.susjin.lampmod.tileentity.TileEntityLight;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class Lamp {
	
	@Instance
	public static Lamp instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final CreativeTabs CREATIVE_TAB = new LightTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("Init");
		proxy.init();
		
		ModCrafting.register();
		
		GameRegistry.registerTileEntity(TileEntityLight.class, Reference.MOD_ID + "TileEntityLight");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init");
	}
}
