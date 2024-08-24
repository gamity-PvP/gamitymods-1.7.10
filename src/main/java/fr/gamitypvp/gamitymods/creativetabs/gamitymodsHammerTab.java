package fr.gamitypvp.gamitymods.creativetabs;

import fr.gamitypvp.gamitymods.materials.gamity.Tools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import fr.gamitypvp.gamitymods.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class gamitymodsHammerTab extends CreativeTabs
{

	public gamitymodsHammerTab(int id, String name)
	{
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTabLabel()
	{
		return "gamitymods Hammer";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "gamitymods Hammer";
	}

	@Override
	public Item getTabIconItem()
	{
		return Tools.gamityHammer;
	}

}
