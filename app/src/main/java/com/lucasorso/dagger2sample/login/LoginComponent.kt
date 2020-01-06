package com.lucasorso.dagger2sample.login

import com.lucasorso.dagger2sample.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    // Classe que sera injetada por esse componente
    fun inject(activity: LoginActivity)
}