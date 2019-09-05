package dev.rodni.ru.restapifood2fork.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J5\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0012"}, d2 = {"Ldev/rodni/ru/restapifood2fork/navigation/Navigator;", "", "()V", "getEvent", "", "activity", "Landroid/app/Activity;", "navigateToEvent", "", "event", "sharedViews", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "(Landroid/app/Activity;I[Landroidx/core/util/Pair;)V", "navigateToHome", "Companion", "presentation_debug"})
public final class Navigator {
    private static final java.lang.String EXTRA_EVENT = null;
    public static final dev.rodni.ru.restapifood2fork.navigation.Navigator.Companion Companion = null;
    
    public final void navigateToHome(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void navigateToEvent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int event, @org.jetbrains.annotations.NotNull()
    androidx.core.util.Pair<android.view.View, java.lang.String>[] sharedViews) {
    }
    
    public final int getEvent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return 0;
    }
    
    public Navigator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/rodni/ru/restapifood2fork/navigation/Navigator$Companion;", "", "()V", "EXTRA_EVENT", "", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}