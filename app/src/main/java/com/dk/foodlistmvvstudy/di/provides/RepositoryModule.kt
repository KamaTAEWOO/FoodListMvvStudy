package com.dk.foodlistmvvstudy.di.provides

import com.dk.foodlistmvvstudy.repository.FoodRepository
import com.dk.foodlistmvvstudy.repository.FoodRepositoryImpl
import com.dk.foodlistmvvstudy.service.FoodService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@Module
//@InstallIn(SingletonComponent::class) // 원래 ViewModelComponent였는데 SingletonComponent로 변경함.
//                                      // ViewModelComponent는 ViewModel의 생명주기가 시작될 때마다 생성해줘야함. 하지만 SigletonComponent는 앱이 실행될 때 한번만 생성됨.
//object RepositoryModule {
//
//    @Provides
//    @Singleton
//    fun provideContentRepository(
//        foodService: FoodService
//    ): FoodRepository = FoodRepositoryImpl(foodService)
//}