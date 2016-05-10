package com.ecorp.potania.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PotaniaItem extends Item{
	
	public PotaniaItem(String name,int damage,int stacksize) {
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxDamage(damage);
		setMaxStackSize(stacksize);
		
		
	}
	public String getSimpleName(){
		
		return getUnlocalizedName().substring(5);
	}
	

}
