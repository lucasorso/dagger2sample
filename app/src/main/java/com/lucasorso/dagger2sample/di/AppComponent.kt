package com.lucasorso.dagger2sample.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.lucasorso.dagger2sample.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
// Definição dos componente do Dagger.
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
    // Classes que podem ser injetadas por esse componente.
    fun inject(activity: MainActivity)

    fun registrationComponent(): RegistrationComponent.Factory
}