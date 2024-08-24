package fr.gamitypvp.gamitymods.materials.chromium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import fr.gamitypvp.gamitymods.items.Hammer;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item chromiumPickaxe;
    public static Item chromiumAxe;
    public static Item chromiumShovel;
    public static Item chromiumSword;
    public static Item chromiumHoe;
    public static Item chromiumHammer;
    private void register(){GameRegistry.registerItem(chromiumPickaxe, "chromiumPickaxe");
        GameRegistry.registerItem(chromiumAxe, "chromiumAxe");
        GameRegistry.registerItem(chromiumShovel, "chromiumShovel");
        GameRegistry.registerItem(chromiumSword, "chromiumSword");
        GameRegistry.registerItem(chromiumHoe, "chromiumHoe");
        GameRegistry.registerItem(chromiumHammer, "chromiumHammer");
    }
    public void preInit(){
        Item.ToolMaterial chromiumMaterial = EnumHelper.addToolMaterial("CHROMIUM", ConfigOptions.Gamity.Tools.chromiumLevel, ConfigOptions.Gamity.Tools.chromiumDura,  ConfigOptions.Gamity.Tools.chromiumEff,  ConfigOptions.Gamity.Tools.chromiumDamage, ConfigOptions.Gamity.Tools.chromiumEnch);

        chromiumPickaxe = new ItemPickaxe(chromiumMaterial) {
            {
                setUnlocalizedName("chromiumPickaxe");
                setTextureName(Reference.ModID + ":chromium_pickaxe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        chromiumAxe = new ItemAxe(chromiumMaterial) {
            {
                setUnlocalizedName("chromiumAxe");
                setTextureName(Reference.ModID + ":chromium_axe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        chromiumShovel = new ItemSpade(chromiumMaterial) {
            {
                setUnlocalizedName("chromiumShovel");
                setTextureName(Reference.ModID + ":chromium_shovel");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        chromiumSword = new ItemSword(chromiumMaterial) {
            {
                setUnlocalizedName("chromiumSword");
                setTextureName(Reference.ModID + ":chromium_sword");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        chromiumHoe = new ItemHoe(chromiumMaterial) {
            {
                setUnlocalizedName("chromiumHoe");
                setTextureName(Reference.ModID + ":chromium_hoe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        chromiumHammer = new Hammer(chromiumMaterial,"chromiumHammer",gamitymods.GamityHammerTab,Reference.ModID + ":chromiumHammer");
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
