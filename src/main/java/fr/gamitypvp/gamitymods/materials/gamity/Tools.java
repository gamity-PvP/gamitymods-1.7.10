package fr.gamitypvp.gamitymods.materials.gamity;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import fr.gamitypvp.gamitymods.items.Hammer;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item gamityPickaxe;
    public static Item gamityAxe;
    public static Item gamityShovel;
    public static Item gamitySword;
    public static Item gamityHoe;
    public static Item gamityHammer;
    private void register(){GameRegistry.registerItem(gamityPickaxe, "gamityPickaxe");
        GameRegistry.registerItem(gamityAxe, "gamityAxe");
        GameRegistry.registerItem(gamityShovel, "gamityShovel");
        GameRegistry.registerItem(gamitySword, "gamitySword");
        GameRegistry.registerItem(gamityHoe, "gamityHoe");
        GameRegistry.registerItem(gamityHammer, "gamityHammer");
    }
    public void preInit(){
        Item.ToolMaterial gamityMaterial = EnumHelper.addToolMaterial("GAMITY", ConfigOptions.Gamity.Tools.gamityLevel, ConfigOptions.Gamity.Tools.gamityDura,  ConfigOptions.Gamity.Tools.gamityEff,  ConfigOptions.Gamity.Tools.gamityDamage, ConfigOptions.Gamity.Tools.gamityEnch);

        gamityPickaxe = new ItemPickaxe(gamityMaterial) {
            {
                setUnlocalizedName("gamityPickaxe");
                setTextureName(Reference.ModID + ":gamity_pickaxe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        gamityAxe = new ItemAxe(gamityMaterial) {
            {
                setUnlocalizedName("gamityAxe");
                setTextureName(Reference.ModID + ":gamity_axe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        gamityShovel = new ItemSpade(gamityMaterial) {
            {
                setUnlocalizedName("gamityShovel");
                setTextureName(Reference.ModID + ":gamity_shovel");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        gamitySword = new ItemSword(gamityMaterial) {
            {
                setUnlocalizedName("gamitySword");
                setTextureName(Reference.ModID + ":gamity_sword");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        gamityHoe = new ItemHoe(gamityMaterial) {
            {
                setUnlocalizedName("gamityHoe");
                setTextureName(Reference.ModID + ":gamity_hoe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        gamityHammer = new Hammer(gamityMaterial,"gamityHammer",gamitymods.GamityHammerTab,Reference.ModID + ":gamityHammer");
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
