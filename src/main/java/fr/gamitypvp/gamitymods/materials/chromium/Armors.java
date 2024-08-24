package fr.gamitypvp.gamitymods.materials.chromium;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Armors {
    public static Item chromiumHelmet;
    public static Item chromiumChestplate;
    public static Item chromiumLeggings;
    public static Item chromiumBoots;
    private void register(){
        GameRegistry.registerItem(chromiumHelmet, "chromiumHelmet");
        GameRegistry.registerItem(chromiumChestplate, "chromiumChestplate");
        GameRegistry.registerItem(chromiumLeggings, "chromiumLeggings");
        GameRegistry.registerItem(chromiumBoots, "chromiumBoots");
    }
    public void preInit(){
        ItemArmor.ArmorMaterial chromiumArmorMaterial = EnumHelper.addArmorMaterial("CHROMIUM", ConfigOptions.Gamity.Armor.chromiumDura, new int[]{ConfigOptions.Gamity.Armor.chromiumProtectHead, ConfigOptions.Gamity.Armor.chromiumProtectChest, ConfigOptions.Gamity.Armor.chromiumProtectLeg, ConfigOptions.Gamity.Armor.chromiumProtectFoot}, ConfigOptions.Gamity.Armor.chromiumProtectEnch);

        chromiumHelmet = new ItemArmor(chromiumArmorMaterial, 0, 0) {
            {
                setUnlocalizedName("chromiumHelmet");
                setTextureName(Reference.ModID + ":chromium_helmet");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/chromium_layer_1.png";
            }
        };

        chromiumChestplate = new ItemArmor(chromiumArmorMaterial, 0, 1) {
            {
                setUnlocalizedName("chromiumChestplate");
                setTextureName(Reference.ModID + ":chromium_chestplate");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/chromium_layer_1.png";
            }
        };

        chromiumLeggings = new ItemArmor(chromiumArmorMaterial, 0, 2) {
            {
                setUnlocalizedName("chromiumLeggings");
                setTextureName(Reference.ModID + ":chromium_leggings");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/chromium_layer_2.png";
            }
        };

        chromiumBoots = new ItemArmor(chromiumArmorMaterial, 0, 3) {
            {
                setUnlocalizedName("chromiumBoots");
                setTextureName(Reference.ModID + ":chromium_boots");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/chromium_layer_1.png";
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }

}
