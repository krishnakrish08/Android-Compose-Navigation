package com.example.viriksha.domain.repository

import com.example.viriksha.data.repositoryImpl.Results
import com.example.viriksha.domain.model.CategoriesModel

interface CategoryRepository {
    suspend fun getCategories(): Results<List<CategoriesModel>>
}