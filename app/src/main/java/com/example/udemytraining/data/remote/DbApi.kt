package com.example.udemytraining.data.remote

import com.example.udemytraining.domain.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DbApi {

    @GET("/db/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    @GET("/db/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ): ApiResponse

}