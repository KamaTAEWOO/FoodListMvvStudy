package com.dk.foodlistmvvstudy.repository

import com.dk.foodlistmvvstudy.model.FoodEntity
import com.dk.foodlistmvvstudy.service.FoodService
import javax.inject.Inject

class FoodRepositoryImpl @Inject constructor(
    private val foodService: FoodService
) : FoodRepository {

    override suspend fun getFoodList(): List<FoodEntity> = foodService.getFoodList().data
}

// 1번 방법 (Food Data Class 사용)
//    override suspend fun getFoodList(): List<FoodEntity> {
////        foodService.getFoodList().data.also { list ->
////             list.map { it.toRequest() } // FoodEntity -> Food 전달만 함.!
////        }
//        return foodService.getFoodList().data
//    }