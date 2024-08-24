package fr.gamitypvp.gamitymods.materials.aluminium;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;

public class AluminiumItems {
    public static Item aluminiumIngot;
    private void register(){
        GameRegistry.registerItem(aluminiumIngot, "aluminiumIngot");
    }
    public void preInit(){
        aluminiumIngot = new Item() {
            {
                setUnlocalizedName("aluminiumIngot");
                setTextureName(Reference.ModID + ":aluminium_ingot");
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
