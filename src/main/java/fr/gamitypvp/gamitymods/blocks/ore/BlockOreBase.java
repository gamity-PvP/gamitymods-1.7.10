package fr.gamitypvp.gamitymods.blocks.ore;

import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreBase extends Block {
    public BlockOreBase(String name) {
        super(Material.rock);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.ModID + ":" + name);
        this.setHardness(3.0f);
        this.setResistance(5.0f);
        this.setCreativeTab(gamitymods.GamityTab);
    }
}
