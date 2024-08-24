package fr.gamitypvp.gamitymods.materials.gamity;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;

public class GamityItems {
    public static Item gamityIngot;
    private void register(){
        GameRegistry.registerItem(gamityIngot, "gamityIngot");
    }
    public void preInit(){
        gamityIngot = new Item() {
            {
                setUnlocalizedName("gamityIngot");
                setTextureName(Reference.ModID + ":gamity_ingot");
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
