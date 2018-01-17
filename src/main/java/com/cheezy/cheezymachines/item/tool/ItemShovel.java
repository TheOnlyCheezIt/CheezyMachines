package com.cheezy.cheezymachines.item.tool;

import com.cheezy.cheezymachines.CheezyMachines;
import com.cheezy.cheezymachines.item.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade implements ItemModelProvider {
	
	private String name;

	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		CheezyMachines.proxy.registerItemRenderer(this, 0, name);
	}

}
