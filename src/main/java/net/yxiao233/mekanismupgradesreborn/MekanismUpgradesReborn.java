package net.yxiao233.mekanismupgradesreborn;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(MekanismUpgradesReborn.MODID)
public class MekanismUpgradesReborn{
    public static final String MODID = "mekanismupgradesreborn";
    @SuppressWarnings("removal")
    public MekanismUpgradesReborn() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SPEC);
    }
}
