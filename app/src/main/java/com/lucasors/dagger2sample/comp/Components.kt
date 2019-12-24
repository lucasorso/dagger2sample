package com.lucasors.dagger2sample.comp

import com.lucasors.dagger2sample.MainActivity
import com.lucasors.dagger2sample.modules.BagModule
import com.lucasors.dagger2sample.modules.VehicleModule
import dagger.Component

@Component(modules = [BagModule::class, VehicleModule::class])
interface MagicBoxComponent {
    fun pokeInject(main: MainActivity)
}