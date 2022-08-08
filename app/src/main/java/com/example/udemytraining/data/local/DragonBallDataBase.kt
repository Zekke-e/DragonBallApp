package com.example.udemytraining.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.udemytraining.data.local.dao.HeroDao
import com.example.udemytraining.data.local.dao.HeroRemoteKeyDao
import com.example.udemytraining.domain.model.Hero
import com.example.udemytraining.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class DragonBallDataBase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}