package fr.gamitypvp.gamitymods.materials.platium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.materials.WorldGen;

public class Platium {
    Blocks blocks = new Blocks();
    Tools tools = new Tools();
    Armors armors = new Armors();
    PlatiumItems items = new PlatiumItems();
    Recipes recipes = new Recipes();
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
        GameRegistry.registerWorldGenerator(new WorldGen(Blocks.platiumOre, ConfigOptions.Gamity.OreBlock.platiumMinHeight, ConfigOptions.Gamity.OreBlock.platiumMaxHeight, ConfigOptions.Gamity.OreBlock.platiumVeinSize, ConfigOptions.Gamity.OreBlock.platiumSpawnRate), 0);
    }
    public void postInit(){
        armors.postInit();
        items.postInit();
        blocks.postInit();
        tools.postInit();
        recipes.postInit();
    }
}
