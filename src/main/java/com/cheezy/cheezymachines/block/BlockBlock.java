package com.cheezy.cheezymachines.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlock extends BlockBase {
	
	public BlockBlock(String name) {
		 super(Material.IRON, name);
		 
		 setHardness(4f);
		 setResistance(5f);
		 }
		 
		 @Override
		 public BlockBlock setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
		 }

}
