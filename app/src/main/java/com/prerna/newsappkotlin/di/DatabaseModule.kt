package com.prerna.newsappkotlin.di

import android.content.Context
import androidx.room.Room
import com.prerna.newsappkotlin.db.ArticleDatabase
import com.prerna.newsappkotlin.util.Constant.Companion.NEWS_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideArticleDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, ArticleDatabase::class.java, NEWS_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideArticleDao(db: ArticleDatabase) = db.getArticleDao()
}