package fr.gamitypvp.gamitymods.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.item.ItemStack;
import fr.gamitypvp.gamitymods.utils.RandomUtils;

public class UpgradeManager
{
	private static final UpgradeManager instance = new UpgradeManager();
	public List upgrades = new ArrayList();
	
	public UpgradeManager()
	{
	}

	public void addUpgrade(int id, int level, String modID, String itemName, int meta, int xpCost, int matCost, String levelString, float chance)
	{
		ItemStack stack = RandomUtils.getItemStackFromString(modID, itemName, 1);
		if (stack != null)
		{
			Upgrade upgrade = new Upgrade(id, level, new ItemStack(stack.getItem(), 1, meta), xpCost, matCost, levelString, chance);
			upgrades.add(upgrade);
		}
	}

	public static UpgradeManager getInstance()
	{
		return instance;
	}

	public List getUpgradeList()
	{
		return this.upgrades;
	}
	
	public static float getChance(int level)
	{
		List<IUpgrade> upgrades = UpgradeManager.getInstance().getUpgradeList();
		Iterator<IUpgrade> iterator = upgrades.iterator();
		while (iterator.hasNext())
		{
			IUpgrade upgrade = iterator.next();
			if(level == upgrade.getLevel())
			{
				return upgrade.getEnergyChance();
			}
		}
		return 0.0f;
	}
	
	public static String getNumberString(int level)
	{
		List<IUpgrade> upgrades = UpgradeManager.getInstance().getUpgradeList();
		Iterator<IUpgrade> iterator = upgrades.iterator();
		while (iterator.hasNext())
		{
			IUpgrade upgrade = iterator.next();
			if(level == upgrade.getLevel())
			{
				return upgrade.getLevelString();
			}
		}
		return "";
	}
	
	public static ItemStack getItem(int level)
	{
		List<IUpgrade> upgrades = UpgradeManager.getInstance().getUpgradeList();
		Iterator<IUpgrade> iterator = upgrades.iterator();
		while (iterator.hasNext())
		{
			IUpgrade upgrade = iterator.next();
			if(level == upgrade.getLevel())
			{
				return upgrade.getItem();
			}
		}
		return null;
	}
	
	public static int getXPCost(int level)
	{
		List<IUpgrade> upgrades = UpgradeManager.getInstance().getUpgradeList();
		Iterator<IUpgrade> iterator = upgrades.iterator();
		while (iterator.hasNext())
		{
			IUpgrade upgrade = iterator.next();
			if(level == upgrade.getLevel())
			{
				return upgrade.getCost();
			}
		}
		return 0;
	}
}
