package fr.gamitypvp.gamitymods.materials.aluminium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.materials.WorldGen;

public class Aluminium {
    Blocks blocks = new Blocks();
    Tools tools = new Tools();
    Recipes recipes = new Recipes();
    Armors armors = new Armors();
    AluminiumItems items = new AluminiumItems();
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
        GameRegistry.registerWorldGenerator(new WorldGen(Blocks.aluminiumOre, ConfigOptions.Gamity.OreBlock.aluMinHeight, ConfigOptions.Gamity.OreBlock.aluMaxHeight, ConfigOptions.Gamity.OreBlock.aluVeinSize, ConfigOptions.Gamity.OreBlock.aluSpawnRate), 0);
    }
    public void postInit(){
        armors.postInit();
        items.postInit();
        blocks.postInit();
        tools.postInit();
        recipes.postInit();
    }
}
