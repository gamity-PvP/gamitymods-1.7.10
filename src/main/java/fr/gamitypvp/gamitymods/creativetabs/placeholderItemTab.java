package fr.gamitypvp.gamitymods.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.gamitypvp.gamitymods.items.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class placeholderItemTab extends CreativeTabs
{

    public placeholderItemTab(int id, String name)
    {
        super(id, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTabLabel()
    {
        return "Placeholder Item";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Placeholder Item";
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.PlaceHolderItemsView;
    }

}