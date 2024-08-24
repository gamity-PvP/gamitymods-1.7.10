package fr.gamitypvp.gamitymods.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.gamitypvp.gamitymods.materials.gamity.GamityItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GamityTab  extends CreativeTabs
{

    public GamityTab(int id, String name)
    {
        super(id, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTabLabel()
    {
        return "Gamity Mods";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Gamity Mods";
    }

    @Override
    public Item getTabIconItem()
    {
        return GamityItems.gamityIngot;
    }

}