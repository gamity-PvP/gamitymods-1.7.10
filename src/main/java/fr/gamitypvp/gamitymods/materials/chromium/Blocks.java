package fr.gamitypvp.gamitymods.materials.chromium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block chromiumOre;
    public static Block chromiumBlock;
    private void register(){
        GameRegistry.registerBlock(chromiumOre, "chromiumOre");
        GameRegistry.registerBlock(chromiumBlock, "chromiumBlock");
    }
    public void preInit(){
        chromiumOre = new Block(Material.rock) {
            {
                setBlockName("chromiumOre");
                setBlockTextureName(Reference.ModID + ":chromium_ore");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.OreBlock.chromiumHard);
                setResistance(ConfigOptions.Gamity.OreBlock.chromiumResistance);
                setHarvestLevel(ConfigOptions.Gamity.OreBlock.chromiumTool, ConfigOptions.Gamity.OreBlock.chromiumLevel);
            }
        };
        chromiumBlock = new Block(Material.iron) {
            {
                setBlockName("chromiumBlock");
                setBlockTextureName(Reference.ModID + ":chromium_block");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.Block.chromiumHard);
                setResistance(ConfigOptions.Gamity.Block.chromiumResistance);
                setHarvestLevel(ConfigOptions.Gamity.Block.chromiumTool, ConfigOptions.Gamity.Block.chromiumLevel);
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
