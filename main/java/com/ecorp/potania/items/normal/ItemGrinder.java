package com.ecorp.potania.items.normal;

import com.ecorp.potania.items.PotaniaItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrinder extends PotaniaItem {

	public ItemGrinder() {		
		super("grinder");
	}
	
	
	@Override
	public Item setMaxDamage(int maxDamageIn) {
		
		return this.setMaxDamage(100);
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		
		
		itemStack.setItemDamage(this.getDamage(itemStack)+1);
		
		return itemStack;
	}
	

	
	
}


