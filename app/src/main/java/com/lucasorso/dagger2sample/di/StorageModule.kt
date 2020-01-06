package com.lucasorso.dagger2sample.di

import android.content.SharedPreferences
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

// Quando se usa @Binds é preciso que classe seja abstrata.
@Module
abstract class StorageModule {

    // Faz com o que o Dagger forceça um SharedPreferencesStorage quando Storage é solicitado.
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}