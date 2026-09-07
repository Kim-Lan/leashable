package com.kimlan.leashable.mixin;

import net.minecraft.world.entity.npc.villager.AbstractVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(AbstractVillager.class)
public class AbstractVillagerMixin {
    @ModifyReturnValue(
        method = "canBeLeashed",
        at = @At("RETURN")
    )
    private boolean modifyCanBeLeashed(boolean original) {
        return true;
    }
}