package fr.gamitypvp.gamitymods.materials.copper;

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
    public static Item copperHelmet;
    public static Item copperChestplate;
    public static Item copperLeggings;
    public static Item copperBoots;
    private void register(){
        GameRegistry.registerItem(copperHelmet, "copperHelmet");
        GameRegistry.registerItem(copperChestplate, "copperChestplate");
        GameRegistry.registerItem(copperLeggings, "copperLeggings");
        GameRegistry.registerItem(copperBoots, "copperBoots");
    }
    public void preInit(){
        ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", ConfigOptions.Gamity.Armor.copperDura, new int[]{ConfigOptions.Gamity.Armor.copperProtectHead, ConfigOptions.Gamity.Armor.copperProtectChest, ConfigOptions.Gamity.Armor.copperProtectLeg, ConfigOptions.Gamity.Armor.copperProtectFoot}, ConfigOptions.Gamity.Armor.copperProtectEnch);

        copperHelmet = new ItemArmor(copperArmorMaterial, 0, 0) {
            {
                setUnlocalizedName("copperHelmet");
                setTextureName(Reference.ModID + ":copper_helmet");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/copper_layer_1.png";
            }
        };

        copperChestplate = new ItemArmor(copperArmorMaterial, 0, 1) {
            {
                setUnlocalizedName("copperChestplate");
                setTextureName(Reference.ModID + ":copper_chestplate");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/copper_layer_1.png";
            }
        };

        copperLeggings = new ItemArmor(copperArmorMaterial, 0, 2) {
            {
                setUnlocalizedName("copperLeggings");
                setTextureName(Reference.ModID + ":copper_leggings");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/copper_layer_2.png";
            }
        };

        copperBoots = new ItemArmor(copperArmorMaterial, 0, 3) {
            {
                setUnlocalizedName("copperBoots");
                setTextureName(Reference.ModID + ":copper_boots");
                setCreativeTab(gamitymods.GamityTab);
            }
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
                return Reference.ModID + ":textures/models/armor/copper_layer_1.png";
            }
        };
        register();
    }
    public void init(){

    }
    public void postInit(){

    }

}
