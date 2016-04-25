package com.ecorp.potania.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PotaniaItem extends Item{
	
	public PotaniaItem(String name) {
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabAllSearch);
		
		
	}
	public String getSimpleName(){
		
		return getUnlocalizedName().substring(5);
	}
	

}
