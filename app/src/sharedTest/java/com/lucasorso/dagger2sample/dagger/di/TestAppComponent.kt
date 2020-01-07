package com.lucasorso.dagger2sample.dagger.di

import com.lucasorso.dagger2sample.di.AppComponent
import com.lucasorso.dagger2sample.di.AppSubComponents
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubComponents::class])
interface TestAppComponent : AppComponent