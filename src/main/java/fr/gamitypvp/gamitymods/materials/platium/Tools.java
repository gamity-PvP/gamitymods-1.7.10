package fr.gamitypvp.gamitymods.materials.platium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import fr.gamitypvp.gamitymods.items.Hammer;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item platiumPickaxe;
    public static Item platiumAxe;
    public static Item platiumShovel;
    public static Item platiumSword;
    public static Item platiumHoe;
    public static Item platiumHammer;
    private void register(){GameRegistry.registerItem(platiumPickaxe, "platiumPickaxe");
        GameRegistry.registerItem(platiumAxe, "platiumAxe");
        GameRegistry.registerItem(platiumShovel, "platiumShovel");
        GameRegistry.registerItem(platiumSword, "platiumSword");
        GameRegistry.registerItem(platiumHoe, "platiumHoe");
        GameRegistry.registerItem(platiumHammer, "platiumHammer");
    }
    public void preInit(){
        Item.ToolMaterial platiumMaterial = EnumHelper.addToolMaterial("PLATIUM", ConfigOptions.Gamity.Tools.platiumLevel, ConfigOptions.Gamity.Tools.platiumDura,  ConfigOptions.Gamity.Tools.platiumEff,  ConfigOptions.Gamity.Tools.platiumDamage, ConfigOptions.Gamity.Tools.platiumEnch);

        platiumPickaxe = new ItemPickaxe(platiumMaterial) {
            {
                setUnlocalizedName("platiumPickaxe");
                setTextureName(Reference.ModID + ":platium_pickaxe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        platiumAxe = new ItemAxe(platiumMaterial) {
            {
                setUnlocalizedName("platiumAxe");
                setTextureName(Reference.ModID + ":platium_axe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        platiumShovel = new ItemSpade(platiumMaterial) {
            {
                setUnlocalizedName("platiumShovel");
                setTextureName(Reference.ModID + ":platium_shovel");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        platiumSword = new ItemSword(platiumMaterial) {
            {
                setUnlocalizedName("platiumSword");
                setTextureName(Reference.ModID + ":platium_sword");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        platiumHoe = new ItemHoe(platiumMaterial) {
            {
                setUnlocalizedName("platiumHoe");
                setTextureName(Reference.ModID + ":platium_hoe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        platiumHammer = new Hammer(platiumMaterial,"platiumHammer",gamitymods.GamityHammerTab,Reference.ModID + ":platiumHammer");
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
