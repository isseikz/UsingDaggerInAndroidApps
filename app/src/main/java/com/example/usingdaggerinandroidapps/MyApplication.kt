package com.example.usingdaggerinandroidapps

import android.app.Application

class MyApplication: Application() {
    val applicationComponent = DaggerApplicationComponent.create()
}
