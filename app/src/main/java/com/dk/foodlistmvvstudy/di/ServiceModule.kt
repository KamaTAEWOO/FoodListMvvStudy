package com.dk.foodlistmvvstudy.di

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

    @Singleton
    @Provides
    fun providesFoodService(retrofit: Retrofit) : FoodService = retrofit.create(FoodService::class.java)
}