package fr.gamitypvp.gamitymods.config;

import java.io.File;


public class ConfigHandler
{
	
	public static void earlyInit(File configPath)
	{
		GamitymodsConfig.preInit(new File(configPath + "/gamitymods/" + "gamitymods.cfg"));
		
	}

	public static void lateInit(File configPath)
	{
		GamitymodsConfig.init(new File(configPath + "/gamitymods/" + "gamitymods.cfg"));
	}
}
