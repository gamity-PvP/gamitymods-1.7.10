package fr.gamitypvp.gamitymods.config;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class GamitymodsConfig {
	public static Configuration config;
	public static String CatHammer = "Hammer Values";
	public static String CatGamity = "Gamity Values";
	public static String CatPlaceHolder = "PlaceHolder";
	public static String SubCatGamityTools = CatGamity + ".Tools";
	public static String SubCatGamityBlock = CatGamity + ".Block";
	public static String SubCatGamityOreBlock = CatGamity + ".OreBlock";
	public static String SubCatGamitySword = CatGamity + ".Sword";
	public static String SubCatGamityArmor = CatGamity + ".Armor";
	public static String duraComment = "durability of the item";
	public static String hardComment = "hardness of the block";
	public static String protectComment = "protection of the armor";
	public static String resistanceComment = "resistance to explosion of the block";
	public static String toolComment = "tool required by the block to be break (pickaxe,axe,sword,...)";
	public static String levelComment = "level of the pickaxe for break the block (0: hand,1: wood,2: stone,3: iron,4: diamond)";
	public static String placeHolderBlockNumberComment = "Number of placeholder block creating !!! WARNINGS !!! DON'T TOUCH THE GAME MAYBE CORRUPTED";
	public static String placeHolderItemNumberComment = "Number of placeholder item creating !!! WARNINGS !!! DON'T TOUCH THE GAME MAYBE CORRUPTED";

	public static void preInit(File gamitymodsCFG) {
		// Any pre-initialization code if needed
	}

	public static void init(File gamitymodsCFG) {
		config = new Configuration(gamitymodsCFG);
		config.load();

		// Placeholder Configuration
		ConfigOptions.placeholder.placeholderBlockNumber = config.getInt("PlaceHolder Block Number", CatPlaceHolder, 16, 1, 256, placeHolderBlockNumberComment);
		ConfigOptions.placeholder.placeholderItemNumber = config.getInt("PlaceHolder Item Number", CatPlaceHolder, 16, 1, 256, placeHolderItemNumberComment);
		ConfigOptions.placeholder.hardness = config.getStringList("PlaceHolder hardness", CatPlaceHolder, new String[]{}, hardComment);
		ConfigOptions.placeholder.resistance = config.getStringList("PlaceHolder resistance", CatPlaceHolder, new String[]{}, resistanceComment);
		ConfigOptions.placeholder.level = config.getStringList("PlaceHolder level", CatPlaceHolder, new String[]{}, levelComment);
		ConfigOptions.placeholder.tool = config.getStringList("PlaceHolder tool", CatPlaceHolder, new String[]{}, toolComment);

		// Hammer Configuration
		ConfigOptions.Hammer.aluDura = config.getInt("alu dura", CatHammer, 0, 0, 10000000, duraComment);
		ConfigOptions.Hammer.copperDura = config.getInt("copper dura", CatHammer, 0, 0, 10000000, duraComment);
		ConfigOptions.Hammer.chromiumDura = config.getInt("chromium dura", CatHammer, 0, 0, 10000000, duraComment);
		ConfigOptions.Hammer.gamityDura = config.getInt("gamity dura", CatHammer, 0, 0, 10000000, duraComment);
		ConfigOptions.Hammer.platiumDura = config.getInt("platium dura", CatHammer, 0, 0, 10000000, duraComment);
		ConfigOptions.Hammer.aluEff = config.getInt("alu efficiency", CatHammer, 0, 0, 10000000, "Efficiency of the hammer.");
		ConfigOptions.Hammer.copperEff = config.getInt("copper efficiency", CatHammer, 0, 0, 10000000, "Efficiency of the hammer.");
		ConfigOptions.Hammer.chromiumEff = config.getInt("chromium efficiency", CatHammer, 0, 0, 10000000, "Efficiency of the hammer.");
		ConfigOptions.Hammer.gamityEff = config.getInt("gamity efficiency", CatHammer, 0, 0, 10000000, "Efficiency of the hammer.");
		ConfigOptions.Hammer.platiumEff = config.getInt("platium efficiency", CatHammer, 0, 0, 10000000, "Efficiency of the hammer.");
		ConfigOptions.Hammer.aluDamage = config.getInt("alu damage", CatHammer, 0, 0, 10000000, "Damage of the hammer.");
		ConfigOptions.Hammer.copperDamage = config.getInt("copper damage", CatHammer, 0, 0, 10000000, "Damage of the hammer.");
		ConfigOptions.Hammer.chromiumDamage = config.getInt("chromium damage", CatHammer, 0, 0, 10000000, "Damage of the hammer.");
		ConfigOptions.Hammer.gamityDamage = config.getInt("gamity damage", CatHammer, 0, 0, 10000000, "Damage of the hammer.");
		ConfigOptions.Hammer.platiumDamage = config.getInt("platium damage", CatHammer, 0, 0, 10000000, "Damage of the hammer.");

		// Tools Configuration
		ConfigOptions.Gamity.Tools.aluDura = config.getInt("alu dura", SubCatGamityTools, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Tools.copperDura = config.getInt("copper dura", SubCatGamityTools, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Tools.chromiumDura = config.getInt("chromium dura", SubCatGamityTools, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Tools.gamityDura = config.getInt("gamity dura", SubCatGamityTools, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Tools.platiumDura = config.getInt("platium dura", SubCatGamityTools, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Tools.aluEff = config.getInt("alu efficiency", SubCatGamityTools, 0, 0, 10000000, "Efficiency of the tool.");
		ConfigOptions.Gamity.Tools.copperEff = config.getInt("copper efficiency", SubCatGamityTools, 0, 0, 10000000, "Efficiency of the tool.");
		ConfigOptions.Gamity.Tools.chromiumEff = config.getInt("chromium efficiency", SubCatGamityTools, 0, 0, 10000000, "Efficiency of the tool.");
		ConfigOptions.Gamity.Tools.gamityEff = config.getInt("gamity efficiency", SubCatGamityTools, 0, 0, 10000000, "Efficiency of the tool.");
		ConfigOptions.Gamity.Tools.platiumEff = config.getInt("platium efficiency", SubCatGamityTools, 0, 0, 10000000, "Efficiency of the tool.");
		ConfigOptions.Gamity.Tools.aluDamage = config.getInt("alu damage", SubCatGamityTools, 0, 0, 10000000, "Damage of the tool.");
		ConfigOptions.Gamity.Tools.copperDamage = config.getInt("copper damage", SubCatGamityTools, 0, 0, 10000000, "Damage of the tool.");
		ConfigOptions.Gamity.Tools.chromiumDamage = config.getInt("chromium damage", SubCatGamityTools, 0, 0, 10000000, "Damage of the tool.");
		ConfigOptions.Gamity.Tools.gamityDamage = config.getInt("gamity damage", SubCatGamityTools, 0, 0, 10000000, "Damage of the tool.");
		ConfigOptions.Gamity.Tools.platiumDamage = config.getInt("platium damage", SubCatGamityTools, 0, 0, 10000000, "Damage of the tool.");
		ConfigOptions.Gamity.Tools.aluLevel = config.getInt("alu level", SubCatGamityTools, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Tools.copperLevel = config.getInt("copper level", SubCatGamityTools, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Tools.chromiumLevel = config.getInt("chromium level", SubCatGamityTools, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Tools.gamityLevel = config.getInt("gamity level", SubCatGamityTools, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Tools.platiumLevel = config.getInt("platium level", SubCatGamityTools, 0, 0, 10000000, levelComment);

		// Armor Configuration
		ConfigOptions.Gamity.Armor.aluDura = config.getInt("alu dura", SubCatGamityArmor, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Armor.copperDura = config.getInt("copper dura", SubCatGamityArmor, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Armor.chromiumDura = config.getInt("chromium dura", SubCatGamityArmor, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Armor.gamityDura = config.getInt("gamity dura", SubCatGamityArmor, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Armor.platiumDura = config.getInt("platium dura", SubCatGamityArmor, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Armor.aluProtectHead = config.getInt("alu protection head", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.copperProtectHead = config.getInt("copper protection head", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.chromiumProtectHead = config.getInt("chromium protection head", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.gamityProtectHead = config.getInt("gamity protection head", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.platiumProtectHead = config.getInt("platium protection head", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.aluProtectChest = config.getInt("alu protection chest", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.copperProtectChest = config.getInt("copper protection chest", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.chromiumProtectChest = config.getInt("chromium protection chest", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.gamityProtectChest = config.getInt("gamity protection chest", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.platiumProtectChest = config.getInt("platium protection chest", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.aluProtectLeg = config.getInt("alu protection leg", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.copperProtectLeg = config.getInt("copper protection leg", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.chromiumProtectLeg = config.getInt("chromium protection leg", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.gamityProtectLeg = config.getInt("gamity protection leg", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.platiumProtectleg = config.getInt("platium protection leg", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.aluProtectFoot = config.getInt("alu protection foot", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.copperProtectFoot = config.getInt("copper protection foot", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.chromiumProtectFoot = config.getInt("chromium protection foot", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.gamityProtectFoot = config.getInt("gamity protection foot", SubCatGamityArmor, 0, 0, 10000000, protectComment);
		ConfigOptions.Gamity.Armor.platiumProtectFoot = config.getInt("platium protection foot", SubCatGamityArmor, 0, 0, 10000000, protectComment);

		// Block Configuration
		ConfigOptions.Gamity.Block.aluHard = config.getInt("alu hard", SubCatGamityBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.Block.copperHard = config.getInt("copper hard", SubCatGamityBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.Block.chromiumHard = config.getInt("chromium hard", SubCatGamityBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.Block.gamityHard = config.getInt("gamity hard", SubCatGamityBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.Block.platiumHard = config.getInt("platium hard", SubCatGamityBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.Block.aluLevel = config.getInt("alu level", SubCatGamityBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Block.copperLevel = config.getInt("copper level", SubCatGamityBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Block.chromiumLevel = config.getInt("chromium level", SubCatGamityBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Block.gamityLevel = config.getInt("gamity level", SubCatGamityBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Block.platiumLevel = config.getInt("platium level", SubCatGamityBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.Block.aluResistance = config.getInt("alu resistance", SubCatGamityBlock, 0, 0, 10000000, resistanceComment);
		ConfigOptions.Gamity.Block.copperResistance = config.getInt("copper resistance", SubCatGamityBlock, 0, 0, 10000000, resistanceComment);
		ConfigOptions.Gamity.Block.chromiumResistance = config.getInt("chromium resistance", SubCatGamityBlock, 0, 0, 10000000, resistanceComment);
		ConfigOptions.Gamity.Block.gamityResistance = config.getInt("gamity resistance", SubCatGamityBlock, 0, 0, 10000000, resistanceComment);
		ConfigOptions.Gamity.Block.platiumResistance = config.getInt("platium resistance", SubCatGamityBlock, 0, 0, 10000000, resistanceComment);
// OreBlock Configuration
		ConfigOptions.Gamity.OreBlock.aluHard = config.getInt("alu hard", SubCatGamityOreBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.OreBlock.copperHard = config.getInt("copper hard", SubCatGamityOreBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.OreBlock.chromiumHard = config.getInt("chromium hard", SubCatGamityOreBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.OreBlock.gamityHard = config.getInt("gamity hard", SubCatGamityOreBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.OreBlock.platiumHard = config.getInt("platium hard", SubCatGamityOreBlock, 0, 0, 10000000, hardComment);
		ConfigOptions.Gamity.OreBlock.aluLevel = config.getInt("alu level", SubCatGamityOreBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.OreBlock.copperLevel = config.getInt("copper level", SubCatGamityOreBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.OreBlock.chromiumLevel = config.getInt("chromium level", SubCatGamityOreBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.OreBlock.gamityLevel = config.getInt("gamity level", SubCatGamityOreBlock, 0, 0, 10000000, levelComment);
		ConfigOptions.Gamity.OreBlock.platiumLevel = config.getInt("platium level", SubCatGamityOreBlock, 0, 0, 10000000, levelComment);

// OreBlock Spawn Configuration
		ConfigOptions.Gamity.OreBlock.aluSpawnRate = config.getInt("alu spawn rate", SubCatGamityOreBlock, 10, 1, 100, "Spawn rate of alu ore blocks.");
		ConfigOptions.Gamity.OreBlock.copperSpawnRate = config.getInt("copper spawn rate", SubCatGamityOreBlock, 10, 1, 100, "Spawn rate of copper ore blocks.");
		ConfigOptions.Gamity.OreBlock.chromiumSpawnRate = config.getInt("chromium spawn rate", SubCatGamityOreBlock, 10, 1, 100, "Spawn rate of chromium ore blocks.");
		ConfigOptions.Gamity.OreBlock.gamitySpawnRate = config.getInt("gamity spawn rate", SubCatGamityOreBlock, 10, 1, 100, "Spawn rate of gamity ore blocks.");
		ConfigOptions.Gamity.OreBlock.platiumSpawnRate = config.getInt("platium spawn rate", SubCatGamityOreBlock, 10, 1, 100, "Spawn rate of platium ore blocks.");

		ConfigOptions.Gamity.OreBlock.aluVeinSize = config.getInt("alu vein size", SubCatGamityOreBlock, 5, 1, 50, "Vein size of alu ore blocks.");
		ConfigOptions.Gamity.OreBlock.copperVeinSize = config.getInt("copper vein size", SubCatGamityOreBlock, 5, 1, 50, "Vein size of copper ore blocks.");
		ConfigOptions.Gamity.OreBlock.chromiumVeinSize = config.getInt("chromium vein size", SubCatGamityOreBlock, 5, 1, 50, "Vein size of chromium ore blocks.");
		ConfigOptions.Gamity.OreBlock.gamityVeinSize = config.getInt("gamity vein size", SubCatGamityOreBlock, 5, 1, 50, "Vein size of gamity ore blocks.");
		ConfigOptions.Gamity.OreBlock.platiumVeinSize = config.getInt("platium vein size", SubCatGamityOreBlock, 5, 1, 50, "Vein size of platium ore blocks.");

		ConfigOptions.Gamity.OreBlock.aluMinHeight = config.getInt("alu min height", SubCatGamityOreBlock, 0, 0, 255, "Minimum height for alu ore blocks.");
		ConfigOptions.Gamity.OreBlock.copperMinHeight = config.getInt("copper min height", SubCatGamityOreBlock, 0, 0, 255, "Minimum height for copper ore blocks.");
		ConfigOptions.Gamity.OreBlock.chromiumMinHeight = config.getInt("chromium min height", SubCatGamityOreBlock, 0, 0, 255, "Minimum height for chromium ore blocks.");
		ConfigOptions.Gamity.OreBlock.gamityMinHeight = config.getInt("gamity min height", SubCatGamityOreBlock, 0, 0, 255, "Minimum height for gamity ore blocks.");
		ConfigOptions.Gamity.OreBlock.platiumMinHeight = config.getInt("platium min height", SubCatGamityOreBlock, 0, 0, 255, "Minimum height for platium ore blocks.");

		ConfigOptions.Gamity.OreBlock.aluMaxHeight = config.getInt("alu max height", SubCatGamityOreBlock, 64, 0, 255, "Maximum height for alu ore blocks.");
		ConfigOptions.Gamity.OreBlock.copperMaxHeight = config.getInt("copper max height", SubCatGamityOreBlock, 64, 0, 255, "Maximum height for copper ore blocks.");
		ConfigOptions.Gamity.OreBlock.chromiumMaxHeight = config.getInt("chromium max height", SubCatGamityOreBlock, 64, 0, 255, "Maximum height for chromium ore blocks.");
		ConfigOptions.Gamity.OreBlock.gamityMaxHeight = config.getInt("gamity max height", SubCatGamityOreBlock, 64, 0, 255, "Maximum height for gamity ore blocks.");
		ConfigOptions.Gamity.OreBlock.platiumMaxHeight = config.getInt("platium max height", SubCatGamityOreBlock, 64, 0, 255, "Maximum height for platium ore blocks.");

// Tools for OreBlocks
		ConfigOptions.Gamity.OreBlock.aluTool = config.getString("alu tool", SubCatGamityOreBlock, "pickaxe", "Tool required to mine alu ore.");
		ConfigOptions.Gamity.OreBlock.copperTool = config.getString("copper tool", SubCatGamityOreBlock, "pickaxe", "Tool required to mine copper ore.");
		ConfigOptions.Gamity.OreBlock.chromiumTool = config.getString("chromium tool", SubCatGamityOreBlock, "pickaxe", "Tool required to mine chromium ore.");
		ConfigOptions.Gamity.OreBlock.gamityTool = config.getString("gamity tool", SubCatGamityOreBlock, "pickaxe", "Tool required to mine gamity ore.");
		ConfigOptions.Gamity.OreBlock.platiumTool = config.getString("platium tool", SubCatGamityOreBlock, "pickaxe", "Tool required to mine platium ore.");

		// Sword Configuration
		ConfigOptions.Gamity.Sword.aluDura = config.getInt("alu dura", SubCatGamitySword, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Sword.copperDura = config.getInt("copper dura", SubCatGamitySword, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Sword.chromiumDura = config.getInt("chromium dura", SubCatGamitySword, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Sword.gamityDura = config.getInt("gamity dura", SubCatGamitySword, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Sword.platiumDura = config.getInt("platium dura", SubCatGamitySword, 0, 0, 10000000, duraComment);
		ConfigOptions.Gamity.Sword.aluDamage = config.getInt("alu damage", SubCatGamitySword, 0, 0, 10000000, "Damage of the sword.");
		ConfigOptions.Gamity.Sword.copperDamage = config.getInt("copper damage", SubCatGamitySword, 0, 0, 10000000, "Damage of the sword.");
		ConfigOptions.Gamity.Sword.chromiumDamage = config.getInt("chromium damage", SubCatGamitySword, 0, 0, 10000000, "Damage of the sword.");
		ConfigOptions.Gamity.Sword.gamityDamage = config.getInt("gamity damage", SubCatGamitySword, 0, 0, 10000000, "Damage of the sword.");
		ConfigOptions.Gamity.Sword.platiumDamage = config.getInt("platium damage", SubCatGamitySword, 0, 0, 10000000, "Damage of the sword.");
		ConfigOptions.Gamity.Sword.aluEff = config.getInt("alu efficiency", SubCatGamitySword, 0, 0, 10000000, "Efficiency of the sword.");
		ConfigOptions.Gamity.Sword.copperEff = config.getInt("copper efficiency", SubCatGamitySword, 0, 0, 10000000, "Efficiency of the sword.");
		ConfigOptions.Gamity.Sword.chromiumEff = config.getInt("chromium efficiency", SubCatGamitySword, 0, 0, 10000000, "Efficiency of the sword.");
		ConfigOptions.Gamity.Sword.gamityEff = config.getInt("gamity efficiency", SubCatGamitySword, 0, 0, 10000000, "Efficiency of the sword.");
		ConfigOptions.Gamity.Sword.platiumEff = config.getInt("platium efficiency", SubCatGamitySword, 0, 0, 10000000, "Efficiency of the sword.");

		// Save the configuration
		config.save();
	}
}
