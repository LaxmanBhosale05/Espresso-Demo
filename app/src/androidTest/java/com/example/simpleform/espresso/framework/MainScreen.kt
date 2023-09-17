package com.example.simpleform.espresso.framework

import com.example.simpleform.espresso.core.BaseTest

class MainScreen : BaseTest() {
}

fun mainScreen(func: MainScreen. () -> Unit) = MainScreen().apply { func() }