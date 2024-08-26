package com.example.viriksha.domain.repository

import com.example.viriksha.data.repositoryImpl.Results
import com.example.viriksha.domain.model.NewsModel

interface NewsRepository {
    suspend fun getNews() : Results<List<NewsModel>>
}