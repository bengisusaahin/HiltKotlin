package com.bengisusahin.hiltkotlin

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
// Constructor injection
class Musician
    @Inject
    constructor(instrument: Instrument, band : Band) {
    fun sing(){
        println("La la la")
    }
}