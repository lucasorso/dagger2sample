package com.lucasorso.dagger2sample.di

import com.lucasorso.dagger2sample.registration.RegistrationComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class])
class AppSubComponents