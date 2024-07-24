package fr.gamitypvp.gamitymods.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DropHandler
{
	static final List<String> validBlocks = Arrays.asList(new String[]
	{
			"dirt", "sand", "gravel", "cobblestone", "netherrack"
	});

	public ItemStack getOreCluster(EntityPlayer harvester, ItemStack drop)
	{
		float chance = 0.33f;
		chance = chance + (0.14f * EnchantmentHelper.getFortuneModifier(harvester));
		Random random = new Random();
		if (random.nextFloat() <= chance)
		{
			int[] ids = OreDictionary.getOreIDs(new ItemStack(drop.getItem(), 1, drop.getItemDamage()));
			for(int i = 0; i < ids.length; i++)
			{
				String name = OreDictionary.getOreName(ids[i]);
				ArrayList<ItemStack> clusterList = OreDictionary.getOres(name.replace("ore", "cluster"));
				if(!clusterList.isEmpty())
				{
					ItemStack cluster = clusterList.get(0);
					if(cluster != null)
					{
						return cluster.copy();
					}
				}
			}
		}
		return null;
	}


	public static boolean isDisposable(Block block)
	{
		for (int id : OreDictionary.getOreIDs(new ItemStack(block)))
		{
			if (validBlocks.contains(OreDictionary.getOreName(id)))
			{
				return true;
			}
		}

		return false;
	}
}
