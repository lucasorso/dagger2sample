package com.lucasorso.dagger2sample.dagger.di

import com.lucasorso.dagger2sample.dagger.storage.FakeStorage
import com.lucasorso.dagger2sample.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule {

    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}