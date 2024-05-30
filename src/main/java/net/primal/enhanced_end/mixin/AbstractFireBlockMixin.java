package net.primal.enhanced_end.mixin;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.block.custom.DragonFireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public class AbstractFireBlockMixin {
    @Inject(method="getState",at=@At("RETURN"), cancellable = true)
    private static void getState(BlockView world, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (DragonFireBlock.isDragonBase(blockState)) {
            cir.setReturnValue(EEBlocks.DRAGON_FIRE.getDefaultState());
        }
    }
}
