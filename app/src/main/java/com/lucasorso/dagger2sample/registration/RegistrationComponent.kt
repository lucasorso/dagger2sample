package com.lucasorso.dagger2sample.registration

import com.lucasorso.dagger2sample.registration.enterdetails.EnterDetailsFragment
import com.lucasorso.dagger2sample.registration.termsandconditions.TermsAndConditionsFragment
import com.lucasorso.dagger2sample.di.ActivityScope
import dagger.Subcomponent

// Scope annotation é preciso
// Classes annotated with @ActivityScope will have a unique instance in this Component
@ActivityScope
@Subcomponent
interface RegistrationComponent {
    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}