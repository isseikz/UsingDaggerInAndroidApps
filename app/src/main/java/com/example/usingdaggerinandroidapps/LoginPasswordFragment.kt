package com.example.usingdaggerinandroidapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {
    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (activity as LoginActivity).loginComponent.inject(this)
        super.onCreate(savedInstanceState)
    }
}
