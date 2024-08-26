package com.example.viriksha.ui.presentations.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viriksha.data.repositoryImpl.Results
import com.example.viriksha.domain.repository.CategoryRepository
import kotlinx.coroutines.launch

class HomeViewModel(
    private val categoryRepository: CategoryRepository,
) : ViewModel() {

    private val _homeScreenState = mutableStateOf(HomeScreenState())
    val homeScreenState: State<HomeScreenState> = _homeScreenState

    init {
        viewModelScope.launch {
            when (val result = categoryRepository.getCategories()) {
                is Results.Success -> _homeScreenState.value = homeScreenState.value.copy(
                    categoriesList = result.data,
                )

                is Results.Error -> {}
            }
        }
    }

    /*fun onEvent(event: HomeScreenEvent) {
        when(event) {
            is HomeScreenEvent.SelectCategory -> {
                viewModelScope.launch {
                    categoryRepository.getCategories()
                    event.onclick()
                }
            }
        }
    }*/
}