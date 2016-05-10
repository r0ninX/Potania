package com.ecorp.potania.items;

import com.ecorp.potania.items.normal.*;

import net.minecraft.client.main.GameConfiguration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PotaniaItemsRegistry {
	
	public static PotaniaItem bud = new ItemBud();
	public static PotaniaItem bud_grinded = new ItemBudGrinded();
	public static PotaniaItem grinder = new ItemGrinder();
	public static PotaniaItem hemp_cloth = new ItemHempCloth();
	public static PotaniaItem hemp_fibre = new ItemHempFibre();
	
	
	public PotaniaItemsRegistry(){
		register();
	}
		
	public void register() {
		
		GameRegistry.register(bud);
		GameRegistry.register(bud_grinded);
		GameRegistry.register(grinder);
		GameRegistry.register(hemp_cloth);
		GameRegistry.register(hemp_fibre);
		
	}

}
