package net.primal.enhanced_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.primal.enhanced_end.block.EEBlocks;

public class FescusBlock extends FernBlock {
    public FescusBlock(Settings settings) {
        super(settings);
    }
    public static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 16.0, 13.0, 16.0);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(EEBlocks.MIDNIGHT_NYLIUM) ||
                floor.isOf(EEBlocks.CORLITE_NYLIUM)||
                floor.isOf(Blocks.END_STONE) ||
                super.canPlantOnTop(floor, world, pos);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }
}
