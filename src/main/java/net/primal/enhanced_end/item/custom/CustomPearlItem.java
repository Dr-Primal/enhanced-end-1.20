package net.primal.enhanced_end.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.primal.enhanced_end.entity.projectile.thrown.CustomPearlEntity;
import net.primal.enhanced_end.item.EEItems;

public class CustomPearlItem extends Item {
    public CustomPearlItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (itemStack.isOf(EEItems.ENHANCED_PEARL)) {
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 1.5f, 2.5f / (world.getRandom().nextFloat() + 1f));
            user.getItemCooldownManager().set(this, 30);
            if (!world.isClient) {
                CustomPearlEntity CustomPearlEntity = new CustomPearlEntity(world, user);
                CustomPearlEntity.setItem(itemStack);
                CustomPearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 4f, 0.0f);
                world.spawnEntity(CustomPearlEntity);
            }
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            return TypedActionResult.success(itemStack, world.isClient());
        }
        else if (itemStack.isOf(EEItems.PHANTOM_PEARL))
        {
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 3f, 4f / (world.getRandom().nextFloat() * 1f + 1f));
            user.getItemCooldownManager().set(this, 5);
            if (!world.isClient) {
                CustomPearlEntity customPearlEntity = new CustomPearlEntity(world, user);
                customPearlEntity.setItem(itemStack);
                customPearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 4f, 0.0f);
                world.spawnEntity(customPearlEntity);
                itemStack.damage(1, user, p -> p.sendToolBreakStatus(hand));
            }
            user.incrementStat(Stats.USED.getOrCreateStat(this));

            return TypedActionResult.success(itemStack, world.isClient());
        }
        return TypedActionResult.fail(itemStack);
    }
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(Items.ENDER_PEARL) || super.canRepair(stack, ingredient);
    }
}

