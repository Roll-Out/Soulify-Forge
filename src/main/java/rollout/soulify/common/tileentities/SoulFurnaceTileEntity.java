package rollout.soulify.common.tileentities;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import rollout.soulify.core.registry.SoulifyTileEntities;

public class SoulFurnaceTileEntity extends AbstractFurnaceTileEntity {

	public SoulFurnaceTileEntity() {
		super(SoulifyTileEntities.SOUL_FURNACE.get(), null); // TODO: replace with recipe type
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.soul_furnace");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return null; // TODO: replace with container
	}

}
