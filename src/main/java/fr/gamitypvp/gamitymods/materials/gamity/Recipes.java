package fr.gamitypvp.gamitymods.materials.gamity;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static fr.gamitypvp.gamitymods.materials.gamity.Blocks.gamityBlock;
import static fr.gamitypvp.gamitymods.materials.gamity.Blocks.gamityOre;
import static fr.gamitypvp.gamitymods.materials.gamity.GamityItems.gamityIngot;
import static fr.gamitypvp.gamitymods.materials.gamity.Tools.*;
import static fr.gamitypvp.gamitymods.materials.gamity.Armors.*;
import static fr.gamitypvp.gamitymods.materials.gamity.Armors.gamityBoots;

public class Recipes {
    public void preInit(){

    }
    public void init(){
        GameRegistry.addRecipe(new ItemStack(gamityPickaxe), "III", " S ", " S ", 'I', gamityIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(gamityAxe), "II ", "IS ", " S ", 'I', gamityIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(gamityShovel), " I ", " S ", " S ", 'I', gamityIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(gamitySword), " I ", " I ", " S ", 'I', gamityIngot, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(gamityHoe), "II ", " S ", " S ", 'I', gamityIngot, 'S', Items.stick);
        GameRegistry.addSmelting(gamityOre, new ItemStack(gamityIngot), 0.7f);
        GameRegistry.addRecipe(new ItemStack(gamityBlock), "III", "III", "III", 'I', gamityIngot);
        GameRegistry.addShapelessRecipe(new ItemStack(gamityIngot, 9), new Object[] { new ItemStack(gamityBlock) });
        GameRegistry.addRecipe(new ItemStack(gamityHelmet), "III", "I I", 'I', gamityIngot);
        GameRegistry.addRecipe(new ItemStack(gamityChestplate), "I I", "III", "III", 'I', gamityIngot);
        GameRegistry.addRecipe(new ItemStack(gamityLeggings), "III", "I I", "I I", 'I', gamityIngot);
        GameRegistry.addRecipe(new ItemStack(gamityBoots), "I I", "I I", 'I', gamityIngot);
    }
    public void postInit(){

    }
}
