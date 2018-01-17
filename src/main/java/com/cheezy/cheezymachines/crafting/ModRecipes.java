package com.cheezy.cheezymachines.crafting;

import com.cheezy.cheezymachines.block.ModBlocks;
import com.cheezy.cheezymachines.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void addRecipes() {
		//shaped crafting recipes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCopper), "###", "###", "###", '#', ModItems.ingotCopper);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSteel), "SSS", "SSS", "SSS", 'S', ModItems.ingotSteel);
	
		//shapeless crafting recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));
		
		//smelting recipes
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 1.0f);
		GameRegistry.addSmelting(ModItems.corn, new ItemStack(ModItems.roastedCorn), 0.5f);
		
	}

}
