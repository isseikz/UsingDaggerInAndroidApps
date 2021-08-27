package com.example.usingdaggerinandroidapps

import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) {
}
