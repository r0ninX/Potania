package com.ecorp.potania.proxy;

import com.ecorp.potania.Potania;
import com.ecorp.potania.items.PotaniaItem;
import com.ecorp.potania.items.PotaniaItemsRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
	
	public void registerModels(){
		
		registerItemModel(PotaniaItemsRegistry.bud);
		registerItemModel(PotaniaItemsRegistry.bud_grinded);
		registerItemModel(PotaniaItemsRegistry.grinder);
		registerItemModel(PotaniaItemsRegistry.hemp_cloth);
	}
	
	public static void registerItemModel(PotaniaItem item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Potania.MODID + ":" + item.getSimpleName(), "inventory"));
	}

}
