package com.cheezy.cheezymachines.block;

import com.cheezy.cheezymachines.item.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {
	
	public BlockCropCorn() {
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
	}

	@Override
	protected Item getSeed() {
		return ModItems.cornSeed;
	}

	@Override
	protected Item getCrop() {
		return ModItems.corn;
	}

}
