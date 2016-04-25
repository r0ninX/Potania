package com.ecorp.potania.items.normal;

import com.ecorp.potania.items.PotaniaItem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrinder extends PotaniaItem {

	public ItemGrinder() {
		super("grinder",100,1);
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}
	

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		
	return new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);
	

	
	}
	
}


