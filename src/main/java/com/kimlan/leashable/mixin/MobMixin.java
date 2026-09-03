package com.kimlan.leashable.mixin;

import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;

@Mixin(Mob.class)
public class MobMixin {
	@ModifyReturnValue(
		method = "canBeLeashed",
		at = @At("RETURN")
	)
	private boolean modifyCanBeLeashed(boolean original) {
		return true;
	}
}