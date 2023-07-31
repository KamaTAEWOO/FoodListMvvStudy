package com.dk.foodlistmvvstudy.di.binds

import com.dk.foodlistmvvstudy.repository.FoodRepository
import com.dk.foodlistmvvstudy.repository.FoodRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindsFoodRepository(
        // Provides는 service로 받았지만, Binds는 Impl로 받음.
        foodRepositoryImpl: FoodRepositoryImpl
    ): FoodRepository

//    @Singleton
//    @Binds
//    abstract fun bindsFoodRepository(
//        foodService: FoodService
//    ): FoodRepository = FoodRepositoryImpl(foodService)
}