package com.dk.foodlistmvvstudy.network

import com.dk.foodlistmvvstudy.model.FoodEntity

data class FoodListResponse(
    val status: String,
    val total: Int,
    val data: List<FoodEntity>
)