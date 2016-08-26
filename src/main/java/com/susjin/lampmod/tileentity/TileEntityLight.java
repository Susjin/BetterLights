package com.susjin.lampmod.tileentity;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class TileEntityLight extends TileEntity implements ITickable {
	
	private ArrayList<BlockPos> positions;
	private Iterator<BlockPos> iterator;
	
	
	
	
	@Override
	public void onLoad() {
		iterator = positions.iterator();
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
}
