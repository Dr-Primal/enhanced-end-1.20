package net.primal.enhanced_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.*;
import net.primal.enhanced_end.block.EEBlocks;
import net.primal.enhanced_end.effect.EEEffects;
import net.primal.enhanced_end.util.EETags;
import org.jetbrains.annotations.Nullable;

public class DragonFireBlock extends FireBlock {
    public DragonFireBlock(Settings settings) {
        super(settings);
    }


    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (this.canPlaceAt(state, world, pos)) {
            return this.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return DragonFireBlock.getState(ctx.getWorld(), ctx.getBlockPos());
    }

    public static BlockState getState(BlockView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (DragonFireBlock.isDragonBase(blockState)) {
            return EEBlocks.DRAGON_FIRE.getDefaultState();
        }
        return AbstractFireBlock.getState(world, pos);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!entity.isFireImmune()) {
            Difficulty difficulty = entity.getWorld().getDifficulty();
            if ((entity instanceof LivingEntity) && entity.isAlive()) {
                if (difficulty == Difficulty.EASY) {
                    ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(EEEffects.ACIDOSIS, 200, 0));
                }
                else if (difficulty == Difficulty.NORMAL) {
                    ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(EEEffects.ACIDOSIS, 400, 0));
                }
                else if (difficulty == Difficulty.HARD) {
                    ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(EEEffects.ACIDOSIS, 600, 0));
                }
                entity.setFireTicks(entity.getFireTicks() + 1);
                if (entity.getFireTicks() == 0) {
                    entity.setOnFireFor(8);
                }
            }
        }
        entity.damage(world.getDamageSources().inFire(), 4.0f);
        super.onEntityCollision(state, world, pos, entity);
    }


    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return DragonFireBlock.isDragonBase(world.getBlockState(pos.down()));
    }

    public static boolean isDragonBase(BlockState state) {
        return state.isIn(EETags.Blocks.DRAGON_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return false;
    }
}
