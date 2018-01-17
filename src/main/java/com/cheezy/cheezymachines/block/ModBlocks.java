package com.cheezy.cheezymachines.block;

import com.cheezy.cheezymachines.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre oreCopper;
	public static BlockBlock blockCopper;
	public static BlockBlock blockSteel;
	public static BlockCropCorn cropCorn;
	
	public static void init() {
		oreCopper = register(new BlockOre("oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		blockCopper = register(new BlockBlock("blockCopper").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		blockSteel = register(new BlockBlock("blockSteel").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		cropCorn = register(new BlockCropCorn(), null);
		
	 }
	 
	 private static <T extends Block> T register (T block, ItemBlock itemBlock) {
	 
	 GameRegistry.register(block);
	 if(itemBlock != null) {
	 GameRegistry.register(itemBlock);
	 }
	 
	 if(block instanceof ItemModelProvider) {
	 ((ItemModelProvider)block).registerItemModel(itemBlock);
	 }
	 
	 return block;
	 }
	 
	 private static <T extends Block> T register(T block) {
	 ItemBlock itemBlock = new ItemBlock(block);
	 itemBlock.setRegistryName(block.getRegistryName());
	 return register(block, itemBlock);
	 }

}
