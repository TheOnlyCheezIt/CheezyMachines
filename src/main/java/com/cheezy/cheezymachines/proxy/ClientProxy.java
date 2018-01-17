package com.cheezy.cheezymachines.proxy;

import com.cheezy.cheezymachines.CheezyMachines;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	 public void registerItemRenderer(Item item, int meta, String id) {
     ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CheezyMachines.modId + ":" + id, "inventory"));
		 }

}
