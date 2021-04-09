package com.prerna.newsappkotlin.db

import androidx.room.TypeConverter
import com.prerna.newsappkotlin.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)
}