package fr.gamitypvp.gamitymods.materials.gamity;

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
    public static Item gamityHelmet;
    public static Item gamityChestplate;
    public static Item gamityLeggings;
    public static Item gamityBoots;
    private void register(){
        GameRegistry.registerItem(gamityHelmet, "gamityHelmet");
        GameRegistry.registerItem(gamityChestplate, "gamityChestplate");
        GameRegistry.registerItem(gamityLeggings, "gamityLeggings");
        GameRegistry.registerItem(gamityBoots, "gamityBoots");
    }
    public void preInit(){
        ItemArmor.ArmorMaterial gamityArmorMaterial = EnumHelper.addArmorMaterial("GAMITY", ConfigOptions.Gamity.Armor.gamityDura, new int[]{ConfigOptions.Gamity.Armor.gamityProtectHead, ConfigOptions.Gamity.Armor.gamityProtectChest, ConfigOptions.Gamity.Armor.gamityProtectLeg, ConfigOptions.Gamity.Armor.gamityProtectFoot}, ConfigOptions.Gamity.Armor.gamityProtectEnch);

        gamityHelmet = new ItemArmor(gamityArmorMaterial, 0, 0) {
            {
                setUnlocalizedName("gamityHelmet");
                setTextureName(Reference.ModID + ":gamity_helmet");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/gamity_layer_1.png";
            }
        };

        gamityChestplate = new ItemArmor(gamityArmorMaterial, 0, 1) {
            {
                setUnlocalizedName("gamityChestplate");
                setTextureName(Reference.ModID + ":gamity_chestplate");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/gamity_layer_1.png";
            }
        };

        gamityLeggings = new ItemArmor(gamityArmorMaterial, 0, 2) {
            {
                setUnlocalizedName("gamityLeggings");
                setTextureName(Reference.ModID + ":gamity_leggings");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/gamity_layer_2.png";
            }
        };

        gamityBoots = new ItemArmor(gamityArmorMaterial, 0, 3) {
            {
                setUnlocalizedName("gamityBoots");
                setTextureName(Reference.ModID + ":gamity_boots");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/gamity_layer_1.png";
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }

}
