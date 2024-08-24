package fr.gamitypvp.gamitymods.blocks;

import fr.gamitypvp.gamitymods.blocks.ore.BlockOreBase;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks
{
	public static Block aluminiumOre;
	public static Block copperOre;
	public static Block chromiumOre;
	public static Block gamityOre;
	public static Block StorageBlock;
	public static Block placeholderBlocksView;
	public static Block[] placeholderBlocks = new Block[ConfigOptions.placeholder.placeholderBlockNumber + 1];

	public static void init()
	{
		aluminiumOre = new BlockOreBase("aluminium_ore");
		copperOre = new BlockOreBase("copper_ore");
		chromiumOre = new BlockOreBase("chromium_ore");
		gamityOre = new BlockOreBase("gamity_ore");

		GameRegistry.registerBlock(aluminiumOre, "aluminium_ore");
		GameRegistry.registerBlock(copperOre, "copper_ore");
		GameRegistry.registerBlock(chromiumOre, "chromium_ore");
		GameRegistry.registerBlock(gamityOre, "gamity_ore");
		for (int i = 0; i < ConfigOptions.placeholder.placeholderBlockNumber; i++) {
			placeholderBlocks[i] = new BlockPlaceHolder(i + 1).setBlockTextureName("placeHolder:PlaceHolder" + (i + 1));
			GameRegistry.registerBlock(placeholderBlocks[i], "PlaceHolder" + (i + 1));
		}
		placeholderBlocksView = new BlockPlaceHolder(1).setBlockTextureName("placeHolder:PlaceHolderView");
		GameRegistry.registerBlock(placeholderBlocksView, "PlaceHolderBlocksView");
	}
}
