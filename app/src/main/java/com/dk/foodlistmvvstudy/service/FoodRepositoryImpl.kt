package com.dk.foodlistmvvstudy.service

import com.dk.foodlistmvvstudy.mapper.FoodMapper.toRequest
import com.dk.foodlistmvvstudy.model.FoodEntity
import com.dk.foodlistmvvstudy.repository.FoodRepository
import javax.inject.Inject

class FoodRepositoryImpl @Inject constructor(
    private val foodService: FoodService
) : FoodRepository {

    override suspend fun getFoodList(): List<FoodEntity> {
        foodService.getFoodList().data.also { list ->
             list.map { it.toRequest() } // FoodEntity -> Food 전달만 함.!
        }

        return foodService.getFoodList().data
    }
}