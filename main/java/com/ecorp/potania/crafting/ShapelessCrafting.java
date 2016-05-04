package com.ecorp.potania.crafting;

import com.ecorp.potania.Potania;
import com.ecorp.potania.items.PotaniaItemsRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ShapelessCrafting {


    public static void register() {


        GameRegistry.addShapelessRecipe(new ItemStack(PotaniaItemsRegistry.bud_grinded, 2), new ItemStack(PotaniaItemsRegistry.bud), new ItemStack(PotaniaItemsRegistry.grinder, 1));

    }


}
