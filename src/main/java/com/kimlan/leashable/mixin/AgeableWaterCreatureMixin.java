package com.kimlan.leashable.mixin;

import net.minecraft.world.entity.animal.AgeableWaterCreature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(AgeableWaterCreature.class)
public class AgeableWaterCreatureMixin {
    @ModifyReturnValue(
        method = "canBeLeashed",
        at = @At("RETURN")
    )
    private boolean modifyCanBeLeashed(boolean original) {
        return true;
    }
}