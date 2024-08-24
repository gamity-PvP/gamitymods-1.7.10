package fr.gamitypvp.gamitymods.materials.platium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block platiumOre;
    public static Block platiumBlock;
    private void register(){
        GameRegistry.registerBlock(platiumOre, "platiumOre");
        GameRegistry.registerBlock(platiumBlock, "platiumBlock");
    }
    public void preInit(){
        platiumOre = new Block(Material.rock) {
            {
                setBlockName("platiumOre");
                setBlockTextureName(Reference.ModID + ":platium_ore");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.OreBlock.platiumHard);
                setResistance(ConfigOptions.Gamity.OreBlock.platiumResistance);
                setHarvestLevel(ConfigOptions.Gamity.OreBlock.platiumTool, ConfigOptions.Gamity.OreBlock.platiumLevel);
            }
        };
        platiumBlock = new Block(Material.iron) {
            {
                setBlockName("platiumBlock");
                setBlockTextureName(Reference.ModID + ":platium_block");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.Block.platiumHard);
                setResistance(ConfigOptions.Gamity.Block.platiumResistance);
                setHarvestLevel(ConfigOptions.Gamity.Block.platiumTool, ConfigOptions.Gamity.Block.platiumLevel);
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
