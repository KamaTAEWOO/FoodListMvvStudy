package com.dk.foodlistmvvstudy.repository

import com.dk.foodlistmvvstudy.model.FoodEntity

interface FoodRepository {

    suspend fun getFoodList(): List<FoodEntity>
}