package com.dk.foodlistmvvstudy.di.provides

import com.dk.foodlistmvvstudy.service.FoodService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    // 구현할 것이 있다면 Provides가 맞음, 그냥 객체를 제공해주는 것이라면 Binds가 맞음.
    @Singleton
    @Provides
    fun providesFoodService(retrofit: Retrofit) : FoodService = retrofit.create(FoodService::class.java)
}