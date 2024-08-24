package fr.gamitypvp.gamitymods.materials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fr.gamitypvp.gamitymods.materials.copper.Blocks.copperOre;
import static fr.gamitypvp.gamitymods.materials.copper.CopperItems.copperIngot;
import static fr.gamitypvp.gamitymods.materials.copper.Tools.*;

public class Recipes {
    public void preInit(){

    }
    public void init(){
        GameRegistry.addRecipe(new ItemStack(copperPickaxe), "III", " S ", " S ", 'I', copperIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(copperAxe), "II ", "IS ", " S ", 'I', copperIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(copperShovel), " I ", " S ", " S ", 'I', copperIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(copperSword), " I ", " I ", " S ", 'I', copperIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(copperHoe), "II ", " S ", " S ", 'I', copperIngot, 'S', Items.stick);
        GameRegistry.addSmelting(copperOre, new ItemStack(copperIngot), 0.7f);
    }
    public void postInit(){

    }
}
