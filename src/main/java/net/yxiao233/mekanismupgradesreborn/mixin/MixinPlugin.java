package net.yxiao233.mekanismupgradesreborn.mixin;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.toml.TomlParser;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.*;
import java.util.List;
import java.util.Set;

public class MixinPlugin implements IMixinConfigPlugin {
    public static int MAX_UPGRADE = 16;
    @Override
    public void onLoad(String s) {
        File configFile = new File("./config/mekanismupgradesreborn-common.toml");
        if(configFile.exists()){
            TomlParser parser = new TomlParser();
            try(FileInputStream stream = new FileInputStream(configFile)) {
                CommentedConfig config = parser.parse(stream);
                if(config.contains("max_upgrade")){
                    int max = config.getInt("max_upgrade");
                    if(max <= 0 || max > 64){
                        max = 16;
                    }
                    MAX_UPGRADE = max;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String s, String s1) {
        return true;
    }

    @Override
    public void acceptTargets(Set<String> set, Set<String> set1) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}
