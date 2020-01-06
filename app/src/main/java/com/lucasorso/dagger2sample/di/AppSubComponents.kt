package com.lucasorso.dagger2sample.di

import com.lucasorso.dagger2sample.registration.RegistrationComponent
import dagger.Module
import dagger.Subcomponent

@Module(subcomponents = [RegistrationComponent::class])
class AppSubComponents {

}