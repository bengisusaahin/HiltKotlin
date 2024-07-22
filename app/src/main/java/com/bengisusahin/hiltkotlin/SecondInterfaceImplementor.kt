package com.bengisusahin.hiltkotlin

import javax.inject.Inject

class SecondInterfaceImplementor
@Inject
constructor() : MyInterface
{
    override fun myPrintFunction(): String {
        return "My Second interface implementor"
    }


}