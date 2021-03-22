package rollout.soulify.core.registry;

import co.eltrut.differentiate.core.registrator.TileEntityHelper;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import rollout.soulify.common.tileentities.SoulFurnaceTileEntity;
import rollout.soulify.core.Soulify;

@Mod.EventBusSubscriber(modid = Soulify.MOD_ID, bus = Bus.MOD)
public class SoulifyTileEntities {

	public static final TileEntityHelper HELPER = Soulify.REGISTRATOR.getHelper(ForgeRegistries.TILE_ENTITIES);
	
	public static final RegistryObject<TileEntityType<SoulFurnaceTileEntity>> SOUL_FURNACE = HELPER.createTileEntity("soul_furnace", SoulFurnaceTileEntity::new, () -> new Block[] {SoulifyBlocks.SOUL_FURNACE.get()});
	
}
