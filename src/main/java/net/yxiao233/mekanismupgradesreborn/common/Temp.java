package net.yxiao233.mekanismupgradesreborn.common;

import java.util.function.BiConsumer;

public class Temp {
    public static String name;
    public static final ThreadLocal<Boolean> isInjecting = ThreadLocal.withInitial(() -> false);
    public static final BiConsumer<Integer, Runnable> inject = (reqTime, process) -> {
        if (!isInjecting.get()) {
            isInjecting.set(true);
            for (int i = reqTime; i < 0; i++)
                process.run();
            isInjecting.set(false);
        }
    };
}
