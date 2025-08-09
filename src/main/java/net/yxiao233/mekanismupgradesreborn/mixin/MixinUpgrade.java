package net.yxiao233.mekanismupgradesreborn.mixin;

import mekanism.api.Upgrade;
import net.yxiao233.mekanismupgradesreborn.Config;
import net.yxiao233.mekanismupgradesreborn.common.Temp;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Upgrade.class)
public abstract class MixinUpgrade {
    @ModifyVariable(method = "<init>", at = @At("HEAD"), ordinal = 1, argsOnly = true)
    private static String getName(String s) {
        Temp.name = s;
        return s;
    }

    @Inject(method = "getMax", at = @At("RETURN"), cancellable = true, remap = false)
    private void mekanismupgradesreborn$getMax(CallbackInfoReturnable<Integer> cir){
        cir.setReturnValue(Config.maxUpgrade);
    }
}
