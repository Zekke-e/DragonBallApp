package com.example.udemytraining.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.udemytraining.data.local.DragonBallDataBase
import com.example.udemytraining.data.paging_source.HeroRemoteMediator
import com.example.udemytraining.data.remote.DbApi
import com.example.udemytraining.domain.model.Hero
import com.example.udemytraining.domain.repository.RemoteDataSource
import com.example.udemytraining.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val dbApi: DbApi,
    private val dbDatabase: DragonBallDataBase
) : RemoteDataSource {

    private val heroDao = dbDatabase.heroDao()
    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                dbApi = dbApi,
                dragonBallDataBase = dbDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }
}