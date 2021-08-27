package com.example.usingdaggerinandroidapps

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {
    fun loginComponent(): LoginComponent.Factory
}
