package com.example.udemytraining.di

import androidx.paging.ExperimentalPagingApi
import com.example.udemytraining.data.local.DragonBallDataBase
import com.example.udemytraining.data.remote.DbApi
import com.example.udemytraining.data.repository.RemoteDataSourceImpl
import com.example.udemytraining.domain.repository.RemoteDataSource
import com.example.udemytraining.util.Constants.BASE_URL
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@ExperimentalPagingApi
@ExperimentalSerializationApi
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.MINUTES)
            .connectTimeout(15, TimeUnit.MINUTES)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(okHttpClient: OkHttpClient): Retrofit {
        val contentType = MediaType.get("application/json")
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()
    }

    @Provides
    @Singleton
    fun provideDbApi(retrofit: Retrofit): DbApi {
        return retrofit.create(DbApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRemoteDataSource(
        dbApi: DbApi, dragonBallDataBase: DragonBallDataBase
    ): RemoteDataSource {
        return RemoteDataSourceImpl(
            dbApi = dbApi,
            dbDatabase = dragonBallDataBase
        )
    }
}