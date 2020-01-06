package com.lucasorso.dagger2sample.di

import android.content.Context
import com.lucasorso.dagger2sample.user.UserManager
import com.lucasorso.dagger2sample.login.LoginComponent
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

    fun userManager(): UserManager

    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent(): LoginComponent.Factory
}