package com.lucasorso.dagger2sample.comp

import com.lucasorso.dagger2sample.MainActivity
import com.lucasorso.dagger2sample.modules.BagModule
import com.lucasorso.dagger2sample.modules.VehicleModule
import dagger.Component

@Component(modules = [BagModule::class, VehicleModule::class])
interface MagicBoxComponent {
    fun pokeInject(main: MainActivity)
}