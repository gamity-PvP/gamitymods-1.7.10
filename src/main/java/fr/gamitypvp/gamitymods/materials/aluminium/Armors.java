package fr.gamitypvp.gamitymods.materials.aluminium;

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
    public static Item aluminiumHelmet;
    public static Item aluminiumChestplate;
    public static Item aluminiumLeggings;
    public static Item aluminiumBoots;
    private void register(){
        GameRegistry.registerItem(aluminiumHelmet, "aluminiumHelmet");
        GameRegistry.registerItem(aluminiumChestplate, "aluminiumChestplate");
        GameRegistry.registerItem(aluminiumLeggings, "aluminiumLeggings");
        GameRegistry.registerItem(aluminiumBoots, "aluminiumBoots");
    }
    public void preInit(){
        ItemArmor.ArmorMaterial aluminiumArmorMaterial = EnumHelper.addArmorMaterial("ALUMINiUM", ConfigOptions.Gamity.Armor.aluDura, new int[]{ConfigOptions.Gamity.Armor.aluProtectHead, ConfigOptions.Gamity.Armor.aluProtectChest, ConfigOptions.Gamity.Armor.aluProtectLeg, ConfigOptions.Gamity.Armor.aluProtectFoot}, ConfigOptions.Gamity.Armor.aluProtectEnch);

        aluminiumHelmet = new ItemArmor(aluminiumArmorMaterial, 0, 0) {
            {
                setUnlocalizedName("aluminiumHelmet");
                setTextureName(Reference.ModID + ":aluminium_helmet");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/aluminium_layer_1.png";
            }
        };

        aluminiumChestplate = new ItemArmor(aluminiumArmorMaterial, 0, 1) {
            {
                setUnlocalizedName("aluminiumChestplate");
                setTextureName(Reference.ModID + ":aluminium_chestplate");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/aluminium_layer_1.png";
            }
        };

        aluminiumLeggings = new ItemArmor(aluminiumArmorMaterial, 0, 2) {
            {
                setUnlocalizedName("aluminiumLeggings");
                setTextureName(Reference.ModID + ":aluminium_leggings");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/aluminium_layer_2.png";
            }
        };

        aluminiumBoots = new ItemArmor(aluminiumArmorMaterial, 0, 3) {
            {
                setUnlocalizedName("aluminiumBoots");
                setTextureName(Reference.ModID + ":aluminium_boots");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/aluminium_layer_1.png";
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }

}
