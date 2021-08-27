package com.example.usingdaggerinandroidapps

import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(loginActivity: LoginActivity)
    fun inject(loginUserNameFragment: LoginUserNameFragment)
    fun inject(loginPasswordFragment: LoginPasswordFragment)
}
