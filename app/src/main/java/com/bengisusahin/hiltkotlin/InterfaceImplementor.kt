package com.bengisusahin.hiltkotlin

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My interface implementor"
    }
}