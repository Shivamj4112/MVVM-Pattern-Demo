package com.appworld.mvvmpatterndemo.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.appworld.mvvmpatterndemo.R
import com.appworld.mvvmpatterndemo.databinding.ActivityLoginBinding
import com.appworld.mvvmpatterndemo.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this)[AuthViewModel::class.java]
        binding.viewModel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}