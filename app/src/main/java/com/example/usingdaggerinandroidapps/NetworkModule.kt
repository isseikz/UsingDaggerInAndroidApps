package com.example.usingdaggerinandroidapps

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideLoginRetrofitService(): LoginRetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(LoginService::class.java)
    }
}
