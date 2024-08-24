package fr.gamitypvp.gamitymods.materials.platium;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;

public class PlatiumItems {
    public static Item platiumIngot;
    private void register(){
        GameRegistry.registerItem(platiumIngot, "platiumIngot");
    }
    public void preInit(){
        platiumIngot = new Item() {
            {
                setUnlocalizedName("platiumIngot");
                setTextureName(Reference.ModID + ":platium_ingot");
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
