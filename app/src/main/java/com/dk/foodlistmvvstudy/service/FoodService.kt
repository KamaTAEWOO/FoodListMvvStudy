package com.dk.foodlistmvvstudy.service

import com.dk.foodlistmvvstudy.network.FoodListResponse
import retrofit2.http.GET

interface FoodService {

    @GET("tasty.html?mode=json&addr=%EC%A4%91%EA%B5%AC")
    suspend fun getFoodList(): FoodListResponse
}