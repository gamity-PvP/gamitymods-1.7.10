package fr.gamitypvp.gamitymods.materials.aluminium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import fr.gamitypvp.gamitymods.items.Hammer;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item aluminiumPickaxe;
    public static Item aluminiumAxe;
    public static Item aluminiumShovel;
    public static Item aluminiumSword;
    public static Item aluminiumHoe;
    public static Item aluminiumHammer;
    private void register(){GameRegistry.registerItem(aluminiumPickaxe, "aluminiumPickaxe");
        GameRegistry.registerItem(aluminiumAxe, "aluminiumAxe");
        GameRegistry.registerItem(aluminiumShovel, "aluminiumShovel");
        GameRegistry.registerItem(aluminiumSword, "aluminiumSword");
        GameRegistry.registerItem(aluminiumHoe, "aluminiumHoe");
        GameRegistry.registerItem(aluminiumHammer, "aluminiumHammer");
    }
    public void preInit(){
        Item.ToolMaterial aluminiumMaterial = EnumHelper.addToolMaterial("ALUMINIUM", ConfigOptions.Gamity.Tools.aluLevel, ConfigOptions.Gamity.Tools.aluDura,  ConfigOptions.Gamity.Tools.aluEff,  ConfigOptions.Gamity.Tools.aluDamage, ConfigOptions.Gamity.Tools.aluEnch);

        aluminiumPickaxe = new ItemPickaxe(aluminiumMaterial) {
            {
                setUnlocalizedName("aluminiumPickaxe");
                setTextureName(Reference.ModID + ":aluminium_pickaxe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        aluminiumAxe = new ItemAxe(aluminiumMaterial) {
            {
                setUnlocalizedName("aluminiumAxe");
                setTextureName(Reference.ModID + ":aluminium_axe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        aluminiumShovel = new ItemSpade(aluminiumMaterial) {
            {
                setUnlocalizedName("aluminiumShovel");
                setTextureName(Reference.ModID + ":aluminium_shovel");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        aluminiumSword = new ItemSword(aluminiumMaterial) {
            {
                setUnlocalizedName("aluminiumSword");
                setTextureName(Reference.ModID + ":aluminium_sword");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        aluminiumHoe = new ItemHoe(aluminiumMaterial) {
            {
                setUnlocalizedName("aluminiumHoe");
                setTextureName(Reference.ModID + ":aluminium_hoe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        aluminiumHammer = new Hammer(aluminiumMaterial,"aluminiumHammer",gamitymods.GamityHammerTab,Reference.ModID + ":aluminiumHammer");
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
