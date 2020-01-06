package com.lucasorso.dagger2sample.user

import com.lucasorso.dagger2sample.main.MainActivity
import com.lucasorso.dagger2sample.settings.SettingsActivity
import dagger.Subcomponent

@LoggedUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)

    fun inject(activity: SettingsActivity)
}