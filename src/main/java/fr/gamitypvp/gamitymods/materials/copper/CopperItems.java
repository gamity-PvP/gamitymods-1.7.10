package fr.gamitypvp.gamitymods.materials.copper;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;

public class CopperItems {
    public static Item copperIngot;
    private void register(){
        GameRegistry.registerItem(copperIngot, "copperIngot");
    }
    public void preInit(){
        copperIngot = new Item() {
            {
                setUnlocalizedName("copperIngot");
                setTextureName(Reference.ModID + ":copper_ingot");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        register();
    }
    public void init(){
    }
    public void postInit(){

    }
}
