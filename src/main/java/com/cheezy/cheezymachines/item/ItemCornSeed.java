package com.cheezy.cheezymachines.item;

import com.cheezy.cheezymachines.CheezyMachines;
import com.cheezy.cheezymachines.block.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {
	
	public ItemCornSeed() {
		super(ModBlocks.cropCorn, Blocks.FARMLAND);
		setUnlocalizedName("cornSeed");
		setRegistryName("cornSeed");
	}

	@Override
	public void registerItemModel(Item item) {
		CheezyMachines.proxy.registerItemRenderer(item, 0, "cornSeed");
	}

}
