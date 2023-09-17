package com.example.simpleform.espresso.helper

data class SignUpFormTestData(
        val firstName: String = "Laxman",
        val lastName: String = "Bhosle",
        val email: String = "Laxman.bhosle@twks.com",
        val dateOfBirth: String= "05/05/2000",
        val password: String= "test1234",
        val assertionTextValueOnResult: String = "User is added Successfully"
)
data class Sign(
        val firstName: String = "q334"

)
