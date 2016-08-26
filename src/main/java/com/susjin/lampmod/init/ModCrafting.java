package com.susjin.lampmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	
	public static void register(){
		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.glowingBricks, 8), "BBB", "BGB", "BBB", 'B', Blocks.STONEBRICK, 'G', Blocks.GLOWSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.glowingBricks), Blocks.STONEBRICK, Items.GLOWSTONE_DUST);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.light), "T  ", "G  ", "   ", 'T', ModItems.lamptop, 'G', ModItems.lampbot);
		
		//Items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.lamptop), "FFF", "F F", "   ", 'F', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.lampbot), "GDG", "GDG", "GGG", 'D', Items.DIAMOND, 'G', new ItemStack(Blocks.STAINED_GLASS, 1, 7));
	}
}
