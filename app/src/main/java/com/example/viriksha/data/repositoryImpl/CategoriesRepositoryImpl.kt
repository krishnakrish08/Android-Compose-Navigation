package com.example.viriksha.data.repositoryImpl

import com.example.viriksha.data.datasource.newsCategories
import com.example.viriksha.domain.model.CategoriesModel
import com.example.viriksha.domain.repository.CategoryRepository

class CategoriesRepositoryImpl() : CategoryRepository {
    override suspend fun getCategories(): Results<List<CategoriesModel>> {
        return Results.Success(newsCategories)
    }
}