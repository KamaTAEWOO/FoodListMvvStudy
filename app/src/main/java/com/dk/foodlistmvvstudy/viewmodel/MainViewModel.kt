package com.dk.foodlistmvvstudy.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dk.foodlistmvvstudy.repository.FoodRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val foodRepository: FoodRepository
) : ViewModel() {

    val foodListData = MutableLiveData<String>()

    fun getFoodList() {
        viewModelScope.launch {
            foodListData.value = foodRepository.getFoodList().toString()
        }
    }
}