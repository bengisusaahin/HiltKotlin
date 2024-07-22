package com.bengisusahin.hiltkotlin

import javax.inject.Inject

class ClassExample
@Inject
constructor(@FirstImplementor private val myInterfaceImplementor: MyInterface,
    @SecondImplementor private val mySsecondInterfaceImplementor: MyInterface)
{
    fun myFunction() : String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun mySecondFunction() : String {
        return "Working: ${mySsecondInterfaceImplementor.myPrintFunction()}"
    }
}