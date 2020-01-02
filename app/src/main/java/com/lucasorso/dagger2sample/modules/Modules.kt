package com.lucasorso.dagger2sample.modules

import com.lucasorso.dagger2sample.data.Car
import com.lucasorso.dagger2sample.data.Info
import com.lucasorso.dagger2sample.data.Motrocycle
import dagger.Module
import dagger.Provides

@Module
class BagModule {

    @Provides
    fun sayLoveDagger(): Info {
        return Info("Love Dagger 2")
    }
}

@Module
open class VehicleModule(val brand: String, val name: String) {

    /* @Provides
     fun getPolo(): Car {
         return Car("Volkswagen", "Polo")
     }*/

    @Provides
    fun getSandero(): Car {
        return Car("Renault", "Sandero")
    }

    @Provides
    fun getHarley(): Motrocycle {
        return Motrocycle("Harley-Davidson", "Iron 883")
    }
}