package rollout.soulify.core.registry;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import rollout.soulify.common.blocks.SoulMagmaBlock;
import rollout.soulify.core.Soulify;

@Mod.EventBusSubscriber(modid = Soulify.MOD_ID, bus = Bus.MOD)
public class SoulifyBlocks {
	
	public static final BlockHelper HELPER = Soulify.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
	public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = HELPER.createSimpleBlock("soul_magma_block", () -> new SoulMagmaBlock(Block.Properties.from(Blocks.MAGMA_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	
}