package fr.gamitypvp.gamitymods.materials.gamity;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block gamityOre;
    public static Block gamityBlock;
    private void register(){
        GameRegistry.registerBlock(gamityOre, "gamityOre");
        GameRegistry.registerBlock(gamityBlock, "gamityBlock");
    }
    public void preInit(){
        gamityOre = new Block(Material.rock) {
            {
                setBlockName("gamityOre");
                setBlockTextureName(Reference.ModID + ":gamity_ore");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.OreBlock.gamityHard);
                setResistance(ConfigOptions.Gamity.OreBlock.gamityResistance);
                setHarvestLevel(ConfigOptions.Gamity.OreBlock.gamityTool, ConfigOptions.Gamity.OreBlock.gamityLevel);
            }
        };
        gamityBlock = new Block(Material.iron) {
            {
                setBlockName("gamityBlock");
                setBlockTextureName(Reference.ModID + ":gamity_block");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.Block.gamityHard);
                setResistance(ConfigOptions.Gamity.Block.gamityResistance);
                setHarvestLevel(ConfigOptions.Gamity.Block.gamityTool, ConfigOptions.Gamity.Block.gamityLevel);
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
