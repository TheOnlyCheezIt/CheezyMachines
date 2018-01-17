package com.cheezy.cheezymachines.item;

import com.cheezy.cheezymachines.CheezyMachines;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class ItemModFood extends ItemFood implements ItemModelProvider {
	
	protected String name;
	
	public ItemModFood(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
		
	public ItemModFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	 @Override
	 public void registerItemModel(Item item) {
	 CheezyMachines.proxy.registerItemRenderer(this, 0, name);
	 }
	 
	 @Override
	 public ItemModFood setCreativeTab(CreativeTabs tab) {
	 super.setCreativeTab(tab);
	 return this;
	 }
		
}
