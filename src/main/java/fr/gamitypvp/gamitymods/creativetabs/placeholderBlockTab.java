package fr.gamitypvp.gamitymods.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.gamitypvp.gamitymods.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class placeholderBlockTab  extends CreativeTabs
{

    public placeholderBlockTab(int id, String name)
    {
        super(id, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTabLabel()
    {
        return "Placeholder Block";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Placeholder Block";
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.placeholderBlocks[0]);
    }

}