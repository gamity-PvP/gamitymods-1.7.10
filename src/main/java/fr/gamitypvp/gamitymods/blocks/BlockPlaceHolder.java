package fr.gamitypvp.gamitymods.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.gamitypvp.gamitymods.Reference;
import fr.gamitypvp.gamitymods.gamitymods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockPlaceHolder extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    private final int index;

    public BlockPlaceHolder(int index) {
        super(Material.ground);
        this.index = index;
        setHardness(5);
        setStepSound(Block.soundTypeStone);
        setBlockName("PlaceHolder" + index);
        setCreativeTab(gamitymods.PlaceholderBlockTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        icons = new IIcon[6];
        for (int i = 0; i < 6; i++) {
            icons[i] = iconRegister.registerIcon(Reference.ModID + ":PlaceHolder" + index + "/face" + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return icons[1];
        }
        if (side == 0) {
            return icons[0];
        }
        if (side != meta) {
            if (side == 2) {
                if (meta == 0) {
                    return icons[2];
                }
                return icons[meta];
            } else {
                return icons[side];
            }
        }
        return icons[2];
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        int l = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
}
