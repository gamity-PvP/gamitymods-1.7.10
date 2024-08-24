package fr.gamitypvp.gamitymods.materials.chromium;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;

public class ChromiumItems {
    public static Item chromiumIngot;
    private void register(){
        GameRegistry.registerItem(chromiumIngot, "chromiumIngot");
    }
    public void preInit(){
        chromiumIngot = new Item() {
            {
                setUnlocalizedName("chromiumIngot");
                setTextureName(Reference.ModID + ":chromium_ingot");
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
