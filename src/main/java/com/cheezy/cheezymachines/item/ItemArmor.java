package com.cheezy.cheezymachines.item;

import com.cheezy.cheezymachines.CheezyMachines;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {
	
	private String name;

	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		CheezyMachines.proxy.registerItemRenderer(this, 0, name);
	}


}
