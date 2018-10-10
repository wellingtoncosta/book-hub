package br.com.wellingtoncosta.bookhub.di

import android.arch.persistence.room.Room
import android.content.Context
import br.com.wellingtoncosta.bookhub.data.datasource.local.TokenLocalDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.UserLocalDataSource
import br.com.wellingtoncosta.bookhub.data.datasource.local.prefs.Preferences
import br.com.wellingtoncosta.bookhub.data.datasource.local.room.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

/**
 * @author Wellington Costa on 09/10/18.
 */

val localModule = module {
    single { Preferences(androidContext()) }
    single { createRoomDatabase(androidContext()) }
    single { createUserDao(get()) }
    single { TokenLocalDataSource(get()) }
    single { UserLocalDataSource(get()) }
}

private fun createRoomDatabase(context: Context) = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "app-db"
).build()

private fun createUserDao(appDatabase: AppDatabase) = appDatabase.userDao()