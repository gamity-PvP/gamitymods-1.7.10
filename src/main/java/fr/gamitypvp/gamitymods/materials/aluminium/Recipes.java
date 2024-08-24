package fr.gamitypvp.gamitymods.materials.aluminium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fr.gamitypvp.gamitymods.materials.aluminium.Blocks.aluminiumOre;
import static fr.gamitypvp.gamitymods.materials.aluminium.AluminiumItems.aluminiumIngot;
import static fr.gamitypvp.gamitymods.materials.aluminium.Tools.*;

public class Recipes {
    public void preInit(){

    }
    public void init(){
        GameRegistry.addRecipe(new ItemStack(aluminiumPickaxe), "III", " S ", " S ", 'I', aluminiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(aluminiumAxe), "II ", "IS ", " S ", 'I', aluminiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(aluminiumShovel), " I ", " S ", " S ", 'I', aluminiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(aluminiumSword), " I ", " I ", " S ", 'I', aluminiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(aluminiumHoe), "II ", " S ", " S ", 'I', aluminiumIngot, 'S', Items.stick);
        GameRegistry.addSmelting(aluminiumOre, new ItemStack(aluminiumIngot), 0.7f);
    }
    public void postInit(){

    }
}
