package fr.gamitypvp.gamitymods.items;

import java.util.LinkedHashMap;

import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import fr.gamitypvp.gamitymods.config.ConfigOptions;
import cpw.mods.fml.common.registry.GameRegistry;


public class Items
{
	public static Item[] PlaceHolderItems = new Item[ConfigOptions.placeholder.placeholderItemNumber+1];
	public static Item PlaceHolderItemsView;
	public static void preInit()
	{
	}

	public static void init()
	{
		PlaceHolderItemsView = new Item().setUnlocalizedName("ItemPlaceHolderView")
				.setTextureName(Reference.ModID + ":ItemPlaceHolderView");
		GameRegistry.registerItem(PlaceHolderItemsView, PlaceHolderItemsView.getUnlocalizedName());
		if (ConfigOptions.placeholder.placeholderItemNumber > 0) {
			PlaceHolderItems = new Item[ConfigOptions.placeholder.placeholderItemNumber];
			for (int i = 0; i < ConfigOptions.placeholder.placeholderItemNumber; i++) {
				PlaceHolderItems[i] = new Item().setUnlocalizedName("ItemPlaceHolder" + (i + 1))
						.setTextureName(Reference.ModID + ":ItemPlaceHolder" + (i + 1))
						.setCreativeTab(gamitymods.PlaceholderItemTab);
				GameRegistry.registerItem(PlaceHolderItems[i], PlaceHolderItems[i].getUnlocalizedName());
			}
		}
	}

}
