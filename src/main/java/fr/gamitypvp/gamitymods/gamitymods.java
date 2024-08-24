package fr.gamitypvp.gamitymods;

import java.io.File;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.gamitypvp.gamitymods.creativetabs.GamityTab;
import fr.gamitypvp.gamitymods.creativetabs.placeholderBlockTab;
import fr.gamitypvp.gamitymods.creativetabs.placeholderItemTab;
import fr.gamitypvp.gamitymods.handlers.BreakBlockHandler;
import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.gamitypvp.gamitymods.blocks.Blocks;
import fr.gamitypvp.gamitymods.config.ConfigHandler;
import fr.gamitypvp.gamitymods.creativetabs.gamitymodsHammerTab;
import fr.gamitypvp.gamitymods.items.Items;
import fr.gamitypvp.gamitymods.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.opengl.Display;
import fr.gamitypvp.gamitymods.materials.aluminium.Aluminium;
import fr.gamitypvp.gamitymods.materials.copper.Copper;
import fr.gamitypvp.gamitymods.materials.chromium.Chromium;
import fr.gamitypvp.gamitymods.materials.gamity.Gamity;
import fr.gamitypvp.gamitymods.materials.platium.Platium;

@Mod(modid = Reference.ModID, version = Reference.Version, name = Reference.Name)
public class gamitymods
{
	@Instance(Reference.ModID)
	public static gamitymods Instance;

	@SidedProxy(clientSide = "fr.gamitypvp.gamitymods.proxies.ClientProxy", serverSide = "fr.gamitypvp.gamitymods.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs GamityHammerTab;
	public static CreativeTabs PlaceholderBlockTab;
	public static CreativeTabs PlaceholderItemTab;
	public static CreativeTabs GamityTab;
	public static final Logger log = LogManager.getLogger(Reference.ModID);
	public static File ConfigPath;
	private final Platium platium = new Platium();
	private final Gamity gamity = new Gamity();
	private final Copper copper = new Copper();
	private final Chromium chromium = new Chromium();
	private final Aluminium aluminium = new Aluminium();


	@SideOnly(Side.CLIENT)
	@EventHandler
	public void preInitClient(FMLPreInitializationEvent event)
	{
		Display.setTitle("Gamity v2.5");
	}
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		platium.preInit();
		gamity.preInit();
		copper.preInit();
		aluminium.preInit();
		chromium.preInit();
		gamitymods.log.log(Level.INFO, "Beginning preInit");
		ConfigPath = event.getModConfigurationDirectory();
		GamityHammerTab = new gamitymodsHammerTab(CreativeTabs.getNextID(), "CreativeTab");
		PlaceholderBlockTab = new placeholderBlockTab(CreativeTabs.getNextID(), "CreativeTab");
		PlaceholderItemTab = new placeholderItemTab(CreativeTabs.getNextID(), "CreativeTab");
		GamityTab = new GamityTab(CreativeTabs.getNextID(), "CreativeTab");
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		platium.init();
		gamity.init();
		copper.init();
		aluminium.init();
		chromium.init();
		gamitymods.log.log(Level.INFO, "Beginning Init");
		ConfigHandler.earlyInit(ConfigPath);

		Items.preInit();
		Blocks.init();

		ConfigHandler.lateInit(ConfigPath);
		Items.init();

		new BreakBlockHandler();
		proxy.load();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		platium.postInit();
		gamity.postInit();
		copper.postInit();
		aluminium.postInit();
		chromium.postInit();
	}
}
