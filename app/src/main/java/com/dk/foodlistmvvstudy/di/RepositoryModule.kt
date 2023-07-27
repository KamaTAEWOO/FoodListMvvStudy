package com.dk.foodlistmvvstudy.di

import com.dk.foodlistmvvstudy.repository.FoodRepository
import com.dk.foodlistmvvstudy.repository.FoodRepositoryImpl
import com.dk.foodlistmvvstudy.service.FoodService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideContentRepository(
        foodService: FoodService
    ): FoodRepository = FoodRepositoryImpl(foodService)
}