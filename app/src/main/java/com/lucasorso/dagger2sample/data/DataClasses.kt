package com.lucasorso.dagger2sample.data

import com.lucasorso.dagger2sample.modules.VehicleModule

class Info(val description: String)

class Car(brand: String, name: String) : VehicleModule(brand, name)

class Motrocycle(brand: String, name: String) : VehicleModule(brand, name)