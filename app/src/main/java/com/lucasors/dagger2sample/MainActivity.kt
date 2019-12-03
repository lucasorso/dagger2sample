package com.lucasors.dagger2sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var motorcycle: Motrocycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerMagicBoxComponent.create().pokeInject(this)
        DaggerMagicBoxComponent.builder()
            .bagModule(BagModule())
            .vehicleModule(VehicleModule("", ""))
            .build()
            .pokeInject(this)

        description.text = info.description
        carName.text = car.name
        motorcycleName.text = motorcycle.name

    }
}

class Info(val description: String)

class Car(brand: String, name: String) : VehicleModule(brand, name)

class Motrocycle(brand: String, name: String) : VehicleModule(brand, name)

@Component(modules = [BagModule::class, VehicleModule::class])
interface MagicBoxComponent {
    fun pokeInject(main: MainActivity)
}

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