package fr.gamitypvp.gamitymods.items;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.oredict.OreDictionary;

import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.config.GamitymodsConfig;
import cpw.mods.fml.common.registry.GameRegistry;


public class Items
{
	public static LinkedHashMap<Item, String> oreDictItems = new LinkedHashMap<Item, String>();
	public static Item AluminiumHammer;
	public static Item CopperHammer;
	public static Item ChromiumHammer;
	public static Item GamityHammer;
	public static Item PlatiumHammer;
	public static Item[] PlaceHolderItems = new Item[ConfigOptions.placeholderItemNumber+1];
	public static void preInit()
	{
		AluminiumHammer = new Hammer(ToolMaterial.GOLD, "Aluminium");
		CopperHammer = new Hammer(ToolMaterial.GOLD, "Copper");
		ChromiumHammer = new Hammer(ToolMaterial.GOLD, "Chromium");
		GamityHammer = new Hammer(ToolMaterial.GOLD, "Gamity");
		PlatiumHammer = new Hammer(ToolMaterial.EMERALD, "Platium");
	}

	public static void init()
	{
		for (int i = 0; i < ConfigOptions.placeholderItemNumber; i++) {
			PlaceHolderItems[i] = new Item().setUnlocalizedName("ItemPlaceHolder" + (i + 1))
					.setTextureName(Reference.ModID + ":ItemPlaceHolder" + (i + 1))
					.setCreativeTab(gamitymods.PlaceholderItemTab);
			GameRegistry.registerItem(PlaceHolderItems[i], PlaceHolderItems[i].getUnlocalizedName());
		}
		registerItem(AluminiumHammer, "AluminiumHammer");
		registerItem(CopperHammer, "CopperHammer");
		registerItem(ChromiumHammer, "ChromiumHammer");
		registerItem(GamityHammer, "GamityHammer");
		registerItem(PlatiumHammer, "PlatiumHammer");
		
		registerOreDictHammers(oreDictItems);
	}

	public static void registerItem(Item item, String name)
	{
			GameRegistry.registerItem(item, name);
	}

	public static void registerOreDictHammers(HashMap<Item, String> map)
	{
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		int i = 0;
		while (iterator.hasNext())
		{
			Map.Entry<Item, String> entry = (Map.Entry<Item, String>) iterator.next();
			GameRegistry.registerItem((Item) entry.getKey(), (String) entry.getValue() + "Hammer");
			i++;
		}
	}
}
