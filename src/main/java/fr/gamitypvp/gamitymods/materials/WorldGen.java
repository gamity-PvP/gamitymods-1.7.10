package fr.gamitypvp.gamitymods.materials;

import cpw.mods.fml.common.IWorldGenerator;
import fr.gamitypvp.gamitymods.config.ConfigOptions;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import java.util.Random;

public class WorldGen implements IWorldGenerator {
    private final Block ore;
    private final int min;
    private final int max;
    private final int maxVein;
    private final int chance;
    public WorldGen(Block ore, int min,int max, int maxVein,int chance){
        this.ore = ore;
        this.min = min;
        this.max = max;
        this.maxVein = maxVein;
        this.chance = chance;
    }


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ore, world, random, chunkX * 16, chunkZ * 16, min, max, maxVein, chance);
    }

    private void generateOre(Block block, World world, Random random, int x, int z, int minY, int maxY, int maxVeinSize, int chancesToSpawn) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chancesToSpawn; i++) {
            int posX = x + random.nextInt(16);
            int posY = minY + random.nextInt(deltaY);
            int posZ = z + random.nextInt(16);
            new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
        }
    }
}
