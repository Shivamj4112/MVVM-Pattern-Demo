package com.appworld.mvvmpatterndemo.ui.auth

import android.view.View
import androidx.core.view.TintableBackgroundView
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null

    var authListener : AuthListener? = null

    fun onLoginButtonClicked(view: View){
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Email or Password is empty")
            return
        }
        authListener?.onSuccess()
    }

}