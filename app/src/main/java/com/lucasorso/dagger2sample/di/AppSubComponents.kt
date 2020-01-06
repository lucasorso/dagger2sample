package com.lucasorso.dagger2sample.di

import com.lucasorso.dagger2sample.login.LoginComponent
import com.lucasorso.dagger2sample.registration.RegistrationComponent
import com.lucasorso.dagger2sample.user.UserComponent
import dagger.Module

@Module(
    subcomponents = [
        RegistrationComponent::class,
        LoginComponent::class,
        UserComponent::class
    ]
)
class AppSubComponents