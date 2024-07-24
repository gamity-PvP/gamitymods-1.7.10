package fr.gamitypvp.gamitymods.blocks;

import fr.gamitypvp.gamitymods.config.ConfigOptions;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import fr.gamitypvp.gamitymods.blocks.BlockPlaceHolder;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks
{
	public static Block StorageBlock;
	public static Block[] placeholderBlocks = new Block[ConfigOptions.placeholderBlockNumber + 1];

	public static void init()
	{
		for (int i = 0; i < ConfigOptions.placeholderBlockNumber; i++) {
			placeholderBlocks[i] = new BlockPlaceHolder(i + 1).setBlockTextureName("placeHolder:PlaceHolder" + (i + 1));
			GameRegistry.registerBlock(placeholderBlocks[i], "PlaceHolder" + (i + 1));
		}
	}
}
