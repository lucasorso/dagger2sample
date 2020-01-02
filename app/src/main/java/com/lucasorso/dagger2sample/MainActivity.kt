package com.lucasorso.dagger2sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lucasorso.dagger2sample.comp.DaggerMagicBoxComponent
import com.lucasorso.dagger2sample.data.Car
import com.lucasorso.dagger2sample.data.Info
import com.lucasorso.dagger2sample.data.Motrocycle
import com.lucasorso.dagger2sample.modules.BagModule
import com.lucasorso.dagger2sample.modules.VehicleModule
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