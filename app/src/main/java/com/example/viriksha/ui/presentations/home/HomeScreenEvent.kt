package com.example.viriksha.ui.presentations.home

import com.example.viriksha.domain.model.CategoriesModel

sealed class HomeScreenEvent {
    data class SelectCategory(val categoriesModel: CategoriesModel, val onclick: () -> Unit) :
        HomeScreenEvent()
}