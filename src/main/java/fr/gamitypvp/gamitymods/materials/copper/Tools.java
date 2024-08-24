package fr.gamitypvp.gamitymods.materials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import fr.gamitypvp.gamitymods.items.Hammer;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item copperPickaxe;
    public static Item copperAxe;
    public static Item copperShovel;
    public static Item copperSword;
    public static Item copperHoe;
    public static Item copperHammer;
    private void register(){GameRegistry.registerItem(copperPickaxe, "copperPickaxe");
        GameRegistry.registerItem(copperAxe, "copperAxe");
        GameRegistry.registerItem(copperShovel, "copperShovel");
        GameRegistry.registerItem(copperSword, "copperSword");
        GameRegistry.registerItem(copperHoe, "copperHoe");
        GameRegistry.registerItem(copperHammer, "copperHammer");
    }
    public void preInit(){
        Item.ToolMaterial copperMaterial = EnumHelper.addToolMaterial("COPPER", ConfigOptions.Gamity.Tools.copperLevel, ConfigOptions.Gamity.Tools.copperDura,  ConfigOptions.Gamity.Tools.copperEff,  ConfigOptions.Gamity.Tools.copperDamage, ConfigOptions.Gamity.Tools.copperEnch);

        copperPickaxe = new ItemPickaxe(copperMaterial) {
            {
                setUnlocalizedName("copperPickaxe");
                setTextureName(Reference.ModID + ":copper_pickaxe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        copperAxe = new ItemAxe(copperMaterial) {
            {
                setUnlocalizedName("copperAxe");
                setTextureName(Reference.ModID + ":copper_axe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        copperShovel = new ItemSpade(copperMaterial) {
            {
                setUnlocalizedName("copperShovel");
                setTextureName(Reference.ModID + ":copper_shovel");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        copperSword = new ItemSword(copperMaterial) {
            {
                setUnlocalizedName("copperSword");
                setTextureName(Reference.ModID + ":copper_sword");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        copperHoe = new ItemHoe(copperMaterial) {
            {
                setUnlocalizedName("copperHoe");
                setTextureName(Reference.ModID + ":copper_hoe");
                setCreativeTab(gamitymods.GamityTab);
            }
        };
        copperHammer = new Hammer(copperMaterial,"copperHammer",gamitymods.GamityHammerTab,Reference.ModID + ":copperHammer");
        register();
    }
    public void init(){

    }
    public void postInit(){

    }
}
