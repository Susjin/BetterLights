package com.susjin.lampmod.blocks;

import com.susjin.lampmod.Lamp;
import com.susjin.lampmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlowingBricks extends Block {

	public BlockGlowingBricks() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.LampBlocks.GLOWINGBRICKS.getUnlocalizedName());
		setRegistryName(Reference.LampBlocks.GLOWINGBRICKS.getRegistryName());
		setHardness(1.0F);
		setLightLevel(1.0F);
		setCreativeTab(Lamp.CREATIVE_TAB);
	}
	

}
