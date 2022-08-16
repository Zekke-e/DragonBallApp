package com.example.udemytraining.data.repository

import androidx.paging.PagingData
import com.example.udemytraining.domain.model.Hero
import com.example.udemytraining.domain.repository.DataStoreOperations
import com.example.udemytraining.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {

    fun getAllHeroes():Flow<PagingData<Hero>>{
        return remote.getAllHeroes()
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }
}