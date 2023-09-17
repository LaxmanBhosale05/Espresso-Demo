package com.example.simpleform.espresso.robotframework.core.robot

import com.example.simpleform.espresso.core.BaseTest
import com.example.simpleform.espresso.pages.SignUpFormLocators

fun signUp(func: SignUpFormRobot.() ->Unit) = SignUpFormRobot().apply(func)
class SignUpFormRobot : BaseTest(){

    fun setFirstName(firstName:String) = fillEditText(SignUpFormLocators.firstName,firstName)
    fun setLastName(lastName:String) = fillEditText(SignUpFormLocators.lastName,lastName)
    fun setEmailID(emailID:String) = fillEditText(SignUpFormLocators.emailID,emailID)
    fun setDateOfBirth(dateOfBirth:String) = fillEditText(SignUpFormLocators.dateOfBirth,dateOfBirth)
    fun setPassword(password:String) = fillEditText(SignUpFormLocators.password,password)

    fun checkPolicy(polictCheck:String) = clickOnButton(SignUpFormLocators.ppCheck)
    fun clickOnRegister(registerButton:String) = clickOnButton(SignUpFormLocators.registerButton)
    fun assertTheText(textTobeDisplayedOnResult : String) = matchText(SignUpFormLocators.allUsers,textTobeDisplayedOnResult)
}
