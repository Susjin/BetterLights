package com.susjin.lampmod.proxy;

import com.susjin.lampmod.init.ModBlocks;
import com.susjin.lampmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
