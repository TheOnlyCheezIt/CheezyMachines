package com.cheezy.cheezymachines;

import com.cheezy.cheezymachines.block.ModBlocks;
import com.cheezy.cheezymachines.crafting.ModRecipes;
import com.cheezy.cheezymachines.item.ModItems;
import com.cheezy.cheezymachines.proxy.CommonProxy;
import com.cheezy.cheezymachines.world.ModWorldGen;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CheezyMachines.modId, name = CheezyMachines.name, version = CheezyMachines.version, acceptedMinecraftVersions = "[1.10.2]")
public class CheezyMachines {

	@SidedProxy(serverSide = "com.cheezy.cheezymachines.proxy.CommonProxy", clientSide = "com.cheezy.cheezymachines.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "chm";
	public static final String name = "Cheezy Machines";
	public static final String version = "1.0.0";
	
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
	public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial cheezitArmorMaterial = EnumHelper.addArmorMaterial("CHEEZIT", modId + ":cheezit", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	@Mod.Instance(modId)
	public static CheezyMachines instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		ModBlocks.init();
		ModItems.init();
		ModRecipes.addRecipes();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
