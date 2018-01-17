package com.cheezy.cheezymachines.item;

import com.cheezy.cheezymachines.CheezyMachines;
import com.cheezy.cheezymachines.item.tool.ItemAxe;
import com.cheezy.cheezymachines.item.tool.ItemHoe;
import com.cheezy.cheezymachines.item.tool.ItemPickaxe;
import com.cheezy.cheezymachines.item.tool.ItemShovel;
import com.cheezy.cheezymachines.item.tool.ItemSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotCopper;
	public static ItemBase ingotSteel;
	public static ItemModFood cheeseBurger;
	public static ItemModFood taco;
	public static ItemModFood cheezIt;
	public static ItemBase corn;
	public static ItemCornSeed cornSeed;
	public static ItemModFood roastedCorn;
	public static ItemSword swordCopper;
	public static ItemPickaxe pickaxeCopper;
	public static ItemAxe axeCopper;
	public static ItemShovel shovelCopper;
	public static ItemHoe hoeCopper;
	public static ItemArmor helmetCopper;
	public static ItemArmor chestplateCopper;
	public static ItemArmor leggingsCopper;
	public static ItemArmor bootsCopper;
	public static ItemArmor helmetCheezIt;
	public static ItemArmor chestplateCheezIt;
	public static ItemArmor leggingsCheezIt;
	public static ItemArmor bootsCheezIt;
	
	public static void init() {
	ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
	ingotSteel = register(new ItemBase("ingotSteel").setCreativeTab(CreativeTabs.MATERIALS));
	cheeseBurger = register(new ItemModFood("cheeseBurger", 5, 5, true).setCreativeTab(CreativeTabs.FOOD));
	taco = register(new ItemModFood("taco", 5, 5, false).setCreativeTab(CreativeTabs.FOOD));
	cheezIt = register(new ItemModFood("cheezIt", 7, 3, false).setCreativeTab(CreativeTabs.FOOD));
	corn = register(new ItemBase("corn").setCreativeTab(CreativeTabs.FOOD));
	cornSeed = register(new ItemCornSeed());
	roastedCorn = register(new ItemModFood("roastedCorn", 6, 5, false).setCreativeTab(CreativeTabs.FOOD));
	swordCopper = register(new ItemSword(CheezyMachines.copperToolMaterial, "swordCopper"));
	pickaxeCopper = register(new ItemPickaxe(CheezyMachines.copperToolMaterial, "pickaxeCopper"));
	axeCopper = register(new ItemAxe(CheezyMachines.copperToolMaterial, "axeCopper"));
	shovelCopper = register(new ItemShovel(CheezyMachines.copperToolMaterial, "shovelCopper"));
	hoeCopper = register(new ItemHoe(CheezyMachines.copperToolMaterial, "hoeCopper"));
	helmetCopper = register(new ItemArmor(CheezyMachines.copperArmorMaterial, EntityEquipmentSlot.HEAD, "helmetCopper"));
	chestplateCopper = register(new ItemArmor(CheezyMachines.copperArmorMaterial, EntityEquipmentSlot.CHEST, "chestplateCopper"));
	leggingsCopper = register(new ItemArmor(CheezyMachines.copperArmorMaterial, EntityEquipmentSlot.LEGS, "leggingsCopper"));
	bootsCopper = register(new ItemArmor(CheezyMachines.copperArmorMaterial, EntityEquipmentSlot.FEET, "bootsCopper"));
	helmetCheezIt = register(new ItemArmor(CheezyMachines.cheezitArmorMaterial, EntityEquipmentSlot.HEAD, "helmetCheezIt"));
	chestplateCheezIt = register(new ItemArmor(CheezyMachines.cheezitArmorMaterial, EntityEquipmentSlot.CHEST, "chestplateCheezIt"));
	leggingsCheezIt= register(new ItemArmor(CheezyMachines.cheezitArmorMaterial, EntityEquipmentSlot.LEGS, "leggingsCheezIt"));
	bootsCheezIt = register(new ItemArmor(CheezyMachines.cheezitArmorMaterial, EntityEquipmentSlot.FEET, "bootsCheezIt"));

	
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}
