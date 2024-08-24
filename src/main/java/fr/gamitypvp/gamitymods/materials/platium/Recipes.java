package fr.gamitypvp.gamitymods.materials.platium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fr.gamitypvp.gamitymods.materials.platium.Armors.*;
import static fr.gamitypvp.gamitymods.materials.platium.Blocks.platiumBlock;
import static fr.gamitypvp.gamitymods.materials.platium.Blocks.platiumOre;
import static fr.gamitypvp.gamitymods.materials.platium.PlatiumItems.platiumIngot;
import static fr.gamitypvp.gamitymods.materials.platium.Tools.*;

public class Recipes {
    public void preInit(){

    }
    public void init(){
        GameRegistry.addRecipe(new ItemStack(platiumPickaxe), "III", " S ", " S ", 'I', platiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(platiumAxe), "II ", "IS ", " S ", 'I', platiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(platiumShovel), " I ", " S ", " S ", 'I', platiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(platiumSword), " I ", " I ", " S ", 'I', platiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(platiumHoe), "II ", " S ", " S ", 'I', platiumIngot, 'S', Items.stick);
        GameRegistry.addSmelting(platiumOre, new ItemStack(platiumIngot), 0.7f);
        GameRegistry.addRecipe(new ItemStack(platiumBlock), "III", "III", "III", 'I', platiumIngot);
        GameRegistry.addShapelessRecipe(new ItemStack(platiumIngot, 9), new Object[] { new ItemStack(platiumBlock) });
        GameRegistry.addRecipe(new ItemStack(platiumHelmet), "III", "I I", 'I', platiumIngot);
        GameRegistry.addRecipe(new ItemStack(platiumChestplate), "I I", "III", "III", 'I', platiumIngot);
        GameRegistry.addRecipe(new ItemStack(platiumLeggings), "III", "I I", "I I", 'I', platiumIngot);
        GameRegistry.addRecipe(new ItemStack(platiumBoots), "I I", "I I", 'I', platiumIngot);
    }
    public void postInit(){

    }
}
