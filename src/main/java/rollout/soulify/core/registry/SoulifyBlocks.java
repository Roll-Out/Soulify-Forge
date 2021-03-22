package rollout.soulify.core.registry;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import rollout.soulify.common.blocks.CarvedSoulPumpkinBlock;
import rollout.soulify.common.blocks.SoulFurnaceBlock;
import rollout.soulify.common.blocks.SoulMagmaBlock;
import rollout.soulify.common.blocks.SoulPumpkinBlock;
import rollout.soulify.core.Soulify;

@Mod.EventBusSubscriber(modid = Soulify.MOD_ID, bus = Bus.MOD)
public class SoulifyBlocks {
	
	public static final BlockHelper HELPER = Soulify.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
	public static final RegistryObject<Block> SOUL_MAGMA_BLOCK = HELPER.createSimpleBlock("soul_magma_block", () -> new SoulMagmaBlock(Block.Properties.from(Blocks.MAGMA_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SOUL_PUMPKIN = HELPER.createSimpleBlock("soul_pumpkin", () -> new SoulPumpkinBlock(Block.Properties.from(Blocks.PUMPKIN)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CARVED_SOUL_PUMPKIN = HELPER.createSimpleBlock("carved_soul_pumpkin", () -> new CarvedSoulPumpkinBlock(Block.Properties.from(Blocks.CARVED_PUMPKIN)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SOUL_JACK_O_LANTERN = HELPER.createSimpleBlock("soul_jack_o_lantern", () -> new CarvedSoulPumpkinBlock(Block.Properties.from(Blocks.JACK_O_LANTERN).setLightLevel((a) -> {return 10;})), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SOUL_FURNACE = HELPER.createSimpleBlock("soul_furnace", () -> new SoulFurnaceBlock(Block.Properties.from(Blocks.FURNACE).setLightLevel((s) -> {return s.get(BlockStateProperties.LIT) ? 8 : 0;})), ItemGroup.DECORATIONS);
	
}