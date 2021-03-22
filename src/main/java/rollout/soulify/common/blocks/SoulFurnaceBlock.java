package rollout.soulify.common.blocks;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import rollout.soulify.common.tileentities.SoulFurnaceTileEntity;

public class SoulFurnaceBlock extends AbstractFurnaceBlock {

	public SoulFurnaceBlock(Properties properties) {
		super(properties);
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return new SoulFurnaceTileEntity();
	}

	@Override
	protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof SoulFurnaceTileEntity) {
			player.openContainer((INamedContainerProvider)tileentity);
		}
	}

}
