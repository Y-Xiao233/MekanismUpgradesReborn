package net.yxiao233.mekanismupgradesreborn;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MekanismUpgradesReborn.MODID)
public class MekanismUpgradesReborn{
    public static final String MODID = "mekanismupgradesreborn";
    public static final Logger LOGGER = LogManager.getLogger("MekanismUpgradeReborn");
    @SuppressWarnings("removal")
    public MekanismUpgradesReborn() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
