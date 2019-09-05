package dev.rodni.ru.restapifood2fork.internal.di.component

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import dev.rodni.ru.restapifood2fork.internal.di.ActivityBuilderModule
import dev.rodni.ru.restapifood2fork.internal.di.AppModule
import dev.rodni.ru.restapifood2fork.internal.di.DataModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class,
    DataModule::class
])
interface AppComponent {
}