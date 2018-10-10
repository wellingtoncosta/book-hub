package br.com.wellingtoncosta.bookhub.data.datasource.local.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey

/**
 * @author Wellington Costa on 10/10/18.
 */
@Entity(
        tableName = "tb_user",
        indices = [Index("name")]
)
data class UserEntity(
        @PrimaryKey(autoGenerate = true) val id: Long? = null,
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "username") val username: String
)