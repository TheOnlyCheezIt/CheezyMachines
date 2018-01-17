package com.cheezy.cheezymachines.item.tool;

import com.cheezy.cheezymachines.CheezyMachines;
import com.cheezy.cheezymachines.item.ItemModelProvider;

import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		CheezyMachines.proxy.registerItemRenderer(this, 0, name);
	}

}
