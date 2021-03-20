package rollout.soulify.core.registry;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import rollout.soulify.core.Soulify;

@Mod.EventBusSubscriber(modid = Soulify.MOD_ID, bus = Bus.MOD)
public class SoulifyBlocks {
	
	public static final BlockHelper HELPER = Soulify.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
}