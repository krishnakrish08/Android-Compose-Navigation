package com.example.viriksha.data.repositoryImpl

import com.example.viriksha.data.datasource.news
import com.example.viriksha.domain.model.NewsModel
import com.example.viriksha.domain.repository.NewsRepository

class NewsRepositoryImpl() : NewsRepository {
    override suspend fun getNews(): Results<List<NewsModel>> {
        return Results.Success(news)
    }
}