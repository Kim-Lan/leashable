package com.kimlan.leashable.mixin;

import net.minecraft.world.entity.animal.panda.Panda;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(Panda.class)
public class PandaMixin {
    @ModifyReturnValue(
        method = "canBeLeashed",
        at = @At("RETURN")
    )
    private boolean modifyCanBeLeashed(boolean original) {
        return true;
    }
}