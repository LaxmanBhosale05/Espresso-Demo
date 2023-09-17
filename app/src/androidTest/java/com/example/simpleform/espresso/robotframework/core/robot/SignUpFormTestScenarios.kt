package com.example.simpleform.espresso.robotframework.core.robot

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.simpleform.MainActivity
import com.example.simpleform.R
import com.example.simpleform.espresso.helper.SignUpFormTestData
import org.junit.Rule
import org.junit.Test

class SignUpFormTestScenarios {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)
    private val signUpFormTestData = SignUpFormTestData()

    @Test
    fun verifyHappyPathForSignUpFlow() {
        signUp {

            setFirstName(signUpFormTestData.firstName)
            setLastName(signUpFormTestData.lastName)
            setEmailID(signUpFormTestData.email)
            setDateOfBirth(signUpFormTestData.dateOfBirth)
            setPassword(signUpFormTestData.password)
            checkPolicy("Agree ? Privacy & Policy")
            clickOnRegister("Register")
            assertTheText(signUpFormTestData.assertionTextValueOnResult)

        }
    }

    fun verifyErrorMessageFlow() {
        signUp {
            setFirstName(signUpFormTestData.firstName)
            clickOnRegister("Register")


        }
    }

}