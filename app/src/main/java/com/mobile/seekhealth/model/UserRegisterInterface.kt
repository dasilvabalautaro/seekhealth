package com.mobile.seekhealth.model


interface UserRegisterInterface {
    fun isSignedIn(): Boolean
    fun createAccount(email: String, password: String, name: String): String
    fun signIn(email: String, password: String): String
    fun signOut()
    fun finish()
}