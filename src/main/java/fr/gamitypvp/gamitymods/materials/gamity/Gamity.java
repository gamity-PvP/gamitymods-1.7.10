package fr.gamitypvp.gamitymods.materials.gamity;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.materials.WorldGen;

public class Gamity {
    Blocks blocks = new Blocks();
    Tools tools = new Tools();
    Recipes recipes = new Recipes();
    Armors armors = new Armors();
    GamityItems items = new GamityItems();
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
        GameRegistry.registerWorldGenerator(new WorldGen(Blocks.gamityOre, ConfigOptions.Gamity.OreBlock.gamityMinHeight, ConfigOptions.Gamity.OreBlock.gamityMaxHeight, ConfigOptions.Gamity.OreBlock.gamityVeinSize, ConfigOptions.Gamity.OreBlock.gamitySpawnRate), 0);
    }
    public void postInit(){
        armors.postInit();
        items.postInit();
        blocks.postInit();
        tools.postInit();
        recipes.postInit();
    }
}
