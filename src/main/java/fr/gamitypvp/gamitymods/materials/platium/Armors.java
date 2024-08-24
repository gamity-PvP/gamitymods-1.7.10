package fr.gamitypvp.gamitymods.materials.platium;

import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Armors {
    public static Item platiumHelmet;
    public static Item platiumChestplate;
    public static Item platiumLeggings;
    public static Item platiumBoots;
    private void register(){
        GameRegistry.registerItem(platiumHelmet, "platiumHelmet");
        GameRegistry.registerItem(platiumChestplate, "platiumChestplate");
        GameRegistry.registerItem(platiumLeggings, "platiumLeggings");
        GameRegistry.registerItem(platiumBoots, "platiumBoots");
    }
    public void preInit(){
        ItemArmor.ArmorMaterial platiumArmorMaterial = EnumHelper.addArmorMaterial("PLATIUM", ConfigOptions.Gamity.Armor.platiumDura, new int[]{ConfigOptions.Gamity.Armor.platiumProtectHead, ConfigOptions.Gamity.Armor.platiumProtectChest, ConfigOptions.Gamity.Armor.platiumProtectleg, ConfigOptions.Gamity.Armor.platiumProtectFoot}, ConfigOptions.Gamity.Armor.platiumProtectEnch);

        platiumHelmet = new ItemArmor(platiumArmorMaterial, 0, 0) {
            {
                setUnlocalizedName("platiumHelmet");
                setTextureName(Reference.ModID + ":platium_helmet");
                setCreativeTab(gamitymods.GamityTab);
            }

            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/platium_layer_1.png";
            }
        };

        platiumChestplate = new ItemArmor(platiumArmorMaterial, 0, 1) {
            {
                setUnlocalizedName("platiumChestplate");
                setTextureName(Reference.ModID + ":platium_chestplate");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/platium_layer_1.png";
            }
        };

        platiumLeggings = new ItemArmor(platiumArmorMaterial, 0, 2) {
            {
                setUnlocalizedName("platiumLeggings");
                setTextureName(Reference.ModID + ":platium_leggings");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/platium_layer_2.png";
            }
        };

        platiumBoots = new ItemArmor(platiumArmorMaterial, 0, 3) {
            {
                setUnlocalizedName("platiumBoots");
                setTextureName(Reference.ModID + ":platium_boots");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/platium_layer_1.png";
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }

}
