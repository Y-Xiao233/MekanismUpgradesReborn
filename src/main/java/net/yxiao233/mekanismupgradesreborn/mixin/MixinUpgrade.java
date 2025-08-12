package net.yxiao233.mekanismupgradesreborn.mixin;

import mekanism.api.Upgrade;
import net.yxiao233.mekanismupgradesreborn.common.Temp;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = Upgrade.class)
public abstract class MixinUpgrade {
    @ModifyVariable(method = "<init>", at = @At("HEAD"), ordinal = 1, argsOnly = true)
    private static String getName(String s) {
        Temp.name = s;
        return s;
    }
    @ModifyVariable(method = "<init>", at = @At("HEAD"), ordinal = 1, argsOnly = true)
    private static int toFullStack(int i) {
        return Temp.name.equals("speed") || Temp.name.equals("energy") ? MixinPlugin.MAX_UPGRADE : i;
    }
}
