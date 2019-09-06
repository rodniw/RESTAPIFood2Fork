package dev.rodni.ru.restapifood2fork;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Ldev/rodni/ru/restapifood2fork/FoodToForkApplication;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "Companion", "presentation_debug"})
public final class FoodToForkApplication extends android.app.Application {
    private static final java.lang.String TAG = "FoodToForkApplication";
    public static final dev.rodni.ru.restapifood2fork.FoodToForkApplication.Companion Companion = null;
    
    /**
     * Versions of the platform prior to Android 5.0 (API level 21) use the Dalvik runtime for executing app code.
     * By default, Dalvik limits apps to a single classes.dex bytecode file per APK.
     * In order to get around this limitation, i add the multidex support library to project.
     */
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public FoodToForkApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/rodni/ru/restapifood2fork/FoodToForkApplication$Companion;", "", "()V", "TAG", "", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}