package com.prerna.newsappkotlin.repository

import com.prerna.newsappkotlin.db.ArticleDao
import com.prerna.newsappkotlin.model.Article

import javax.inject.Inject

class LocaleRepository @Inject constructor(val db: ArticleDao) : BaseRepository() {

    suspend fun insertNewsToDb(article: Article) = db.insertArticle(article)

    suspend fun deleteNews(article: Article) = db.deleteArticle(article)

    fun getSavedNews() = db.getSavedArticles()
}