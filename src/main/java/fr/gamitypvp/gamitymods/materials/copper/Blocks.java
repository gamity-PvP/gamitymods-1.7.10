package fr.gamitypvp.gamitymods.materials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block copperOre;
    public static Block copperBlock;
    private void register(){
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(copperBlock, "copperBlock");
    }
    public void preInit(){
        copperOre = new Block(Material.rock) {
            {
                setBlockName("copperOre");
                setBlockTextureName(Reference.ModID + ":copper_ore");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.OreBlock.copperHard);
                setResistance(ConfigOptions.Gamity.OreBlock.copperResistance);
                setHarvestLevel(ConfigOptions.Gamity.OreBlock.copperTool, ConfigOptions.Gamity.OreBlock.copperLevel);
            }
        };
        copperBlock = new Block(Material.iron) {
            {
                setBlockName("copperBlock");
                setBlockTextureName(Reference.ModID + ":copper_block");
                setCreativeTab(gamitymods.GamityTab);
                setHardness(ConfigOptions.Gamity.Block.copperHard);
                setResistance(ConfigOptions.Gamity.Block.copperResistance);
                setHarvestLevel(ConfigOptions.Gamity.Block.copperTool, ConfigOptions.Gamity.Block.copperLevel);
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
