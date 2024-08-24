package fr.gamitypvp.gamitymods.materials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.materials.WorldGen;

public class Copper {
    Blocks blocks = new Blocks();
    Tools tools = new Tools();
    Recipes recipes = new Recipes();
    Armors armors = new Armors();
    CopperItems items = new CopperItems();
    public void preInit(){
        armors.preInit();
        items.preInit();
        blocks.preInit();
        tools.preInit();
        recipes.preInit();
    }
    public void init(){
        armors.init();
        items.init();
        blocks.init();
        tools.init();
        recipes.init();
        GameRegistry.registerWorldGenerator(new WorldGen(Blocks.copperOre, ConfigOptions.Gamity.OreBlock.copperMinHeight, ConfigOptions.Gamity.OreBlock.copperMaxHeight, ConfigOptions.Gamity.OreBlock.copperVeinSize, ConfigOptions.Gamity.OreBlock.copperSpawnRate), 0);
    }
    public void postInit(){
        armors.postInit();
        items.postInit();
        blocks.postInit();
        tools.postInit();
        recipes.postInit();
    }
}
