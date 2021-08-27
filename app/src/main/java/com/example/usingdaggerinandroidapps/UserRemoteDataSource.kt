package com.example.usingdaggerinandroidapps

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val module: LoginRetrofitService
) {
}
