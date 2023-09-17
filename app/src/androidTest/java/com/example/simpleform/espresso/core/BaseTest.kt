package com.example.simpleform.espresso.core

import android.view.View
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Matcher
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
open class BaseTest {

    fun fillEditText(viewInteraction: ViewInteraction, text: String): ViewInteraction =
            viewInteraction.perform(ViewActions.typeText(text), ViewActions.closeSoftKeyboard())


    fun clickOnButton(viewInteraction: ViewInteraction): ViewInteraction =
            viewInteraction.perform(ViewActions.click())

    fun matchText(viewInteraction: ViewInteraction, text: String)
            : ViewInteraction = viewInteraction.check(ViewAssertions.matches(ViewMatchers.withText(text)))
}