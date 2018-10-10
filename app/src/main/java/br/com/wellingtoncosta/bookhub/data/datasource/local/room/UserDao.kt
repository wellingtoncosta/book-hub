package br.com.wellingtoncosta.bookhub.data.datasource.local.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import io.reactivex.Maybe
import io.reactivex.Observable

/**
 * @author Wellington Costa on 10/10/18.
 */
@Dao interface UserDao {

    @Insert fun insert(userEntity: UserEntity): Long

    @Query("SELECT * FROM tb_user WHERE id = :id")
    fun getById(id: Long): Maybe<UserEntity>

    @Delete fun delete(userEntity: UserEntity): Unit

}