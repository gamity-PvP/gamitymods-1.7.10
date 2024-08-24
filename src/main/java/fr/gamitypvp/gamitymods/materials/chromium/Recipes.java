package fr.gamitypvp.gamitymods.materials.chromium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fr.gamitypvp.gamitymods.materials.chromium.Blocks.chromiumOre;
import static fr.gamitypvp.gamitymods.materials.chromium.ChromiumItems.chromiumIngot;
import static fr.gamitypvp.gamitymods.materials.chromium.Tools.*;

public class Recipes {
    public void preInit(){

    }
    public void init(){
        GameRegistry.addRecipe(new ItemStack(chromiumPickaxe), "III", " S ", " S ", 'I', chromiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(chromiumAxe), "II ", "IS ", " S ", 'I', chromiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(chromiumShovel), " I ", " S ", " S ", 'I', chromiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(chromiumSword), " I ", " I ", " S ", 'I', chromiumIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(chromiumHoe), "II ", " S ", " S ", 'I', chromiumIngot, 'S', Items.stick);
        GameRegistry.addSmelting(chromiumOre, new ItemStack(chromiumIngot), 0.7f);
    }
    public void postInit(){

    }
}
