package com.ecorp.potania;

import com.ecorp.potania.crafting.Crafting;
import com.ecorp.potania.items.PotaniaItemsRegistry;
import com.ecorp.potania.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Potania.MODID, version = Potania.VERSION)
public class Potania {
	public static final String MODID = "potania";
	public static final String VERSION = "0.3";

	@Instance(MODID)
	public static Potania INSTANCE = new Potania();
	
	@SidedProxy(serverSide = "com.ecorp.potania.proxy.CommonProxy",clientSide = "com.ecorp.potania.proxy.ClientProxy", modId = MODID)
	public static CommonProxy proxy = new CommonProxy();
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {

	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		new PotaniaItemsRegistry();

	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		

		
		Crafting.Craft();
		proxy.registerModels();
		

	}
}
