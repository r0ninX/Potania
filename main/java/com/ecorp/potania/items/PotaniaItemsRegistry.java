package com.ecorp.potania.items;

import com.ecorp.potania.items.normal.ItemBud;
import com.ecorp.potania.items.normal.ItemBudGrinded;
import com.ecorp.potania.items.normal.ItemGrinder;

import net.minecraft.client.main.GameConfiguration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PotaniaItemsRegistry {
	
	public static ItemBud bud = new ItemBud();
	public static ItemBudGrinded bud_grinded = new ItemBudGrinded();
	public static ItemGrinder grinder = new ItemGrinder();
	
	
	public PotaniaItemsRegistry(){
		register();
	}
		
	public void register() {
		
		GameRegistry.register(bud);
		GameRegistry.register(bud_grinded);
		GameRegistry.register(grinder);
		
	}

}
