package fr.gamitypvp.gamitymods.materials.aluminium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block aluminiumOre;
    public static Block aluminiumBlock;
    private void register(){
        GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
        GameRegistry.registerBlock(aluminiumBlock, "aluminiumBlock");
    }
    public void preInit(){
        aluminiumOre = new Block(Material.rock) {
            {
                setBlockName("aluminiumOre");
                setBlockTextureName(Reference.ModID + ":aluminium_ore");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.OreBlock.aluHard);
                setResistance(ConfigOptions.Gamity.OreBlock.aluResistance);
                setHarvestLevel(ConfigOptions.Gamity.OreBlock.aluTool, ConfigOptions.Gamity.OreBlock.aluLevel);
            }
        };
        aluminiumBlock = new Block(Material.iron) {
            {
                setBlockName("aluminiumBlock");
                setBlockTextureName(Reference.ModID + ":aluminium_block");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.Block.aluHard);
                setResistance(ConfigOptions.Gamity.Block.aluResistance);
                setHarvestLevel(ConfigOptions.Gamity.Block.aluTool, ConfigOptions.Gamity.Block.aluLevel);
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
