package com.example.udemytraining.di

import android.content.Context
import androidx.room.Room
import com.example.udemytraining.data.local.DragonBallDataBase
import com.example.udemytraining.util.Constants.DB_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        DragonBallDataBase::class.java,
        DB_DATABASE
    ).build()
}