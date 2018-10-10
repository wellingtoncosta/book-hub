package br.com.wellingtoncosta.bookhub.data.datasource.local.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * @author Wellington Costa on 10/10/18.
 */
@Database(entities = [UserEntity::class], version = AppDatabase.VERSION, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        const val VERSION = 1
    }

}