package fr.gamitypvp.gamitymods.config;

import java.io.File;
import java.util.ArrayList;

import net.minecraftforge.common.config.Configuration;

public class GamitymodsConfig
{
	public static Configuration config;
	public static String CatHammer = "Hammer Values";
	public static String CatPlaceHolder = "PlaceHolder";

	public static String durabilityMultiplierComment = "Durability Multiplier for hammers from base toolset durability";
	public static String efficiencyMultiplierComment = "Efficiency Multiplier for hammers from base toolset efficiency";
	public static String placeHolderBlockNumberComment = "Number of placeholder block creating !!! WARNINGS !!! DON'T TOUCH THE GAME MAYBE CORRUPTED";
	public static String placeHolderItemNumberComment = "Number of placeholder item creating !!! WARNINGS !!! DON'T TOUCH THE GAME MAYBE CORRUPTED";
	public static String placeHolderSkullNumberComment = "Number of placeholder skull creating !!! WARNINGS !!! DON'T TOUCH THE GAME MAYBE CORRUPTED";

	public static void preInit(File gamitymodsCFG)
	{
		config = new Configuration(gamitymodsCFG);
		config.load();
		ConfigOptions.DurabilityMultiplier = config.getFloat("Hammer Durability Multiplier", CatHammer, 6.0f, 1.0f, 9.0f,
				durabilityMultiplierComment);
		config.save();

	}

	public static void init(File gamitymodsCFG)
	{
		config = new Configuration(gamitymodsCFG);
		config.load();
		ConfigOptions.EfficiencyMultiplier = config.getFloat("Hammer Efficiency Multiplier", CatHammer, 0.25f, 0.05f, 1.0f,
				efficiencyMultiplierComment);
		ConfigOptions.placeholderBlockNumber = config.getInt("PlaceHolder Block Number",CatPlaceHolder,16,1,256,placeHolderBlockNumberComment);
		ConfigOptions.placeholderItemNumber = config.getInt("PlaceHolder Item Number",CatPlaceHolder,16,1,256,placeHolderItemNumberComment);
		ConfigOptions.placeholderSkullNumber = config.getInt("PlaceHolder Skull Number",CatPlaceHolder,16,1,256,placeHolderSkullNumberComment);
		config.save();
	}

}
