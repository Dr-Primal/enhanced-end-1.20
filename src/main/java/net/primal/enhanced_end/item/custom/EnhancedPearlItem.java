package net.primal.enhanced_end.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.primal.enhanced_end.entity.projectile.thrown.EnhancedPearlEntity;

public class EnhancedPearlItem extends Item {
    public EnhancedPearlItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 1.5f, 2.5f / (world.getRandom().nextFloat() + 1f));
        user.getItemCooldownManager().set(this, 30);
        if (!world.isClient) {
            EnhancedPearlEntity enhancedPearlEntity = new EnhancedPearlEntity(world, user);
            enhancedPearlEntity.setItem(itemStack);
            enhancedPearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 4f, 0.0f);
            world.spawnEntity(enhancedPearlEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}

