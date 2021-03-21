package rollout.soulify.core.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.BlockState;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import rollout.soulify.core.registry.SoulifyBlocks;

@Mixin(BubbleColumnBlock.class)
public class BubbleColumnBlockMixin {
	
	@Inject(at = @At("RETURN"), method = "isValidPosition(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/IWorldReader;Lnet/minecraft/util/math/BlockPos;)Z", cancellable = true)
	private void isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos, CallbackInfoReturnable<Boolean> callback) {
		callback.setReturnValue(worldIn.getBlockState(pos.down()).isIn(SoulifyBlocks.SOUL_MAGMA_BLOCK.get()) || callback.getReturnValue());
	}
	
}
