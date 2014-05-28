package net.pixelight.modularmachines.common.block.prefab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

/**
 * @author Royalixor.
 */
public abstract class MMBasicBlock extends Block {

    public MMBasicBlock(Material material) {
        super(material);
    }

    public MMBasicBlock(Material material, float hardness, float resistance) {
        this(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    @SideOnly(Side.CLIENT)
    public abstract boolean useCustomRender();

    @SideOnly(Side.CLIENT)
    public abstract void registerBlockIcons(IIconRegister iconRegister);

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return Blocks.stone.getIcon(0, 0);
    }

}
